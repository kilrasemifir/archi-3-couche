package com.example.demo.equipes;

import com.example.demo.personnes.Personne;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipes")
public class EquipeController {

    private final EquipeService equipeService;

    public EquipeController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    @PostMapping("")
    public Equipe sauvegarde(@RequestBody Equipe equipe) {
        return equipeService.sauvegarde(equipe);
    }

    @GetMapping("{id}")
    public Equipe trouverParId(@PathVariable String id) {
        return equipeService.trouverParId(id);
    }

    @GetMapping("")
    public List<Equipe> trouverTous() {
        return equipeService.trouverTous();
    }

    @DeleteMapping("{id}")
    public void supprimerParId(@PathVariable String id) {
        equipeService.supprimerParId(id);
    }

    @GetMapping("{id}/personnes")
    public List<Personne> trouverToutesLesPersonnes(@PathVariable String id) {
        return equipeService.trouverToutesLesPersonnes(id);
    }

    @PostMapping("{id}/personnes")
    public Equipe ajouterPersonne(@PathVariable String id, @RequestBody Personne personne) {
        return equipeService.ajouterPersonne(id, personne);
    }
}
