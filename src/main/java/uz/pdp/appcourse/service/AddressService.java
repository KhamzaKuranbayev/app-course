package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.AddressDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Address;

import java.util.List;

@Service
public interface AddressService {

    Result save(AddressDTO addressDTO);                 // CREATE

    List<Address> findAll();                            // READ

    Address findById(Integer id);                       // READ ONE

    Result update(AddressDTO addressDTO, Integer id);   // UPDATE

    Result delete(Integer id);                          // DELETE

}
