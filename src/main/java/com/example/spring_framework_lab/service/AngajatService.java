package com.example.spring_framework_lab.service;

import com.example.spring_framework_lab.model.Angajat;
import com.example.spring_framework_lab.model.Concediu;
import com.example.spring_framework_lab.repository.AngajatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AngajatService {

    private final AngajatRepository angajatRepository;

    public AngajatService(AngajatRepository angajatRepository) {
        this.angajatRepository = angajatRepository;
    }

    // Metoda pentru a gasi toti angajatii
    public List<Angajat> findAll() {
        return angajatRepository.findAll();
    }

    // Metoda pentru a gasi un angajat dupa ID
    public Angajat findById(int id) {
        Optional<Angajat> angajat = angajatRepository.findById(id);
        return angajat.orElse(null); // Returneaza null daca nu este gasit
    }

    // Metoda pentru a salva un angajat
    public Angajat save(Angajat angajat) {
        return angajatRepository.save(angajat);
    }

    //Metoda pentru actualizarea unui angajat
    public Angajat updateAngajat(int id, Angajat angajat) {
        Angajat existingAngajat = angajatRepository.findById(id).orElse(null);
        if (existingAngajat != null) {
            // Actualizam campurile din Angajat
            existingAngajat.setNume(angajat.getNume());
            existingAngajat.setPrenume(angajat.getPrenume());
            existingAngajat.setVarsta(angajat.getVarsta());
            existingAngajat.setSalariu(angajat.getSalariu());
            existingAngajat.setStatusAngajat(angajat.getStatusAngajat());

            // Actualizam obiectele Concediu si EvaluarePerformanta
            if (angajat.getConcediu() != null) {
                existingAngajat.setConcediu(angajat.getConcediu());
            }

            if (angajat.getEvaluarePerformanta() != null) {
                existingAngajat.setEvaluarePerformanta(angajat.getEvaluarePerformanta());
            }

            // Salvez angajatul actualizat ( va salva si obiectele asociate datorita CascadeType.ALL)
            Angajat updatedAngajat = angajatRepository.save(existingAngajat);

            System.out.println("Angajat actualizat: " + updatedAngajat);
            return updatedAngajat;
        }
        return null;
    }


    public Angajat updateAngajatPartial(int id, Angajat angajat) {
        Angajat existingAngajat = angajatRepository.findById(id).orElse(null);
        if (existingAngajat != null) {
            // Actualizez campurile angajatului doar daca acestea nu sunt nule
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
            if (angajat.getConcediu() != null) { // Daca concediu nu este null, actualizez concediul
                existingAngajat.setConcediu(angajat.getConcediu());
            }
            if (angajat.getEvaluarePerformanta() != null) { // Daca evaluarePerformanta nu este null, actualizez evaluarea
                existingAngajat.setEvaluarePerformanta(angajat.getEvaluarePerformanta());
            }
            // Salvez angajatul actualizat
            return angajatRepository.save(existingAngajat);
        }
        return null;
    }




    // Metoda pentru a sterge un angajat
    public void delete(int id) {
        angajatRepository.deleteById(id); // Șterge angajatul din baza de date
    }
}
