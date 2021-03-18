package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.User;

import java.util.List;

@Service
public interface UserService {

    Result save(UserDTO userDTO);              // CREATE

    List<User> findAll();                      // READ

    User findById(Integer id);                          // READ ONE

    Result update(UserDTO userDTO, Integer id); // UPDATE

    Result delete(Integer id);       // DELETE

}
