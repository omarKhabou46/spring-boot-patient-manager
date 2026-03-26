package ma.enset.springbootpatientmanager.controller;

import ma.enset.springbootpatientmanager.entity.Patient;
import ma.enset.springbootpatientmanager.entity.RendezVous;
import ma.enset.springbootpatientmanager.service.IRendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultation")
public class RedezVousController {

    private IRendezVousService rendezVousService;

    @PostMapping
    public ResponseEntity<RendezVous> saveRendezVous(@RequestBody RendezVous rendezVous) {
        return new ResponseEntity<>(rendezVousService.saveRendezVous(rendezVous), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<RendezVous> updateRendezVous(@RequestBody RendezVous rendezVous) {
        return new ResponseEntity<>(rendezVousService.updateRendezVous(rendezVous), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RendezVous>> fetchAll() {
        return new ResponseEntity<>(rendezVousService.fetchAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RendezVous> findById(@PathVariable long id) {
        return new ResponseEntity<>(rendezVousService.getById(id), HttpStatus.OK);
    }

    @Autowired
    public void setRendezVousService(IRendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }
}
