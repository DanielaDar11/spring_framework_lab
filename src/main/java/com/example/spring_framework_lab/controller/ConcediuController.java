package com.example.spring_framework_lab.controller;

import com.example.spring_framework_lab.model.Concediu;
import com.example.spring_framework_lab.service.ConcediuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concedii")
public class ConcediuController {

    private final ConcediuService concediuService;

    @Autowired
    public ConcediuController(ConcediuService concediuService) {
        this.concediuService = concediuService;
    }


    @GetMapping
    public List<Concediu> getAllConcedii() {
        return concediuService.findAll();
    }


    @GetMapping("/{id}")
    public Concediu getById(@PathVariable int id) {
        return concediuService.findById(id);
    }


    @PostMapping
    public Concediu createConcediu(@RequestBody Concediu concediu) {
        return concediuService.save(concediu); // Salveaza concediul
    }


    @PutMapping("/{id}")
    public Concediu updateConcediu(@PathVariable int id, @RequestBody Concediu concediu) {
        return concediuService.updateConcediu(id, concediu); // Actualizeaza concediul
    }

    @PatchMapping("/{id}")
    public Concediu patchConcediu(@PathVariable int id, @RequestBody Concediu concediu) {
        concediu.setId(id);  // Setam ID-ul pentru a actualiza obiectul existent
        return concediuService.updateConcediuPartial(id, concediu);  // Actualizeaza doar campurile trimise
    }


    @DeleteMapping("/{id}")
    public void deleteConcediu(@PathVariable int id) {
        concediuService.delete(id); // Șterge concediul
    }
}
