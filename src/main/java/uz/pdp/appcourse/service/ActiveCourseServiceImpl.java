package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.ActiveCourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.ActiveCourse;
import uz.pdp.appcourse.entity.Course;
import uz.pdp.appcourse.repository.ActiveCourseRepository;
import uz.pdp.appcourse.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ActiveCourseServiceImpl implements ActiveCourseService {

    final ActiveCourseRepository activeCourseRepository;
    final CourseRepository courseRepository;

    public ActiveCourseServiceImpl(ActiveCourseRepository activeCourseRepository,
                                   CourseRepository courseRepository) {
        this.activeCourseRepository = activeCourseRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Result save(ActiveCourseDTO activeCourseDTO) {
        ActiveCourse activeCourse = new ActiveCourse();
        activeCourse.setMaxStudent(activeCourseDTO.getMaxStudent());
        activeCourse.setStartDate(activeCourseDTO.getStartDate());
        activeCourse.setCurrentStudentsCount(activeCourseDTO.getCurrentStudentsCount());

        Optional<Course> optionalCourse = courseRepository.findById(activeCourseDTO.getCourseId());
        if (!optionalCourse.isPresent())
            return new Result("Course id not found!", false);
        activeCourse.setCourse(optionalCourse.get());

        activeCourseRepository.save(activeCourse);
        return new Result("Active course saved!", true);
    }

    @Override
    public List<ActiveCourse> findAll() {
        return activeCourseRepository.findAll();
    }

    @Override
    public ActiveCourse findById(Integer id) {
        Optional<ActiveCourse> optionalActiveCourse = activeCourseRepository.findById(id);
        return optionalActiveCourse.orElse(null);
    }

    @Override
    public Result update(ActiveCourseDTO activeCourseDTO, Integer id) {
        Optional<ActiveCourse> optionalActiveCourse = activeCourseRepository.findById(id);
        if (optionalActiveCourse.isPresent()) {
            optionalActiveCourse.get().setMaxStudent(activeCourseDTO.getMaxStudent());
            optionalActiveCourse.get().setStartDate(activeCourseDTO.getStartDate());
            optionalActiveCourse.get().setCurrentStudentsCount(activeCourseDTO.getCurrentStudentsCount());

            Optional<Course> optionalCourse = courseRepository.findById(activeCourseDTO.getCourseId());
            if (!optionalCourse.isPresent())
                return new Result("Course id not found!", false);

            activeCourseRepository.save(optionalActiveCourse.get());
            return new Result("Active course updated!", true);
        }
        return new Result("Active course id not found!", false);
    }

    @Override
    public Result delete(Integer id) {
        Optional<ActiveCourse> optionalActiveCourse = activeCourseRepository.findById(id);
        if(optionalActiveCourse.isPresent()) {
            activeCourseRepository.deleteById(id);
            return new Result("Active course deleted!", true);
        }
        return new Result("Active course id not found!", false);
    }
}
