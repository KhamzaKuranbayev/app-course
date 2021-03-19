package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.CompanyDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.Company;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.COMPANIES)
public class CompanyController {

    private final CompanyService companyService;



    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody CompanyDTO companyDTO){
        Result save = companyService.save(companyDTO);
        return save;
    }




    // READ
    @GetMapping()
    public List<Company> findAll(){
        List<Company> companies = companyService.findAll();
        return companies;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Company findById(@PathVariable Integer id){
        Company company = companyService.findById(id);
        return company;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody CompanyDTO companyDTO, @PathVariable Integer id){
        Result update = companyService.update(companyDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = companyService.delete(id);
        return delete;
    }
}
