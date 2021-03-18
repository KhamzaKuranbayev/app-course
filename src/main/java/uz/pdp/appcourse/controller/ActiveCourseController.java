package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.ActiveCourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.dtos.UserDTO;
import uz.pdp.appcourse.entity.ActiveCourse;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.service.ActiveCourseService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.ACTIVE_COURSES)
public class ActiveCourseController {
    private final ActiveCourseService activeCourseService;

    public ActiveCourseController(ActiveCourseService activeCourseService) {
        this.activeCourseService = activeCourseService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody ActiveCourseDTO activeCourseDTO){
        Result save = activeCourseService.save(activeCourseDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<ActiveCourse> findAll(){
        List<ActiveCourse> activeCourses = activeCourseService.findAll();
        return activeCourses;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ActiveCourse findById(@PathVariable Integer id){
        ActiveCourse activeCourse = activeCourseService.findById(id);
        return activeCourse;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody ActiveCourseDTO activeCourseDTO, @PathVariable Integer id){
        Result update = activeCourseService.update(activeCourseDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = activeCourseService.delete(id);
        return delete;
    }
}
