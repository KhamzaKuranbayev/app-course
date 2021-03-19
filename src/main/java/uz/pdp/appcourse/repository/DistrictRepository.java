package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.District;

import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

    //MA'LUMOTLAR TAKRORLANMASLIGI UCHUN JPA QUERY

    Optional<District> findByName(String string);

    boolean existsByName(String name);


}
