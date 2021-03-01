package pl.coderslab.notices_service.model.specifics;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String adres;

}
