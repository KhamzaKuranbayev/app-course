package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CourseCategoryDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.CourseCategory;

import java.util.List;

@Service
public interface CourseCategoryService {

    Result save(CourseCategoryDTO courseCategoryDTO);

    List<CourseCategory> findAll();                                   // READ

    CourseCategory findById(Integer id);                              // READ ONE

    Result update(CourseCategoryDTO courseCategoryDTO, Integer id);   // UPDATE

    Result delete(Integer id);                                        // DELETE

}
