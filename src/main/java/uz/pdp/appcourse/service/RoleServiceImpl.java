package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Role;
import uz.pdp.appcourse.repository.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    //CREATE
    @Override
    public Result save(Role role) {
        if (roleRepository.existsByName(role.getName())) {
            roleRepository.save(role);
            return new Result("Role qo'shildi", true);
        } else {
            return new Result("Role nomi takrorlandi", false);
        }
    }

    //READ
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    //GET ONE BY ID
    @Override
    public Role findById(Integer id) {
        if (roleRepository.existsById(id)) {
            return roleRepository.getOne(id);
        } else {
            return new Role();
        }
    }

    //UPDATE
    @Override
    public Result update(Role role, Integer id) {
        if (roleRepository.existsById(id)) {
            roleRepository.save(role);
            return new Result("O'zgartirildi", true);
        } else {
            return new Result("Bunday idli role yo'q", false);
        }
    }

    //DELETE
    @Override
    public Result delete(Integer id) {
        if (roleRepository.existsById(id)) {
            roleRepository.deleteById(id);
            return new Result("Role o'chirildi", true);
        } else {
            return new Result("Bunday idli role yo'q", false);
        }
    }
}
