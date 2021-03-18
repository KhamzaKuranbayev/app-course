package uz.pdp.appcourse.dtos;

import lombok.Data;
import uz.pdp.appcourse.entity.Course;

import java.util.Date;

@Data
public class ActiveCourseDTO {

    private Integer courseId;
    private Integer maxStudent;
    private Integer currentStudent;
    private Date startDate;
}
