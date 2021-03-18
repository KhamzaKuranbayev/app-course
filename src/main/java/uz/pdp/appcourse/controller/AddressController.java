package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.AddressDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.Address;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.service.AddressService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.ADDRESSES)
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody AddressDTO addressDTO){
        Result save = addressService.save(addressDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<Address> findAll(){
        List<Address> addresses = addressService.findAll();
        return addresses;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Address findById(@PathVariable Integer id){
        Address address = addressService.findById(id);
        return address;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody AddressDTO addressDTO, @PathVariable Integer id){
        Result update = addressService.update(addressDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = addressService.delete(id);
        return delete;
    }
}
