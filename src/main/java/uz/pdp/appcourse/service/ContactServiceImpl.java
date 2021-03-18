package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Contact;
import uz.pdp.appcourse.repository.ContactRepository;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Result save(Contact contact) {
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public Contact findById(Integer id) {
        return null;
    }

    @Override
    public Result update(Contact contact, Integer id) {
        return null;
    }

    @Override
    public Result delete(Integer id) {
        return null;
    }
}
