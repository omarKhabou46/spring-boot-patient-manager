package ma.enset.springbootpatientmanager.repository;

import ma.enset.springbootpatientmanager.entity.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepo extends JpaRepository<RendezVous, Long> {
}
