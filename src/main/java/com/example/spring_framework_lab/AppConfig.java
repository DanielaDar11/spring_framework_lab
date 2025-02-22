package com.example.spring_framework_lab;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.example.spring_framework_lab")
@Configuration
public class AppConfig {

    @Bean
    public Angajat angajat() {
        Concediu concediu = new Concediu(1, "Odihna", 10, "2025-06-01", "2025-06-11");
        EvaluarePerformanta evaluarePerformanta = new EvaluarePerformanta(1, "2025-05-01", 8.5f, "Performanta este una buna");
        return new Angajat(1, "Mirela", "Codreanu", 20, 9000.0, true,  concediu, evaluarePerformanta);
    }
}
