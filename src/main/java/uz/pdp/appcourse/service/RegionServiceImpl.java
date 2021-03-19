package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Region;
import uz.pdp.appcourse.repository.RegionRepository;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{

    final RegionRepository regionRepository;

    public RegionServiceImpl(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    //CREATE
    @Override
    public Result save(Region region) {
        if (regionRepository.findByName(region.getName()).isPresent()){
            return new Result("Region nomi takrorlandi", false);
        }else {
            region.setCode(DistrictServiceImpl.generateUUIDCode());
            regionRepository.save(region);
            return new Result("Yangi region qo'shildi", true);
        }
    }

    //READ
    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    //READ BY ID
    @Override
    public Region findById(Integer id) {
        return regionRepository.findById(id).orElse(new Region());
    }

    //UPDATE
    @Override
    public Result update(Region region, Integer id) {
       if (regionRepository.existsById(id)){
           if (regionRepository.findByName(region.getName()).isPresent()){
               return new Result("Region nomi takrorlandi", false);
           }else {
               Region outRegion = regionRepository.getOne(id);
               outRegion.setName(region.getName());
               regionRepository.save(outRegion);
               return new Result("Region o'zgartirildi", true);
           }
       }else {
           return new Result("Bunday idli region  yo'q", false);
       }
    }

    //DELETE
    @Override
    public Result delete(Integer id) {
        if (regionRepository.existsById(id)){
            regionRepository.deleteById(id);
            return new Result("O'chirildi", true);
        }else {
            return new Result("Bunday idli region yo'q", false);
        }
    }


}
