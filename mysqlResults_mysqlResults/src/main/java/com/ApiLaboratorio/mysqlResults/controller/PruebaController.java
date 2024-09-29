package com.ApiLaboratorio.mysqlResults.controller;

import com.ApiLaboratorio.mysqlResults.entity.Prueba;
import com.ApiLaboratorio.mysqlResults.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pruebas")
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;


    @GetMapping
    public List<Prueba> getAllPruebas() {
        return pruebaService.getAllPruebas();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Prueba> getPruebaById(@PathVariable Long id) {
        Optional<Prueba> prueba = pruebaService.getPruebaById(id);
        return prueba.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping("/codigo/{codigoPrueba}")
    public List<Prueba> getPruebaByCodigo(@PathVariable String codigoPrueba) {
        return pruebaService.findByCodigoPrueba(codigoPrueba);
    }
}


