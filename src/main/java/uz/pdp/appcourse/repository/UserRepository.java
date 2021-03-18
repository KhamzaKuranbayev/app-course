package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
