package com.example.spring_framework_lab.repository;

import com.example.spring_framework_lab.model.Concediu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConcediuRepository extends JpaRepository<Concediu, Integer> {

}
