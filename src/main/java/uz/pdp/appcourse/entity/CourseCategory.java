package uz.pdp.appcourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToOne
    private CourseCategory parentId;

    // 1. English   sdsdd       null
    // 2. Kids      sdsdd       1
    // 3. Elementary sdsdd      1
    // 4. IT         sdsdd      null
    // 5. Java      sdsdd      4
}
