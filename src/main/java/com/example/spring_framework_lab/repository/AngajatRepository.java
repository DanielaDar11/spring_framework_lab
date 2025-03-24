package com.example.spring_framework_lab.repository;

import com.example.spring_framework_lab.model.Angajat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngajatRepository extends JpaRepository<Angajat, Integer> {

}
