package com.example.spring_framework_lab;
import com.example.spring_framework_lab.Sistem_de_evidenta_a_angajatilor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@RequiredArgsConstructor
@Component
public  class EvaluarePerformanta {
    private final int idAngajat;
    private String dataEvaluare;
    private float scor;
    private String comentarii;


}