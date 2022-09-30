package com.example.demo.equipes;

import com.example.demo.personnes.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EquipeRepository extends MongoRepository<Equipe, String> {

    List<Personne> findAllPersonnesById(String id);
}
