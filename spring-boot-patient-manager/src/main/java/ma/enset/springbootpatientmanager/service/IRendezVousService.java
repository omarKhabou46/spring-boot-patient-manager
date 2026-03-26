package ma.enset.springbootpatientmanager.service;

import ma.enset.springbootpatientmanager.entity.RendezVous;

import java.util.List;

public interface IRendezVousService {
    RendezVous saveRendezVous(RendezVous rendezVous);
    RendezVous updateRendezVous(RendezVous rendezVous);
    void removeRendezVous(long id);
    List<RendezVous> fetchAll();
    RendezVous getById(long id);
}
