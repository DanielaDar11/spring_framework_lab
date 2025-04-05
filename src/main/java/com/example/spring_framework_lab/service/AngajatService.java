package com.example.spring_framework_lab.service;

import com.example.spring_framework_lab.model.Angajat;
import com.example.spring_framework_lab.repository.AngajatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngajatService {

    private final AngajatRepository angajatRepository;

    public AngajatService(AngajatRepository angajatRepository) {
        this.angajatRepository = angajatRepository;
    }

    public List<Angajat> findAll() {
        return angajatRepository.findAll();
    }

    public Angajat findById(int id) {
        return angajatRepository.findById(id).orElse(null);
    }

    public Angajat save(Angajat angajat) {
        return angajatRepository.save(angajat);
    }

    public Angajat updateAngajat(int id, Angajat angajat) {
        Angajat existingAngajat = angajatRepository.findById(id).orElse(null);
        if (existingAngajat != null) {
            existingAngajat.setNume(angajat.getNume());
            existingAngajat.setPrenume(angajat.getPrenume());
            existingAngajat.setVarsta(angajat.getVarsta());
            existingAngajat.setSalariu(angajat.getSalariu());
            existingAngajat.setStatusAngajat(angajat.getStatusAngajat());

            if (angajat.getConcedii() != null) {
                existingAngajat.setConcedii(angajat.getConcedii());
            }

            if (angajat.getEvaluariPerformanta() != null) {
                existingAngajat.setEvaluariPerformanta(angajat.getEvaluariPerformanta());
            }

            return angajatRepository.save(existingAngajat);
        }
        return null;
    }

    public Angajat updateAngajatPartial(int id, Angajat angajat) {
        Angajat existingAngajat = angajatRepository.findById(id).orElse(null);
        if (existingAngajat != null) {
            if (angajat.getNume() != null) {
                existingAngajat.setNume(angajat.getNume());
            }
            if (angajat.getPrenume() != null) {
                existingAngajat.setPrenume(angajat.getPrenume());
            }
            if (angajat.getVarsta() != 0) {
                existingAngajat.setVarsta(angajat.getVarsta());
            }
            if (angajat.getSalariu() != 0.0) {
                existingAngajat.setSalariu(angajat.getSalariu());
            }
            if (angajat.getStatusAngajat() != null) {
                existingAngajat.setStatusAngajat(angajat.getStatusAngajat());
            }
            if (angajat.getConcedii() != null) {
                existingAngajat.setConcedii(angajat.getConcedii());
            }
            if (angajat.getEvaluariPerformanta() != null) {
                existingAngajat.setEvaluariPerformanta(angajat.getEvaluariPerformanta());
            }
            return angajatRepository.save(existingAngajat);
        }
        return null;
    }

    public void delete(int id) {
        angajatRepository.deleteById(id);
    }
}
