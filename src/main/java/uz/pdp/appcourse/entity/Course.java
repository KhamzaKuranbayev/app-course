package uz.pdp.appcourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToMany
    private List<Company> companies;

    // MANY COURSES TO ONE CATEGORY
    @ManyToOne
    private CourseCategory category;

    /*
    *       *   1               1
    *   2               1
    *   3               1
    *   1               2
    *
    *
    * */

}
