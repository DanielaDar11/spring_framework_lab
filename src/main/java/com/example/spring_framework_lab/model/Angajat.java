package com.example.spring_framework_lab.model;
import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "angajati")
public class Angajat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generare automata a ID-ului de catre baza de date
    private Integer id;

    @Column(name = "nume", nullable = false)
    private String nume;

    @Column(name = "prenume", nullable = false)
    private String prenume;

    @Column(name = "varsta", nullable = false)
    private int varsta;

    @Column(name = "salariu", nullable = false)
    private double salariu;

    @Column(name = "status_angajat", nullable = false)
    private Boolean statusAngajat;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "concediu_id") // Coloana care face legatura cu tabelul Concediu
    private Concediu concediu;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evaluare_performanta_id") // Coloana care face legatura cu tabelul EvaluarePerformanta
    private EvaluarePerformanta evaluarePerformanta;
}