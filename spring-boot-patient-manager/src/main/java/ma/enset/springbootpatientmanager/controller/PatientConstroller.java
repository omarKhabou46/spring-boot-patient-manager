package ma.enset.springbootpatientmanager.controller;

import ma.enset.springbootpatientmanager.entity.Patient;
import ma.enset.springbootpatientmanager.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientConstroller {

    private IPatientService patientService;

    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
        Patient patient1 = patientService.savePatient(patient);
        return new ResponseEntity<>(patient1, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
        Patient patient1 = patientService.updatePatient(patient);
        return new ResponseEntity<>(patient1, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Patient>> fetchAll() {
        return new ResponseEntity<>(patientService.fetchAllPatients(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> findById(@PathVariable long id) {
        return new ResponseEntity<>(patientService.getPatientById(id), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> archivePatient(@PathVariable long id,@RequestParam boolean active) {
        patientService.activePatient(id, active);
        return ResponseEntity.noContent().build();
    }

    @Autowired
    public void setPatientService(IPatientService patientService) {
        this.patientService = patientService;
    }
}
