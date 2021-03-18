package uz.pdp.appcourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String detail;

    @ManyToOne
    private User owner;

    @OneToOne
    private Address address;

    @OneToOne
    private Contact contact;

    @ManyToOne
    private CompanyCategory category;

    private Double price;

}
