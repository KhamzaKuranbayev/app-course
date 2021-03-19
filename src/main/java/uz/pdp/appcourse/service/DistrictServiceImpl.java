package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.DistrictDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.District;
import uz.pdp.appcourse.repository.DistrictRepository;
import uz.pdp.appcourse.repository.RegionRepository;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    final DistrictRepository districtRepository;
    final RegionRepository regionRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository, RegionRepository regionRepository) {
        this.districtRepository = districtRepository;
        this.regionRepository = regionRepository;
    }

    @Override
    public Result save(DistrictDTO districtDTO) {
        return null;
    }

    @Override
    public List<District> findAll() {
        return null;
    }

    @Override
    public District findById(Integer id) {
        return null;
    }

    @Override
    public Result update(DistrictDTO districtDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
