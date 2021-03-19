package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.Region;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

    //REGION MA'LUMOTLARI TAKRORLANGANINI TEKSHIRISH UCHUN JPA QUERY

    Optional<Region> findByName(String string);

    Optional<Region> findByCode(String string);
}
