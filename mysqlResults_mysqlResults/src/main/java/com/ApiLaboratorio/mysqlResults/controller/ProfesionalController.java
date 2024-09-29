package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Profesional;
import com.ApiLaboratorio.mysqlResults.service.ProfesionalService;

@RestController
@RequestMapping("/api/profesional")
public class ProfesionalController {

    @Autowired
    private ProfesionalService profesionalService;

    @GetMapping("/all")
    public List<Profesional> getAllProfesionales() {
        return profesionalService.getAllProfesionales();
    }

    @GetMapping("/codigo/{codigo}")
    public Profesional getProfesionalByCodigo(@PathVariable String codigo) {
        return profesionalService.getProfesionalByCodigo(codigo).orElse(null);
    }
}

