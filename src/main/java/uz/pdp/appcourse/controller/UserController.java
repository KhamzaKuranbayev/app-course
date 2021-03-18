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

    //CREATE
    @PostMapping()
    public Result save(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }
    //READ
    @GetMapping()
    public List<User> findAll() {
        return userService.findAll();
    }
    //READ ONE BY ID
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
    //UPDATE
    @PutMapping("/{id}")
    public Result update(@RequestBody UserDTO userDTO, @PathVariable Integer id){
        return userService.update(userDTO, id);
    }
    //DELETE
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return userService.delete(id);
    }
}
