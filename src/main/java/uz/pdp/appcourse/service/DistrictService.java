package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.DistrictDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Address;
import uz.pdp.appcourse.entity.District;

import java.util.List;

@Service
public interface DistrictService {

    Result save(DistrictDTO districtDTO);                  // CREATE

    List<District> findAll();                              // READ

    District findById(Integer id);                          // READ ONE

    Result update(DistrictDTO districtDTO, Integer id);    // UPDATE

    Result delete(Integer id);                             // DELETE
}
