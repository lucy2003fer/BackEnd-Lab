package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.OrdenResultado;
import com.ApiLaboratorio.mysqlResults.repository.OrdenResultadoRepository;

@Service

public class OrdenResultadosService {
    @Autowired
    private OrdenResultadoRepository ordenResultadoRepository;

    public List<OrdenResultado> getAllOrdenResultados() {
        return ordenResultadoRepository.findAll();
    }

    public List<OrdenResultado> getResultadosByOrden(Long ordenId) {
        return ordenResultadoRepository.findByOrdenId(ordenId);
    }

    public List<OrdenResultado> getResultadosByPrueba(Long pruebaId) {
        return ordenResultadoRepository.findByPruebaId(pruebaId);
    }
    
    public List<OrdenResultado> getFirst100(){
    	return ordenResultadoRepository.findFirst100();
    }
}