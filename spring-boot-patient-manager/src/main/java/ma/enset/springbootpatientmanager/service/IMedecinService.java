package ma.enset.springbootpatientmanager.service;

import ma.enset.springbootpatientmanager.entity.Medecin;

import java.util.List;

public interface IMedecinService {
    Medecin saveMedecin(Medecin medecin);
    Medecin updateMedecin(Medecin medecin);
    List<Medecin> fetchAll();
    Medecin getById(long id);

    void activeMedecin(long id, boolean active);
}
