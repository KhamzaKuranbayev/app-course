package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.DistrictDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.District;
import uz.pdp.appcourse.entity.Region;
import uz.pdp.appcourse.repository.DistrictRepository;
import uz.pdp.appcourse.repository.RegionRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DistrictServiceImpl implements DistrictService {

    final DistrictRepository districtRepository;
    final RegionRepository regionRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository, RegionRepository regionRepository) {
        this.districtRepository = districtRepository;
        this.regionRepository = regionRepository;
    }

    //CREATE
    @Override
    public Result save(DistrictDTO districtDTO) {
        if (districtRepository.findByName(districtDTO.getName()).isPresent()) {
            return new Result("Region nomi takrorlandi", false);
        } else if (regionRepository.existsById(districtDTO.getRegionId())) {
            District outDistrict = new District();
            outDistrict.setName(districtDTO.getName());
            outDistrict.setCode(generateUUIDCode());
            outDistrict.setRegion(regionRepository.getOne(districtDTO.getRegionId()));
            districtRepository.save(outDistrict);
            return new Result("District qo'shildi", true);
        } else {
            return new Result("Bunday idli region yo'q", false);
        }
    }

    //READ
    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }

    //READ BY ID
    @Override
    public District findById(Integer id) {
        if (districtRepository.existsById(id)) {
            return districtRepository.getOne(id);
        } else {
            return new District();
        }
    }

    //UPDATE
    @Override
    public Result update(DistrictDTO districtDTO, Integer id) {
        if (districtRepository.existsById(id)) {
            District outDistrict = districtRepository.getOne(id);
            outDistrict.setName(districtDTO.getName());
            districtRepository.save(outDistrict);
            return new Result("District o'zgartirildi", true);
        }
        return new Result("Bunday idli District yo'q", false);
    }

    //DELETE
    @Override
    public Result delete(Integer id) {
        if (regionRepository.existsById(id)) {
            regionRepository.deleteById(id);
            return new Result("O'chirildi", true);
        } else {
            return new Result("Bunday idli region yo'q", false);
        }
    }

    public static String generateUUIDCode() {
        return UUID.randomUUID().toString();
    }
}
