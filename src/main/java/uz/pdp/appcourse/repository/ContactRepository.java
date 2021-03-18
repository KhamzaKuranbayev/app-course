package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
