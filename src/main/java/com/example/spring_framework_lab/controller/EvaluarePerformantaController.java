package com.example.spring_framework_lab.controller;

import com.example.spring_framework_lab.model.Concediu;
import com.example.spring_framework_lab.model.EvaluarePerformanta;
import com.example.spring_framework_lab.service.EvaluarePerformantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluari")
public class EvaluarePerformantaController {

    private final EvaluarePerformantaService evaluarePerformantaService;

    @Autowired
    public EvaluarePerformantaController(EvaluarePerformantaService evaluarePerformantaService) {
        this.evaluarePerformantaService = evaluarePerformantaService;
    }

    @GetMapping
    public List<EvaluarePerformanta> getAll() {
        return evaluarePerformantaService.findAll();
    }

    @GetMapping("/{id}")
    public EvaluarePerformanta getById(@PathVariable int id) {
        return evaluarePerformantaService.findById(id);
    }

    @PostMapping
    public EvaluarePerformanta save(@RequestBody EvaluarePerformanta evaluarePerformanta) {
        return evaluarePerformantaService.save(evaluarePerformanta);
    }

    @PutMapping("/{id}")
    public EvaluarePerformanta update(@PathVariable int id, @RequestBody EvaluarePerformanta evaluarePerformanta) {
        return evaluarePerformantaService.update(id, evaluarePerformanta);
    }

    @PatchMapping("/{id}")
    public EvaluarePerformanta patchEvaluarePerformanta(@PathVariable int id, @RequestBody EvaluarePerformanta evaluarePerformanta) {
        evaluarePerformanta.setId(id);  // Setam ID-ul pentru a actualiza obiectul existent
        return evaluarePerformantaService.updateEvaluarePerformantaPartial(id, evaluarePerformanta);  // Actualizeaza doar campurile trimise
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        evaluarePerformantaService.delete(id);
    }
}
