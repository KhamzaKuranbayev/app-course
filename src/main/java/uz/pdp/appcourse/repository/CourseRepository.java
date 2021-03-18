package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
