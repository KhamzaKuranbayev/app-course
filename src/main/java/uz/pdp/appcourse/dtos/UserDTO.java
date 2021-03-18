package uz.pdp.appcourse.dtos;

import lombok.Data;


@Data
public class UserDTO {

    private String fullName;
    private Integer addressId;
    private String phone;
    private Integer roleId;
}
