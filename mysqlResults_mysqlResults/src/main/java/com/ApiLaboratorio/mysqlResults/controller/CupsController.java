package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Cups;
import com.ApiLaboratorio.mysqlResults.service.CupsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/cups")
public class CupsController {

    @Autowired
    private CupsService cupsService;

    @GetMapping("/all")
    public List<Cups> getAllCups() {
        return cupsService.getAllCups();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Cups> getCupsByNombre(@PathVariable String nombre) {
        return cupsService.getCupsByNombre(nombre);
    }
}

