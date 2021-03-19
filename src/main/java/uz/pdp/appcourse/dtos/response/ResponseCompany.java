package uz.pdp.appcourse.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCompany {

    private String name;
    private String detail;
    private String home;
    private String street;
    private String fullName;
    private String phone;
    private String courseName;


}
