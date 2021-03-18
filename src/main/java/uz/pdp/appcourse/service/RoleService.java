package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Role;

import java.util.List;

@Service
public interface RoleService {

    Result save(Role role);                             // CREATE

    List<Role> findAll();                              // READ

    Role findById(Integer id);                         // READ ONE

    Result update(Role role, Integer id);              // UPDATE

    Result delete(Integer id);                         // DELETE
}
