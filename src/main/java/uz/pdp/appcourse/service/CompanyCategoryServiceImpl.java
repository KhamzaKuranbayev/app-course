package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.CompanyCategory;
import uz.pdp.appcourse.repository.CompanyCategoryRepository;

import java.util.List;

@Service
public class CompanyCategoryServiceImpl implements CompanyCategoryService{

    final CompanyCategoryRepository companyCategoryRepository;

    public CompanyCategoryServiceImpl(CompanyCategoryRepository companyCategoryRepository) {
        this.companyCategoryRepository = companyCategoryRepository;
    }

    @Override
    public Result save(CompanyCategory companyCategory) {
        if(companyCategoryRepository.existsByName(companyCategory.getName()))
            return new Result("This category is already exists!", false);
        return null;
    }

    @Override
    public List<CompanyCategory> findAll() {
        return null;
    }

    @Override
    public CompanyCategory findById(Integer id) {
        return null;
    }

    @Override
    public Result update(CompanyCategory companyCategory, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
