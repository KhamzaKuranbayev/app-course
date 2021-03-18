package uz.pdp.appcourse.dtos;

import lombok.Data;
import uz.pdp.appcourse.entity.District;

@Data
public class AddressDTO {

    private String home;
    private String street;
    private Integer districtId;
}
