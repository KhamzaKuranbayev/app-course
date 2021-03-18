package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Contact;

import java.util.List;

@Service
public interface ContactService {

    Result save(Contact contact);                       // CREATE

    List<Contact> findAll();                            // READ

    Contact findById(Integer id);                       // READ ONE

    Result update(Contact contact, Integer id);         // UPDATE

    Result delete(Integer id);                          // DELETE

}
