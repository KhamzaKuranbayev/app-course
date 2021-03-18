package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.CompanyCategory;

import java.util.List;

@Service
public interface CompanyCategoryService {

    Result save(CompanyCategory companyCategory);                 // CREATE

    List<CompanyCategory> findAll();                              // READ

    CompanyCategory findById(Integer id);                         // READ ONE

    Result update(CompanyCategory companyCategory, Integer id);   // UPDATE

    Result delete(Integer id);                                    // DELETE

}
