package com.example.spring_framework_lab;
import com.example.spring_framework_lab.Sistem_de_evidenta_a_angajatilor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@Component
public class Concediu {
    private final int idAngajat;
    private String tipConcediu;
    private int zile;
    private String dataIncepere;
    private String dataSfarsit;

}