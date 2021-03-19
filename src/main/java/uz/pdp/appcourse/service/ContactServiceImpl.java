package uz.pdp.appcourse.service;

import org.springframework.stereotype.Service;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Contact;
import uz.pdp.appcourse.repository.ContactRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    //CREATE
    @Override
    public Result save(Contact contact) {
        //HAR BIR PARAMETR UNIKAL BO'LISHI VA QAYSI MA'LUMOT XATOLIGINI BILISH UCHUN UCHTA IF ISHLATDIM
        if (contactRepository.findByPhone(contact.getPhone()).isPresent()){
            return new Result("Raqam takrorlandi", false);
        }else if (contactRepository.findByEmail(contact.getEmail()).isPresent()){
           return new Result("Email takrorlandi", false);
        }else if (contactRepository.findByFax(contact.getFax()).isPresent()){
            return new Result("Fax takrorlandi", false);
        }else {
            contactRepository.save(contact);
            return new Result("Contact saqlandi", true);
        }
    }

    //READ
    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    //READ BY ID
    @Override
    public Contact findById(Integer id) {
        if (contactRepository.existsById(id)){
            return contactRepository.getOne(id);
        }else {
            return new Contact();
        }
    }

    //UPDATE
    @Override
    public Result update(Contact contact, Integer id) {
        if (contactRepository.existsById(id)){
            if (contactRepository.findByPhone(contact.getPhone()).isPresent()){
                return new Result("Raqam takrorlandi", false);
            }else if (contactRepository.findByEmail(contact.getEmail()).isPresent()){
                return new Result("Email takrorlandi", false);
            }else if (contactRepository.findByFax(contact.getFax()).isPresent()){
                return new Result("Fax takrorlandi", false);
            }else {
                contactRepository.save(contact);
                return new Result("Contact o'zgartirildi", true);
            }
        }else {
            return new Result("Bunday idli contact yo'q", false);
        }
    }

    //DELETE
    @Override
    public Result delete(Integer id) {
        if (contactRepository.existsById(id)){
            contactRepository.deleteById(id);
            return new Result("O'chirildi", true);
        }else {
            return new Result("bunday idli contact yo'q", false);
        }
    }
}
