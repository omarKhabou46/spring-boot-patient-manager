package ma.enset.springbootpatientmanager.repository;

import ma.enset.springbootpatientmanager.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository<Consultation, Long> {
}
