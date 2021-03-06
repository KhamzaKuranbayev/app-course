package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.ActiveCourse;

@Repository
public interface ActiveCourseRepository extends JpaRepository<ActiveCourse, Integer> {
}
