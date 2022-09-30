package com.example.demo.personnes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnes")
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping("")
    public List<Personne> findAll() {
        return personneService.findAll();
    }

    @PostMapping("")
    public Personne save(@RequestBody Personne entity) {
        return personneService.save(entity);
    }

    @GetMapping("{id}")
    public Personne findById(@PathVariable String id) {
        return personneService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        personneService.deleteById(id);
    }

    @GetMapping("nom/{nom}")
    public List<Personne> findAllByNom(@PathVariable String nom) {
        return personneService.findAllByNom(nom);
    }

    @GetMapping("niveau/{niveau}")
    public List<Personne> findallByNiveauDeCompetences_NiveauGreaterThanEqual(@PathVariable int niveau) {
        return personneService.findAllByNiveauDeCompetences_NiveauGreaterThanEqual(niveau);
    }

    @GetMapping("niveau/{niveau}/competence/{competence}")
    public List<Personne> findAllByNiveauDeCompetences_NiveauGreaterThanEqualAndNiveauDeCompetences_Competence(@PathVariable int niveau, @PathVariable String competence) {
        return personneService.findAllByNiveauDeCompetences_NiveauGreaterThanEqualAndNiveauDeCompetences_Competence(niveau, competence);
    }
}
