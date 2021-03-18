package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Course;
import uz.pdp.appcourse.repository.CompanyRepository;
import uz.pdp.appcourse.repository.CourseCategoryRepository;
import uz.pdp.appcourse.repository.CourseRepository;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    final CourseRepository courseRepository;
    final CourseCategoryRepository courseCategoryRepository;
    final CompanyRepository companyRepository;

    public CourseServiceImpl(CourseRepository courseRepository,
                             CourseCategoryRepository courseCategoryRepository,
                             CompanyRepository companyRepository) {
        this.courseRepository = courseRepository;
        this.courseCategoryRepository = courseCategoryRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public Result save(CourseDTO courseDTO) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(Integer id) {
        return null;
    }

    @Override
    public Result update(CourseDTO courseDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
