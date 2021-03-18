package uz.pdp.appcourse.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User student;

    private String message;

    private Date sentDate;

    private boolean status = false;         // true - qabul qilindi false - qabul qilinmadi

    @ManyToOne
    private ActiveCourse activeCourse;

    /*
    1. Ahmad  javaga yozilaman, bilimi zor   1
    2. Ahmad  ingiliz tiliga yozilaman, bilimi zor   2
    3. Ahmad  Graphica kaga yozilaman, bilimi zor   5
    4. Johon javaga ,       1
    */

    /*
    *       applica_id              studet_id
    *       1                       1
    *       2                       1
    *       3                       1
    *       1                       2
    * */

}
