package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.ListaOpcion;
import com.ApiLaboratorio.mysqlResults.service.ListaOpcionService;

@RestController
@RequestMapping("/api/lista-opcion")
@CrossOrigin(origins = "http://localhost:3000") 
public class ListaOpcionController {

    @Autowired
    private ListaOpcionService listaOpcionService;

    @GetMapping("/all")
    public List<ListaOpcion> getAllOpciones() {
        return listaOpcionService.getAllOpciones();
    }

    @GetMapping("/habilitadas")
    public List<ListaOpcion> getOpcionesHabilitado() {
        return listaOpcionService.getOpcionesHabilitado();
    }
    
    @GetMapping("/tipo/{id}")
    public List<ListaOpcion> getAllByVariable(@PathVariable String id){
    	return listaOpcionService.getAllByVariable(id);
    }
}

