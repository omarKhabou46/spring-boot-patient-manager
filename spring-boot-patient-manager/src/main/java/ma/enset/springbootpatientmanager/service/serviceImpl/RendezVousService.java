package ma.enset.springbootpatientmanager.service.serviceImpl;

import ma.enset.springbootpatientmanager.entity.RendezVous;
import ma.enset.springbootpatientmanager.repository.RendezVousRepo;
import ma.enset.springbootpatientmanager.service.IRendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendezVousService implements IRendezVousService {

    private RendezVousRepo rendezVousRepo;


    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepo.save(rendezVous);
    }

    @Override
    public RendezVous updateRendezVous(RendezVous rendezVous) {
        return rendezVousRepo.save(rendezVous);
    }

    @Override
    public void removeRendezVous(long id) {
       rendezVousRepo.deleteById(id);
    }

    @Override
    public List<RendezVous> fetchAll() {
        return rendezVousRepo.findAll();
    }

    @Override
    public RendezVous getById(long id) {
        return rendezVousRepo.findById(id).get();
    }

    @Autowired
    public void setRendezVousRepo(RendezVousRepo rendezVousRepo) {
        this.rendezVousRepo = rendezVousRepo;
    }
}
