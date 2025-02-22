package com.example.spring_framework_lab;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@Component
@RequiredArgsConstructor
public class Angajat {
    private final int id;
    private String nume;
    private String prenume;
    private int varsta;
    private double salariu;
    private boolean statusAngajat;

    private Concediu concediu;
    private EvaluarePerformanta evaluarePerformanta;

    //Dependency injection
    public Angajat(int id, Concediu concediu, EvaluarePerformanta evaluarePerformanta) {
        this.id = id;
        this.concediu = concediu;
        this.evaluarePerformanta = evaluarePerformanta;
    }

    @Autowired
    public void setConcediu(Concediu concediu) {
        this.concediu = concediu;
    }

    @Autowired
    public void setEvaluarePerformanta(EvaluarePerformanta evaluarePerformanta) {
        this.evaluarePerformanta = evaluarePerformanta;
    }

}