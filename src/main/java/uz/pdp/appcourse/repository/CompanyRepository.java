package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.dtos.response.ResponseCompany;
import uz.pdp.appcourse.entity.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {


    @Query("select new uz.pdp.appcourse.dtos.response.ResponseCompany(crs.company.name, crs.company.detail, " +
            "crs.company.address.home, crs.company.address.street, " +
            "crs.company.owner.fullName, crs.company.contact.phone, crs.name) " +
            "from Course crs where crs.company.address.district.region.name = ?1 and crs.category.parentId.name = ?2")
    List<ResponseCompany> findAllByCategoryAndAddress(String regionName, String courseCategory);




    @Query("select new uz.pdp.appcourse.dtos.response.ResponseCompany(crs.company.name, crs.company.detail, " +
            "crs.company.address.home, crs.company.address.street, " +
            "crs.company.owner.fullName, crs.company.contact.phone, crs.name) " +
            "from Course crs where crs.name = ?1")
    List<ResponseCompany> findAllByCourseName(String courseName);


   /* @Query(value = "SELECT cy.name, cy.detail, a.home +' '+a.street, su.full_name, ct.phone   FROM company cy " +
            "JOIN address a on a.id = cy.address_id " +
            "JOIN district d on d.id = a.district_id " +
            "JOIN region r on r.id = d.region_id " +
            "JOIN contact ct on ct.id = cy.contact_id "+
            "JOIN sys_user su on su.id = cy.owner_id "+
            "JOIN course c on cy.id = c.company_id " +
            "JOIN course_category cc on cc.id = c.category_id " +
            "JOIN course_category cc2 on cc.parent_id_id = cc2.id " +
            "WHERE r.name = ?1 AND cc2.name = ?2", nativeQuery = true)
    ResponseCompany findAllByCategoryNative(String regionName, String courseCategory);*/



}
