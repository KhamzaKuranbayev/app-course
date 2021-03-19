package uz.pdp.appcourse.dtos;

import lombok.Data;
import uz.pdp.appcourse.entity.CourseCategory;

import java.util.List;

@Data
public class CourseDTO {

    private String name;
    private String description;
    private Integer categoryId;
    private Integer companyId;
    private Double price;
}
