package ma.enset.springbootpatientmanager.service.serviceImpl;

import ma.enset.springbootpatientmanager.entity.Medecin;
import ma.enset.springbootpatientmanager.repository.MedecinRepo;
import ma.enset.springbootpatientmanager.service.IMedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinService implements IMedecinService {

    private MedecinRepo medecinRepo;

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }

    @Override
    public Medecin updateMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }

    @Override
    public List<Medecin> fetchAll() {
        return medecinRepo.findMedecinByActive(true);
    }

    @Override
    public Medecin getById(long id) {
        Medecin medecin = medecinRepo.findById(id).orElseThrow(() -> new RuntimeException("medecin not found"));
        return medecin;
    }

    @Override
    public void activeMedecin(long id, boolean active) {
        Medecin medecin = medecinRepo.findById(id).orElseThrow(() -> new RuntimeException("medecin not found"));
        medecin.setActive(false);
        medecinRepo.save(medecin);
    }

    @Autowired
    public void setMedecinRepo(MedecinRepo medecinRepo) {
        this.medecinRepo = medecinRepo;
    }
}
