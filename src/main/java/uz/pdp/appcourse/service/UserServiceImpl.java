package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.Address;
import uz.pdp.appcourse.entity.Role;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.repository.AddressRepository;
import uz.pdp.appcourse.repository.RoleRepository;
import uz.pdp.appcourse.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    // DI - Dependency Injection
    final UserRepository userRepository;
    final AddressRepository addressRepository;
    final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository,
                           AddressRepository addressRepository,
                           RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public Result save(UserDTO userDTO) {
        if(userRepository.existsByPhone(userDTO.getPhone()))
            return new Result("Phone number is already exists!", false);

        User user = new User();
        user.setFullName(userDTO.getFullName());
        user.setAge(userDTO.getAge());
        user.setPhone(userDTO.getPhone());

        Optional<Address> optionalAddress = addressRepository.findById(userDTO.getAddressId());
        if(!optionalAddress.isPresent())
            return new Result("Address not found!", false);
        user.setAddress(optionalAddress.get());

        Optional<Role> optionalRole = roleRepository.findById(userDTO.getRoleId());
        if(!optionalRole.isPresent())
            return new Result("Role not found!", false);
        user.setRole(optionalRole.get());

        userRepository.save(user);

        return new Result("User saved!", true);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public Result update(UserDTO userDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
