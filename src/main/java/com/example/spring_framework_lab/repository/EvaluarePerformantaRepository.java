package com.example.spring_framework_lab.repository;

import com.example.spring_framework_lab.model.EvaluarePerformanta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EvaluarePerformantaRepository extends JpaRepository<EvaluarePerformanta, Integer> {

}
