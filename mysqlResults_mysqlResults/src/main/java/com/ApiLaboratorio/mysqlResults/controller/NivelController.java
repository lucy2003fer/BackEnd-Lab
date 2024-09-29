package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Nivel;
import com.ApiLaboratorio.mysqlResults.service.NivelService;

@RestController
@RequestMapping("/api/niveles")
@CrossOrigin(origins = "http://localhost:3000") 
public class NivelController {

    @Autowired
    private NivelService nivelService;

    // Obtener todos los niveles
    @GetMapping
    public List<Nivel> getAllNiveles() {
        return nivelService.getAllNiveles();
    }

    // Obtener los niveles habilitados
    @GetMapping("/habilitados")
    public List<Nivel> getNivelesHabilitado() {
        return nivelService.getNivelesHabilitado();
    }
}


