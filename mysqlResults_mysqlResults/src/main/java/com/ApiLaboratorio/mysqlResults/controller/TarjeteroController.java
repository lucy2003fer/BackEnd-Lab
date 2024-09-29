package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Tarjetero;
import com.ApiLaboratorio.mysqlResults.service.TarjeteroService;

@RestController
@RequestMapping("/api/tarjeteros")
public class TarjeteroController {

    private final TarjeteroService tarjeteroService;

    @Autowired
    public TarjeteroController(TarjeteroService tarjeteroService) {
        this.tarjeteroService = tarjeteroService;
    }

    @GetMapping
    public List<Tarjetero> getAllTarjeteros() {
        return tarjeteroService.getAllTarjeteros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarjetero> getTarjeteroById(@PathVariable Long id) {
        Optional<Tarjetero> tarjetero = tarjeteroService.getTarjeteroById(id);
        return tarjetero.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }

}




