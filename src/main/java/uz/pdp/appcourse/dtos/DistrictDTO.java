package uz.pdp.appcourse.dtos;

import lombok.Data;
import uz.pdp.appcourse.entity.Region;

@Data
public class DistrictDTO {

    private Integer id;
    private String name;
    private Integer regionId;
}
