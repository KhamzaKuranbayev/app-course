package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.Result;
import uz.pdp.appcourse.entity.Contact;
import uz.pdp.appcourse.service.ContactService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.CONTACTS)
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // CREATE
    @PostMapping()
    public Result save(@RequestBody Contact contact){
        Result save = contactService.save(contact);
        return save;
    }

    // READ
    @GetMapping()
    public List<Contact> findAll(){
        List<Contact> contacts = contactService.findAll();
        return contacts;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Contact findById(@PathVariable Integer id){
        Contact contact = contactService.findById(id);
        return contact;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Result update(@RequestBody Contact contact, @PathVariable Integer id){
        Result update = contactService.update(contact, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result delete = contactService.delete(id);
        return delete;
    }
}
