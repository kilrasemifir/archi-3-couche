package com.example.demo.personnes;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonneMongoRepository extends MongoRepository<Personne, String> {

    List<Personne> findAllByNom(String nom);

    List<Personne> findAllByNiveauDeCompetences_NiveauGreaterThanEqual(int niveau);

    List<Personne> findAllByNiveauDeCompetences_NiveauGreaterThanEqualAndNiveauDeCompetences_Competence(int niveau, String competence);
}
