package ma.enset.springbootpatientmanager.service;

import ma.enset.springbootpatientmanager.entity.Consultation;

import java.util.List;

public interface IConsultationService {
    Consultation saveConsultation(Consultation consultation);
    Consultation updateConsultation(Consultation consultation);
    void removeConsultation(long id);
    List<Consultation> fetchAll();
    Consultation getById(long id);
}
