package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.ApplicationDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Application;
import uz.pdp.appcourse.repository.ActiveCourseRepository;
import uz.pdp.appcourse.repository.ApplicationRepository;
import uz.pdp.appcourse.repository.UserRepository;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    final ApplicationRepository applicationRepository;
    final UserRepository userRepository;
    final ActiveCourseRepository activeCourseRepository;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository,
                                  UserRepository userRepository,
                                  ActiveCourseRepository activeCourseRepository) {
        this.applicationRepository = applicationRepository;
        this.userRepository = userRepository;
        this.activeCourseRepository = activeCourseRepository;
    }

    @Override
    public Result save(ApplicationDTO applicationDTO) {
        return null;
    }

    @Override
    public List<Application> findAll() {
        return null;
    }

    @Override
    public Application findById(Integer id) {
        return null;
    }

    @Override
    public Result update(ApplicationDTO applicationDTO, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
