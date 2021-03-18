package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
