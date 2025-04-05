package com.example.spring_framework_lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "angajati")
public class Angajat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false)
    public String nume;

    @Column(nullable = false)
    public String prenume;

    @Column(nullable = false)
    public int varsta;

    @Column(nullable = false)
    public double salariu;

    @Column(name = "status_angajat", nullable = false)
    public Boolean statusAngajat;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "angajat_id") 
   public List<Concediu> concedii;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "angajat_id") 
    public List<EvaluarePerformanta> evaluariPerformanta;
}
