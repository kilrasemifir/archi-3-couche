package com.example.demo.equipes;

import com.example.demo.personnes.Personne;
import com.example.demo.personnes.PersonneService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EquipeService {

    private final EquipeRepository equipeRepository;
    private final PersonneService personneService;

    public EquipeService(
            EquipeRepository equipeRepository,
            PersonneService personneService
    ) {
        this.equipeRepository = equipeRepository;
        this.personneService = personneService;
    }

    public Equipe sauvegarde(Equipe equipe) {
        if (equipe.getNom() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le nom de l'équipe est obligatoire");
        }
        return equipeRepository.save(equipe);
    }

    public Equipe trouverParId(String id) {
        return equipeRepository.findById(id).orElseThrow();
    }

    public void supprimerParId(String id) {
        equipeRepository.deleteById(id);
    }

    public List<Equipe> trouverTous() {
        return equipeRepository.findAll();
    }

    public List<Personne> trouverToutesLesPersonnes(String id) {
        return equipeRepository.findAllPersonnesById(id);
    }

    public Equipe ajouterPersonne(String id, Personne personne) {
        Personne personneSauvegardee = personneService.save(personne);
        Equipe equipe = trouverParId(id);
        equipe.getPersonnes().add(personneSauvegardee);
        return equipeRepository.save(equipe);
    }
}
