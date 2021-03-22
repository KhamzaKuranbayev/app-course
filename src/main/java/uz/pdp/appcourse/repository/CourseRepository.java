package uz.pdp.appcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.pdp.appcourse.dtos.response.ResponseCourse;
import uz.pdp.appcourse.entity.Course;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("select new uz.pdp.appcourse.dtos.response.ResponseCourse(acrs.course.company.name, acrs.course.company.address.street," +
            " acrs.course.name, acrs.course.description, acrs.course.price, acrs.maxStudent, acrs.currentStudentsCount, acrs.startDate)" +
            "from ActiveCourse acrs where acrs.course.category.name = ?1")
    List<ResponseCourse> getCoursesByCategory(String category);


}
