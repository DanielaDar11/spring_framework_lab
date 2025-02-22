package com.example.spring_framework_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Sistem_de_evidenta_a_angajatilor {

	public static void main(String[] args) {
		SpringApplication.run(Sistem_de_evidenta_a_angajatilor.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// Obțin bean
		Angajat angajat = context.getBean(Angajat.class);
		Concediu concediu = context.getBean(Concediu.class);
		EvaluarePerformanta evaluarePerformanta = context.getBean(EvaluarePerformanta.class);

		System.out.println( "Angajat ID: " +angajat.getId()+ "\nPrenume: "+ angajat.getNume() +"\nNume: "+angajat.getPrenume()+
				"\nVarsta: "+angajat.getVarsta()+"\nSalariu: "+angajat.getSalariu()+"\nStatusAngajat: "+angajat.isStatusAngajat());
		System.out.println("\nConcediu: " + concediu);
		System.out.println("\nEvaluarePerformanta: " + evaluarePerformanta);




	}
}

