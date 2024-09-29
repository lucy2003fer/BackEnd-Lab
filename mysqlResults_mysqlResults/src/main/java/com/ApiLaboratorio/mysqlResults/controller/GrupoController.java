package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Grupo;
import com.ApiLaboratorio.mysqlResults.service.GrupoService;

@RestController
@RequestMapping("/api/grupos")
@CrossOrigin(origins = "http://localhost:3000") 
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping("/all")
    public List<Grupo> getAllGrupos() {
        return grupoService.getAllGrupos();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Grupo> getGruposByNombre(@PathVariable String nombre) {
        return grupoService.getGruposByNombre(nombre);
    }
}

