package pl.coderslab.notices_service.model.sections;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "electronics")
public class Electronics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column
    private String title;
    @NotBlank
    private String brand;
    @NotBlank
    private String model;
    @Min(1)
    private BigDecimal price;
    @NotBlank
    @Column
    private String description;
    @NotBlank
    private String contact;
    @Column
    private final LocalDateTime created = LocalDateTime.now();

}
