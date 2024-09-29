package com.ApiLaboratorio.mysqlResults.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.ListaOpcion;
import com.ApiLaboratorio.mysqlResults.entity.Persona;
import com.ApiLaboratorio.mysqlResults.repository.ListaOpcionRepository;
import com.ApiLaboratorio.mysqlResults.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins="http://localhost:3000")
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private ListaOpcionRepository listaOpcionRepository;

    @GetMapping("/all")
    public List<Persona> getAllPersonas() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Persona> getPersonasByNombre1(@PathVariable String nombre) {
        return personaService.getPersonasByNombre1(nombre);
    }
    
    @GetMapping("/buscar")
    public Optional<Persona> buscarPersona(
        @RequestParam("tipoId") Long tipoId,
        @RequestParam("numeroId") String numeroId,
        @RequestParam("fechaNac") Date fechaNac) {
    	
    	ListaOpcion listaOpcion = listaOpcionRepository.findById(tipoId).orElse(null);
    	
        return personaService.buscarPorIdentificacion(listaOpcion, numeroId, fechaNac);
    }
}

