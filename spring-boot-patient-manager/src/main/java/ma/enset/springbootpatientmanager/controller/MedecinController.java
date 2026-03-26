package ma.enset.springbootpatientmanager.controller;

import ma.enset.springbootpatientmanager.entity.Medecin;
import ma.enset.springbootpatientmanager.service.IMedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medecin")
public class MedecinController {

    private IMedecinService medecinService;

    @PostMapping
    public ResponseEntity<Medecin> saveMedecin(@RequestBody Medecin medecin) {
        return new ResponseEntity<>(medecinService.saveMedecin(medecin), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Medecin> updateMedecin(@RequestBody Medecin medecin) {
        return new ResponseEntity<>(medecinService.updateMedecin(medecin), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Medecin>> fetchAll() {
        return new ResponseEntity<>(medecinService.fetchAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medecin> findById(@PathVariable long id) {
        return  new ResponseEntity<>(medecinService.getById(id), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> archivePatient(@PathVariable long id,@RequestParam boolean active) {
        medecinService.activeMedecin(id, active);
        return ResponseEntity.noContent().build();
    }

    @Autowired
    public void setMedecinService(IMedecinService medecinService) {
        this.medecinService = medecinService;
    }
}
