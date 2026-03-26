package ma.enset.springbootpatientmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.springbootpatientmanager.enumiration.StatusRDV;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateRD;
    private LocalTime timeRD;

    @Enumerated(EnumType.STRING)
    private StatusRDV statusRDV;
    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Medecin medecin;

    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;
}
