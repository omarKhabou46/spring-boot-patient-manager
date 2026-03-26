package ma.enset.springbootpatientmanager.controller;

import ma.enset.springbootpatientmanager.entity.Consultation;
import ma.enset.springbootpatientmanager.entity.Medecin;
import ma.enset.springbootpatientmanager.service.IConsultationService;
import ma.enset.springbootpatientmanager.service.IMedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultation")
public class ConsultationController {

    private IConsultationService consultationService;

    @PostMapping
    public ResponseEntity<Consultation> saveConsultation(@RequestBody Consultation consultation) {
        return new ResponseEntity<>(consultationService.saveConsultation(consultation), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Consultation> updateConsultation(@RequestBody Consultation consultation) {
        return new ResponseEntity<>(consultationService.updateConsultation(consultation), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Consultation>> fetchAll() {
        return new ResponseEntity<>(consultationService.fetchAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consultation> findById(@PathVariable long id) {
        return  new ResponseEntity<>(consultationService.getById(id), HttpStatus.OK);
    }

    @Autowired
    public void setConsultationService(IConsultationService consultationService) {
        this.consultationService = consultationService;
    }
}
