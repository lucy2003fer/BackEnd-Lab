package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Procedimiento;
import com.ApiLaboratorio.mysqlResults.service.ProcedimientoService;

@RestController
@RequestMapping("/api/procedimientos")
public class ProcedimientoController {

    @Autowired
    private ProcedimientoService procedimientoService;

    @GetMapping("/all")
    public List<Procedimiento> getAllProcedimientos() {
        return procedimientoService.getAllProcedimientos();
    }

    @GetMapping("/cups/{cupsId}")
    public List<Procedimiento> getProcedimientosByCups(@PathVariable Long cupsId) {
        return procedimientoService.getProcedimientosByCups(cupsId);
    }
}

