package uz.pdp.appcourse.dtos;

import lombok.Data;
import uz.pdp.appcourse.entity.ActiveCourse;
import uz.pdp.appcourse.entity.User;

import java.util.Date;

@Data
public class ApplicationDTO {

    private Integer studentId;
    private String message;
    private Date sentDate;
    private boolean status = false;
    private Integer activeCourseId;
}
