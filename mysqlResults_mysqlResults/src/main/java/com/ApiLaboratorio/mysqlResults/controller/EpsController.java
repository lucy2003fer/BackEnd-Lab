package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Eps;
import com.ApiLaboratorio.mysqlResults.service.EpsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/eps")
public class EpsController {

    @Autowired
    private EpsService epsService;

    @GetMapping
    public List<Eps> getAllEps() {
        return epsService.getAllEps();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Eps> getEpsById(@PathVariable Long id) {
        Optional<Eps> eps = epsService.getEpsById(id);
        return eps.map(ResponseEntity::ok)
                  .orElseGet(() -> ResponseEntity.notFound().build());
    }

}


