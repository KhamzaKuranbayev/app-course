package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.CourseCategoryDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.CourseCategory;
import uz.pdp.appcourse.repository.CourseCategoryRepository;

import java.util.List;

@Service
public class CourseCategoryServiceImpl implements CourseCategoryService{

    final CourseCategoryRepository courseCategoryRepository;

    public CourseCategoryServiceImpl(CourseCategoryRepository courseCategoryRepository) {
        this.courseCategoryRepository = courseCategoryRepository;
    }

    @Override
    public Result save(CourseCategoryDTO courseCategoryDTO) {
        return null;
    }

    @Override
    public List<CourseCategory> findAll() {
        return null;
    }

    @Override
    public CourseCategory findById(Integer id) {
        return null;
    }

    @Override
    public Result update(CourseCategoryDTO courseCategoryDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
