package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.CourseCategoryDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.CourseCategory;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.COURSE_CATEGORIES)
public class CourseCategoryService {

    private final CourseCategoryService courseCategoryService;

    public CourseCategoryService(CourseCategoryService courseCategoryService) {
        this.courseCategoryService = courseCategoryService;
    }
    // CREATE
    @PostMapping()
    public Result save(@RequestBody CourseCategoryDTO courseCategoryDTO){
        Result save = courseCategoryService.save(courseCategoryDTO);
        return save;
    }

    // READ
    @GetMapping()
    public List<CourseCategory> findAll(){
        List<CourseCategory> courseCategories = courseCategoryService.findAll();
        return courseCategories;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public CourseCategory findById(@PathVariable Integer id){
        CourseCategory courseCategory = courseCategoryService.findById(id);
        return courseCategory;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody CourseCategoryDTO courseCategoryDTO, @PathVariable Integer id){
        Result update = courseCategoryService.update(courseCategoryDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = courseCategoryService.delete(id);
        return delete;
    }
}
