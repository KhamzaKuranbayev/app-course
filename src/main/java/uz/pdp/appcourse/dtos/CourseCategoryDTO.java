package uz.pdp.appcourse.dtos;

import lombok.Data;
import uz.pdp.appcourse.entity.CourseCategory;

@Data
public class CourseCategoryDTO {

    private String name;
    private String description;
    private Integer parentId;
}
