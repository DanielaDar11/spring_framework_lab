package com.example.spring_framework_lab.service;

import com.example.spring_framework_lab.model.Concediu;
import com.example.spring_framework_lab.repository.ConcediuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConcediuService {

    private final ConcediuRepository concediuRepository;

    @Autowired
    public ConcediuService(ConcediuRepository concediuRepository) {
        this.concediuRepository = concediuRepository;
    }

    // Metoda pentru a găsi toate concediile
    public List<Concediu> findAll() {
        return concediuRepository.findAll(); // Presupunând că ai un repository configurat corect
    }

    // Metoda pentru a găsi un concediu după ID
    public Concediu findById(int id) {
        Optional<Concediu> concediu = concediuRepository.findById(id);
        return concediu.orElse(null); // Returnează null dacă nu este găsit
    }

    // Metoda pentru a salva un concediu
    public Concediu save(Concediu concediu) {
        return concediuRepository.save(concediu); // Salvează concediul în baza de date
    }

    // Metoda pentru a actualiza un concediu
    public Concediu updateConcediu(int id, Concediu concediu) {
        Concediu existingConcediu = concediuRepository.findById(id).orElse(null);
        if (existingConcediu != null) {
            existingConcediu.setTipConcediu(concediu.getTipConcediu());
            existingConcediu.setZile(concediu.getZile());
            existingConcediu.setDataIncepere(concediu.getDataIncepere());
            existingConcediu.setDataSfarsit(concediu.getDataSfarsit());
            Concediu updatedConcediu = concediuRepository.save(existingConcediu);
            System.out.println("Concediu actualizat: " + updatedConcediu);
            return updatedConcediu;
        }
        return null; // Dacă concediul nu există
    }


    public Concediu updateConcediuPartial(int id, Concediu concediu) {
        Concediu existingConcediu = concediuRepository.findById(id).orElse(null);
        if (existingConcediu != null) {
            if (concediu.getTipConcediu() != null) {
                existingConcediu.setTipConcediu(concediu.getTipConcediu());
            }
            if (concediu.getZile() != null) { // Acum se poate compara cu null
                existingConcediu.setZile(concediu.getZile());
            }
            if (concediu.getDataIncepere() != null) {
                existingConcediu.setDataIncepere(concediu.getDataIncepere());
            }
            if (concediu.getDataSfarsit() != null) {
                existingConcediu.setDataSfarsit(concediu.getDataSfarsit());
            }
            return concediuRepository.save(existingConcediu);
        }
        return null; // Dacă concediul nu există
    }



    // Metoda pentru a șterge un concediu
    public void delete(int id) {
        concediuRepository.deleteById(id);
    }
}
