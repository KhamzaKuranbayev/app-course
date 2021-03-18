package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Address;
import uz.pdp.appcourse.entity.Region;

import java.util.List;

@Service
public interface RegionService {

    Result save(Region region);

    List<Region> findAll();                             // READ

    Address findById(Integer id);                       // READ ONE

    Result update(Region region, Integer id);           // UPDATE

    Result delete(Integer id);                          // DELETE
}
