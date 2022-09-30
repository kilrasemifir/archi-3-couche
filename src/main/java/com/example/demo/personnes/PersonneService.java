package com.example.demo.personnes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;

    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public List<Personne> findAll() {
        return personneRepository.findAll();
    }

    public <S extends Personne> S save(S entity) {
        return personneRepository.save(entity);
    }

    public Personne findById(String s) {
        return personneRepository.findById(s).orElseThrow();
    }

    public void deleteById(String s) {
        personneRepository.deleteById(s);
    }

    public List<Personne> findAllByNom(String nom) {
        return personneRepository.findAllByNom(nom);
    }

    public List<Personne> findAllByNiveauDeCompetences_NiveauGreaterThanEqual(int niveau) {
        return personneRepository.findAllByNiveauDeCompetences_NiveauGreaterThanEqual(niveau);
    }
}
