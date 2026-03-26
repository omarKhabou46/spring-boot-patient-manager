package ma.enset.springbootpatientmanager.service.serviceImpl;

import ma.enset.springbootpatientmanager.entity.Consultation;
import ma.enset.springbootpatientmanager.repository.ConsultationRepo;
import ma.enset.springbootpatientmanager.service.IConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService implements IConsultationService {

    private ConsultationRepo consultationRepo;


    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }

    @Override
    public Consultation updateConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }

    @Override
    public void removeConsultation(long id) {
       consultationRepo.deleteById(id);
    }

    @Override
    public List<Consultation> fetchAll() {
        return consultationRepo.findAll();
    }

    @Override
    public Consultation getById(long id) {
        Consultation consultation = consultationRepo.findById(id).get();
        return consultation;
    }

    @Autowired
    public void setConsultationRepo(ConsultationRepo consultationRepo) {
        this.consultationRepo = consultationRepo;
    }
}
