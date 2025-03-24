package com.example.spring_framework_lab.service;

import com.example.spring_framework_lab.model.Concediu;
import com.example.spring_framework_lab.model.EvaluarePerformanta;
import com.example.spring_framework_lab.repository.EvaluarePerformantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluarePerformantaService {

    private final EvaluarePerformantaRepository evaluarePerformantaRepository;

    @Autowired
    public EvaluarePerformantaService(EvaluarePerformantaRepository evaluarePerformantaRepository) {
        this.evaluarePerformantaRepository = evaluarePerformantaRepository;
    }

    // Metoda pentru a găsi toate evaluările
    public List<EvaluarePerformanta> findAll() {
        return evaluarePerformantaRepository.findAll();
    }

    // Metoda pentru a găsi un angajat după ID
    public EvaluarePerformanta findById(int id) {
        Optional<EvaluarePerformanta> eval_perf= evaluarePerformantaRepository.findById(id);
        return eval_perf.orElse(null);
    }
    // Metoda pentru a salva un concediu
    public EvaluarePerformanta save(EvaluarePerformanta eval_perf) {
        return evaluarePerformantaRepository.save(eval_perf); // Salvează concediul în baza de date
    }


    public EvaluarePerformanta update(int id, EvaluarePerformanta evaluarePerformanta) {
        EvaluarePerformanta existingEvaluare = evaluarePerformantaRepository.findById(id).orElse(null);
        if (existingEvaluare != null) {
            // Actualizează câmpurile evaluării existente
            existingEvaluare.setDataEvaluare(evaluarePerformanta.getDataEvaluare());
            existingEvaluare.setScor(evaluarePerformanta.getScor());
            existingEvaluare.setComentarii(evaluarePerformanta.getComentarii());
            // Salvează evaluarea actualizată
            EvaluarePerformanta updatedEvaluare = evaluarePerformantaRepository.save(existingEvaluare);
            System.out.println("Evaluare actualizată: " + updatedEvaluare);
            return updatedEvaluare;
        }
        return null; // Dacă evaluarea nu există
    }

    public EvaluarePerformanta updateEvaluarePerformantaPartial(int id, EvaluarePerformanta evaluarePerformanta) {
        EvaluarePerformanta existingEvaluare = evaluarePerformantaRepository.findById(id).orElse(null);
        if (existingEvaluare != null) {
            if (evaluarePerformanta.getDataEvaluare() != null) {
                existingEvaluare.setDataEvaluare(evaluarePerformanta.getDataEvaluare());
            }
            if (evaluarePerformanta.getScor() != null) {
                existingEvaluare.setScor(evaluarePerformanta.getScor());
            }
            if (evaluarePerformanta.getComentarii() != null) {
                existingEvaluare.setComentarii(evaluarePerformanta.getComentarii());
            }
            return evaluarePerformantaRepository.save(existingEvaluare);
        }
        return null; // Dacă evaluarea nu există
    }


    // Metoda pentru a șterge un angajat
    public void delete(int id) {
        evaluarePerformantaRepository.deleteById(id);
    }
}
