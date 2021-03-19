package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CompanyDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.response.ResponseCompany;
import uz.pdp.appcourse.entity.Company;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.repository.*;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    final CompanyRepository companyRepository;
    final UserRepository userRepository;
    final AddressRepository addressRepository;
    final ContactRepository contactRepository;
    final CompanyCategoryRepository companyCategoryRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository, UserRepository userRepository,
                              AddressRepository addressRepository, ContactRepository contactRepository,
                              CompanyCategoryRepository companyCategoryRepository) {
        this.companyRepository = companyRepository;
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.contactRepository = contactRepository;
        this.companyCategoryRepository = companyCategoryRepository;
    }

    @Override
    public Result save(CompanyDTO companyDTO) {

        return null;
    }

    @Override
    public List<Company> findAll() {
        return null;
    }

    @Override
    public Company findById(Integer id) {
        return null;
    }

    @Override
    public Result update(CompanyDTO companyDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }

    @Override
    public List<ResponseCompany> findAllByCategoryAndAddress(String region, String course) {
        return companyRepository.findAllByCategoryAndAddress(region, course);
    }
}
