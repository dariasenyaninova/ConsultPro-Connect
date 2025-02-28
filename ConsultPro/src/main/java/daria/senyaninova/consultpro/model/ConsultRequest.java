package daria.senyaninova.consultpro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultRequest {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private CustomerData customerData;

    @ManyToOne
    private SpecialistData specialistData;

    @CreationTimestamp
    private LocalDateTime creationTime;

    private Boolean enabled;


}
