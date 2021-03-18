package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.DistrictDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.District;
import uz.pdp.appcourse.service.DistrictService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.DISTRICTS)
public class DistrictController {

    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody DistrictDTO districtDTO){
        Result save = districtService.save(districtDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<District> findAll(){
        List<District> districts = districtService.findAll();
        return districts;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public District findById(@PathVariable Integer id){
        District district = districtService.findById(id);
        return district;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody DistrictDTO districtDTO, @PathVariable Integer id){
        Result update = districtService.update(districtDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = districtService.delete(id);
        return delete;
    }
}
