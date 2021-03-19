package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    boolean existsByName(String name);
}
