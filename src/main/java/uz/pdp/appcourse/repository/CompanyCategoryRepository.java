package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.CompanyCategory;

@Repository
public interface CompanyCategoryRepository extends JpaRepository<CompanyCategory, Integer> {

    boolean existsByName(String name);

}
