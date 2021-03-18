package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.AddressDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Address;
import uz.pdp.appcourse.entity.District;
import uz.pdp.appcourse.repository.AddressRepository;
import uz.pdp.appcourse.repository.DistrictRepository;

import java.util.List;
import java.util.Optional;

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
        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setHome(addressDTO.getHome());

        Optional<District> optionalDistrict = districtRepository.findById(addressDTO.getDistrictId());
        if(!optionalDistrict.isPresent())
            return new Result("District not found", false);

        address.setDistrict(optionalDistrict.get());
        addressRepository.save(address);
        return new Result("Address saved!", true);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findById(Integer id) {
        return addressRepository.findById(id).get();
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
