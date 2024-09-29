package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Orden;
import com.ApiLaboratorio.mysqlResults.service.OrdenService;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @GetMapping("/all")
    public List<Orden> getAllOrdenes() {
        return ordenService.getAllOrdenes();
    }

    @GetMapping("/documento/{documentoId}")
    public List<Orden> getOrdenesByDocumento(@PathVariable Long documentoId) {
        return ordenService.getOrdenesByDocumento(documentoId);
    }

    @GetMapping("/profesional/{profesionalId}")
    public List<Orden> getOrdenesByProfesional(@PathVariable Long profesionalId) {
        return ordenService.getOrdenesByProfesional(profesionalId);
    }
}

