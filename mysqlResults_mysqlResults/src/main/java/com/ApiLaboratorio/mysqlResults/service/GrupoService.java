package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Grupo;
import com.ApiLaboratorio.mysqlResults.repository.GrupoRepository;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupo> getAllGrupos() {
        return grupoRepository.findAll();
    }

    public List<Grupo> getGruposByNombre(String nombre) {
        return grupoRepository.findByNombre(nombre);
    }

    public List<Grupo> getGruposHabilitado() {
        return grupoRepository.findAllByHabilitadoTrue();
    }
}

