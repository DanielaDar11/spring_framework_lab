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
@Table(name = "evaluari_performanta")
public class EvaluarePerformanta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generare automata  a ID-ului
    private Integer id;

    @Column(name = "data_evaluare")
    private String dataEvaluare;

    @Column(name = "scor")
    private Float scor;

    @Column(name = "comentarii")
    private String comentarii;
}
