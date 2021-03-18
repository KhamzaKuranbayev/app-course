package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.Region;
import uz.pdp.appcourse.service.RegionService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.REGIONS)
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody Region region){
        Result save = regionService.save(region);
        return save;
    }

    // READ
    @GetMapping()
    public List<Region> findAll(){
        List<Region> users = regionService.findAll();
        return users;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Region findById(@PathVariable Integer id){
        Region region = regionService.findById(id);
        return region;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody Region region, @PathVariable Integer id){
        Result update = regionService.update(region, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = regionService.delete(id);
        return delete;
    }
}
