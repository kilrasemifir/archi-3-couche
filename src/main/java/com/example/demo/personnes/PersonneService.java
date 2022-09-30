package com.example.demo.personnes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneService {

    private final PersonneMongoRepository personneMongoRepository;

    public PersonneService(PersonneMongoRepository personneMongoRepository) {
        this.personneMongoRepository = personneMongoRepository;
    }

    public List<Personne> findAll() {
        return personneMongoRepository.findAll();
    }

    public <S extends Personne> S save(S entity) {
        return personneMongoRepository.save(entity);
    }

    public Personne findById(String s) {
        return personneMongoRepository.findById(s).orElseThrow();
    }

    public void deleteById(String s) {
        personneMongoRepository.deleteById(s);
    }

    public List<Personne> findAllByNom(String nom) {
        return personneMongoRepository.findAllByNom(nom);
    }

    public List<Personne> findAllByNiveauDeCompetences_NiveauGreaterThanEqual(int niveau) {
        return personneMongoRepository.findAllByNiveauDeCompetences_NiveauGreaterThanEqual(niveau);
    }

    public List<Personne> findAllByNiveauDeCompetences_NiveauGreaterThanEqualAndNiveauDeCompetences_Competence(int niveau, String competence) {
        return personneMongoRepository.findAllByNiveauDeCompetences_NiveauGreaterThanEqualAndNiveauDeCompetences_Competence(niveau, competence);
    }
}
