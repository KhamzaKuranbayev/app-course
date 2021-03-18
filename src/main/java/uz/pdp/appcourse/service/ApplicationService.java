package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.ApplicationDTO;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Application;

import java.util.List;

@Service
public interface ApplicationService {

    Result save(ApplicationDTO applicationDTO);                 // CREATE

    List<Application> findAll();                                // READ

    Application findById(Integer id);                           // READ ONE

    Result update(ApplicationDTO applicationDTO, Integer id);   // UPDATE

    Result delete(Integer id);                                  // DELETE

}
