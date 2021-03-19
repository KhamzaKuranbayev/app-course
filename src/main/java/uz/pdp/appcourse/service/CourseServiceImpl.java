package uz.pdp.appcourse.service;

import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Company;
import uz.pdp.appcourse.entity.Course;
import uz.pdp.appcourse.entity.CourseCategory;
import uz.pdp.appcourse.repository.CompanyRepository;
import uz.pdp.appcourse.repository.CourseCategoryRepository;
import uz.pdp.appcourse.repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Course course = new Course();
        course.setName(courseDTO.getName());
        course.setDescription(courseDTO.getDescription());
        course.setPrice(courseDTO.getPrice());

        Optional<CourseCategory> optionalCourseCategory = courseCategoryRepository.findById(courseDTO.getCategoryId());
        if(!optionalCourseCategory.isPresent())
            return new Result("Course Category not found!", false);
        course.setCategory(optionalCourseCategory.get());

        Optional<Company> optionalCompany = companyRepository.findById(courseDTO.getCompanyId());
        if(!optionalCompany.isPresent())
            return new Result("Company not found!", false);
        course.setCompany(optionalCompany.get());

        courseRepository.save(course);
        return new Result("New Course saved!", true);
    }

    @Override
    public List<Course> findAll() {
        List<Course> courseRepositoryAll = courseRepository.findAll();
        return courseRepositoryAll;
    }

    @Override
    public Course findById(Integer id) {
        Optional<Course> courseRepositoryById = courseRepository.findById(id);
        if (courseRepositoryById.isPresent()){
            Course course = courseRepositoryById.get();
            return course;
        }
        return null;
    }

    @Override
    public Result update(CourseDTO courseDTO, Integer id) {

        Optional<Course> optionalCourse = courseRepository.findById(id);
        if(optionalCourse.isPresent()){
            optionalCourse.get().setName(courseDTO.getName());
            optionalCourse.get().setDescription(courseDTO.getDescription());
            optionalCourse.get().setPrice(courseDTO.getPrice());
            Optional<Company> companyRepositoryById = companyRepository.findById(courseDTO.getCompanyId());
            if (companyRepositoryById.isPresent()) {
                courseRepository.save(optionalCourse.get());
                return new Result("Course Updated!", true);
            }
        }


        return new Result("Course Not Found!",false);

    }

    @Override
    public Result delete(Integer id) {
        Optional<Course> courseRepositoryById = courseRepository.findById(id);
        if (courseRepositoryById.isPresent()){
            courseRepository.deleteById(id);
            return new Result("Course Deleted!", true);
        }
        return new Result ("No Such Course!", false);
    }
}
