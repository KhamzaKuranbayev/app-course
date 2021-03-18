package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.CourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Course;
import uz.pdp.appcourse.entity.User;
import uz.pdp.appcourse.service.CourseService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.COURSES)
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody CourseDTO courseDTO){
        Result save = courseService.save(courseDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<Course> findAll(){
        List<Course> courses = courseService.findAll();
        return courses;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Course findById(@PathVariable Integer id){
        Course course = courseService.findById(id);
        return course;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody CourseDTO courseDTO, @PathVariable Integer id){
        Result update = courseService.update(courseDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = courseService.delete(id);
        return delete;
    }
}
