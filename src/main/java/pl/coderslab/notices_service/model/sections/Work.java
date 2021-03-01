package pl.coderslab.notices_service.model.sections;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "work")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column
    private String title;
    @NotBlank
    @Column
    private String description;
    @NotBlank
    private String contact;
    @Column
    private final LocalDateTime created = LocalDateTime.now();
}
