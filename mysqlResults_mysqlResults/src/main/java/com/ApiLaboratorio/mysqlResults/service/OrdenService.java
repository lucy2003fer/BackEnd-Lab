package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Orden;
import com.ApiLaboratorio.mysqlResults.repository.OrdenRepository;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    public List<Orden> getAllOrdenes() {
        return ordenRepository.findAll();
    }

    public List<Orden> getOrdenesByDocumento(Long documentoId) {
        return ordenRepository.findByDocumentoId(documentoId);
    }

    public List<Orden> getOrdenesByProfesional(Long profesionalOrdenaId) {
        return ordenRepository.findByProfesionalOrdenaId(profesionalOrdenaId);
    }
}

