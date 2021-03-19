package uz.pdp.appcourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @ManyToOne
    private Company company;

    // MANY COURSES TO ONE CATEGORY
    @ManyToOne
    private CourseCategory category;

    private Double price;


    /*
    *       *   1               1
    *   2               1
    *   3               1
    *   1               2
    *
    *
    * */

}
