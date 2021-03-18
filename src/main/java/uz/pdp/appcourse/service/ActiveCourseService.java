package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.ActiveCourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.ActiveCourse;

import java.util.List;

@Service
public interface ActiveCourseService {

    Result save(ActiveCourseDTO activeCourseDTO);                 // CREATE

    List<ActiveCourse> findAll();                                 // READ

    ActiveCourse findById(Integer id);                            // READ ONE

    Result update(ActiveCourseDTO activeCourseDTO, Integer id);   // UPDATE

    Result delete(Integer id);                                    // DELETE

}
