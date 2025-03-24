package com.example.spring_framework_lab.controller;

import com.example.spring_framework_lab.model.Angajat;
import com.example.spring_framework_lab.service.AngajatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/angajati")
public class AngajatController {

    private final AngajatService angajatService;

    @Autowired
    public AngajatController(AngajatService angajatService) {
        this.angajatService = angajatService;
    }

    @GetMapping
    public List<Angajat> getAllAngajati() {
        return angajatService.findAll();
    }

    @GetMapping("/{id}")
    public Angajat getAngajatById(@PathVariable int id) {
        return angajatService.findById(id);
    }

    @PostMapping
    public Angajat createAngajat(@RequestBody Angajat angajat) {
        return angajatService.save(angajat);
    }

    @PutMapping("/{id}")
    public Angajat updateAngajat(@PathVariable int id, @RequestBody Angajat angajat) {
        return angajatService.updateAngajat(id, angajat);
    }


    @PatchMapping("/{id}")
    public Angajat patchAngajat(@PathVariable int id, @RequestBody Angajat angajat) {
        angajat.setId(id);  // Setam ID-ul pentru a actualiza obiectul existent
        return angajatService.updateAngajatPartial(id, angajat);  // Actualizeaza doar campurile trimise
    }


    @DeleteMapping("/{id}")
    public void deleteAngajat(@PathVariable int id) {
        angajatService.delete(id);
    }
}
