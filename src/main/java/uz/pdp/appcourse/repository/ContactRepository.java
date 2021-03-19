package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.Contact;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    //MA'LUMOTLAR UNIKAL BO'LISHI UCHUN JPA QUERY

    Optional<Contact> findByPhone(String string);

    Optional<Contact> findByEmail(String string);

    Optional<Contact> findByFax(String string);

}
