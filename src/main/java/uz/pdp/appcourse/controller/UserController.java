package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.service.UserService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.USERS)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody UserDTO userDTO){
        Result save = userService.save(userDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        User user = userService.findById(id);
        return user;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody UserDTO userDTO, @PathVariable Integer id){
        Result update = userService.update(userDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = userService.delete(id);
        return delete;
    }
}
