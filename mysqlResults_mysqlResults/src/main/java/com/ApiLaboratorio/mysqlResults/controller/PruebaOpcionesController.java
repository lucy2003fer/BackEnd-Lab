package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.PruebaOpcion;
import com.ApiLaboratorio.mysqlResults.service.PruebaOpcionesService;

@RestController
@RequestMapping("/api/prueba-opciones")
public class PruebaOpcionesController {

    @Autowired
    private PruebaOpcionesService pruebaOpcionesService;

    @GetMapping("/all")
    public List<PruebaOpcion> getAllPruebaOpciones() {
        return pruebaOpcionesService.getAllPruebaOpciones();
    }

    @GetMapping("/prueba/{pruebaId}")
    public List<PruebaOpcion> getOpcionesByPrueba(@PathVariable Long pruebaId) {
        return pruebaOpcionesService.getOpcionesByPrueba(pruebaId);
    }
}

