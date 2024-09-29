package com.ApiLaboratorio.mysqlResults.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.ListaOpcion;
import com.ApiLaboratorio.mysqlResults.repository.ListaOpcionRepository;

@Service
public class ListaOpcionService {

    @Autowired
    private ListaOpcionRepository listaOpcionRepository;

    public List<ListaOpcion> getAllOpciones() {
        return listaOpcionRepository.findAll();
    }


    public List<ListaOpcion> getOpcionesHabilitado() {
        return listaOpcionRepository.findAllByHabilitadoTrue();
    }
    
    public List<ListaOpcion> getAllByVariable(String variable){
    	return listaOpcionRepository.findAllByVariable(variable);
    }
}


