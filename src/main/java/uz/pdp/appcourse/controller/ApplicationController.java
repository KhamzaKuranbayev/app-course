package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.ApplicationDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.Application;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.service.ApplicationService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.APPLICATIONS)
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody ApplicationDTO applicationDTO){
        Result save = applicationService.save(applicationDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<Application> findAll(){
        List<Application> applications = applicationService.findAll();
        return applications;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Application findById(@PathVariable Integer id){
        Application application = applicationService.findById(id);
        return application;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody ApplicationDTO applicationDTO, @PathVariable Integer id){
        Result update = applicationService.update(applicationDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = applicationService.delete(id);
        return delete;
    }
}
