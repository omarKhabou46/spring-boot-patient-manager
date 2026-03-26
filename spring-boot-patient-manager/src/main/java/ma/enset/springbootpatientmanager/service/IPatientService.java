package ma.enset.springbootpatientmanager.service;

import ma.enset.springbootpatientmanager.entity.Patient;

import java.util.List;

public interface IPatientService {
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient patient);
    void activePatient(long id, boolean active);
    List<Patient> fetchAllPatients();
    Patient getPatientById(long id);
}
