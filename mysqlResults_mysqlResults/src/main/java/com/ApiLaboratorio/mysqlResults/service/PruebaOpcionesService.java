package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.PruebaOpcion;
import com.ApiLaboratorio.mysqlResults.repository.PruebaOpcionesRepository;

@Service
public class PruebaOpcionesService {

    @Autowired
    private PruebaOpcionesRepository pruebaOpcionesRepository;

    public List<PruebaOpcion> getAllPruebaOpciones() {
        return pruebaOpcionesRepository.findAll();
    }
    
    public List<PruebaOpcion> getOpcionesByPrueba(Long pruebaId) {
        return pruebaOpcionesRepository.findByPruebaId(pruebaId);
    }
}

