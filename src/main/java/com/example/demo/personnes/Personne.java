package com.example.demo.personnes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

}
