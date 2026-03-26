package ma.enset.springbootpatientmanager.service.serviceImpl;

import ma.enset.springbootpatientmanager.entity.Patient;
import ma.enset.springbootpatientmanager.repository.PatientRepo;
import ma.enset.springbootpatientmanager.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService {

    private PatientRepo patientRepo;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public void activePatient(long id, boolean active) {
        Patient patient = patientRepo.findById(id).get();
        patient.setActive(active);
        patientRepo.save(patient);
    }


    @Override
    public List<Patient> fetchAllPatients() {
        List<Patient> list = patientRepo.findPatientByActive(true);
        return list;
    }

    @Override
    public Patient getPatientById(long id) {
        Patient patient = patientRepo.findById(id).orElseThrow(() -> new RuntimeException("patient with id "+ id+ "not found"));
        return patient;
    }

    @Autowired
    public void setPatientRepo(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }


}
