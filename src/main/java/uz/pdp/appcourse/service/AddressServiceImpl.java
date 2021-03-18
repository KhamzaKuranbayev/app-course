package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.AddressDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Address;
import uz.pdp.appcourse.repository.AddressRepository;
import uz.pdp.appcourse.repository.DistrictRepository;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    final AddressRepository addressRepository;
    final DistrictRepository districtRepository;

    public AddressServiceImpl(AddressRepository addressRepository,
                              DistrictRepository districtRepository) {
        this.addressRepository = addressRepository;
        this.districtRepository = districtRepository;
    }

    @Override
    public Result save(AddressDTO addressDTO) {
        return null;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Integer id) {
        return null;
    }

    @Override
    public Result update(AddressDTO addressDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
