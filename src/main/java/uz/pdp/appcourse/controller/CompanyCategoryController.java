package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.CompanyCategory;
import uz.pdp.appcourse.service.CompanyCategoryService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.COMPANY_CATEGORIES)
public class CompanyCategoryController {

    private final CompanyCategoryService companyCategoryService;

    public CompanyCategoryController(CompanyCategoryService companyCategoryService) {
        this.companyCategoryService = companyCategoryService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody CompanyCategory companyCategory){
        Result save = companyCategoryService.save(companyCategory);
        return save;
    }

    // READ
    @GetMapping()
    public List<CompanyCategory> findAll(){
        List<CompanyCategory> companyCategories = companyCategoryService.findAll();
        return companyCategories;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public CompanyCategory findById(@PathVariable Integer id){
        CompanyCategory companyCategory = companyCategoryService.findById(id);
        return companyCategory;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody CompanyCategory companyCategory, @PathVariable Integer id){
        Result update = companyCategoryService.update(companyCategory, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = companyCategoryService.delete(id);
        return delete;
    }
}
