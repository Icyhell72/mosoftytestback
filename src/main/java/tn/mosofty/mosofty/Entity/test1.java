package tn.mosofty.mosofty.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class test1 {
    @Id
    private Integer id;
    private String email;
    private String name;
    private String lastname;
    private Integer phonenumber;


}
