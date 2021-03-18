package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Role;
import uz.pdp.appcourse.service.RoleService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.ROLES)
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody Role role){
        Result save = roleService.save(role);
        return save;
    }

    // READ
    @GetMapping()
    public List<Role> findAll(){
        List<Role> users = roleService.findAll();
        return users;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Role findById(@PathVariable Integer id){
        Role user = roleService.findById(id);
        return user;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody Role role, @PathVariable Integer id){
        Result update = roleService.update(role, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = roleService.delete(id);
        return delete;
    }
}
