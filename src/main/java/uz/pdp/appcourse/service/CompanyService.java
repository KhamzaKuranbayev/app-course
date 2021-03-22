package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CompanyDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.response.ResponseCompany;
import uz.pdp.appcourse.entity.Company;

import java.util.List;

@Service
public interface CompanyService {

    Result save(CompanyDTO companyDTO);                 // CREATE

    List<Company> findAll();                            // READ

    Company findById(Integer id);                       // READ ONE

    Result update(CompanyDTO companyDTO, Integer id);   // UPDATE

    Result delete(Integer id);                           // DELETE

    List<ResponseCompany> findAllByCategoryAndAddress(String region, String courseCategory);

    List<ResponseCompany> findAllByCourseName(String courseName);

}
