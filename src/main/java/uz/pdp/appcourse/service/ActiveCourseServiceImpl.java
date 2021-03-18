package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.ActiveCourseDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.ActiveCourse;
import uz.pdp.appcourse.repository.ActiveCourseRepository;

import java.util.List;

@Service
public class ActiveCourseServiceImpl implements ActiveCourseService{

    final ActiveCourseRepository activeCourseRepository;

    public ActiveCourseServiceImpl(ActiveCourseRepository activeCourseRepository) {
        this.activeCourseRepository = activeCourseRepository;
    }

    @Override
    public Result save(ActiveCourseDTO activeCourseDTO) {
        return null;
    }

    @Override
    public List<ActiveCourse> findAll() {
        return null;
    }

    @Override
    public ActiveCourse findById(Integer id) {
        return null;
    }

    @Override
    public Result update(ActiveCourseDTO activeCourseDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
