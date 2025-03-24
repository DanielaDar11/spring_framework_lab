package com.example.spring_framework_lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "concedii")
public class Concediu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generare automata a ID-ului
    private Integer id;

    @Column(name = "tip_concediu")
    private String tipConcediu;

    @Column(name = "zile")
    private Integer zile;

    @Column(name = "data_incepere")
    private String dataIncepere;

    @Column(name = "data_sfarsit")
    private String dataSfarsit;
}
