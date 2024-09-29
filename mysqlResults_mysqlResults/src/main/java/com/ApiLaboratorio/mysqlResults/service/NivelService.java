package com.ApiLaboratorio.mysqlResults.service;

import com.ApiLaboratorio.mysqlResults.entity.Nivel;
import com.ApiLaboratorio.mysqlResults.repository.NivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelService {

    @Autowired
    private NivelRepository nivelRepository;

    public List<Nivel> getAllNiveles() {
        return nivelRepository.findAll();
    }

    public List<Nivel> getNivelesHabilitado() {
        return nivelRepository.findByHabilitadoTrue();
    }

}


