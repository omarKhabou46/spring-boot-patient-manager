package ma.enset.springbootpatientmanager.repository;

import ma.enset.springbootpatientmanager.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepo extends JpaRepository<Medecin, Long> {
    List<Medecin> findMedecinByActive(boolean active);
}
