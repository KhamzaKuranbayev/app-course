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

    @Override
    public Result save(Region region) {
        return null;
    }

    @Override
    public List<Region> findAll() {
        return null;
    }

    @Override
    public Region findById(Integer id) {
        return null;
    }

    @Override
    public Result update(Region region, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
