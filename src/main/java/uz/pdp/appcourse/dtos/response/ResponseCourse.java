package uz.pdp.appcourse.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCourse {

    private String companyName;
    private String companyAddress;
    private String name;
    private String description;
    private Double price;
    private Integer maxStudent;
    private Integer currentStudent;
    private Date startDate;
}
