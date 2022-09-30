package com.example.demo.personnes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NiveauDeCompetence {
    private String competence;
    private Byte niveau;
}
