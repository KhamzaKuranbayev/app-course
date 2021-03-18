package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Course;

import java.util.List;

@Service
public interface CourseService {

    Result save(CourseDTO courseDTO);

    List<Course> findAll();                             // READ

    Course findById(Integer id);                        // READ ONE

    Result update(CourseDTO courseDTO, Integer id);     // UPDATE

    Result delete(Integer id);                          // DELETE

}
