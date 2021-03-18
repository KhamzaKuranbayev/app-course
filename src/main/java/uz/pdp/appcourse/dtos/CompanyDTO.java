package uz.pdp.appcourse.dtos;

import lombok.Data;

@Data
public class CompanyDTO {

    private String name;
    private String detail;
    private Integer ownerId;
    private Integer addressId;
    private Integer contactId;
    private Integer categoryId;
    private Double price;
}
