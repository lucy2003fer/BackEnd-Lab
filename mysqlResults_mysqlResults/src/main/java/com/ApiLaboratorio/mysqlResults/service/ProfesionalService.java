package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Profesional;
import com.ApiLaboratorio.mysqlResults.repository.ProfesionalRepository;

@Service
public class ProfesionalService {

    @Autowired
    private ProfesionalRepository profesionalRepository;

    public List<Profesional> getAllProfesionales() {
        return profesionalRepository.findAll();
    }
    
    public Optional<Profesional> getProfesionalByCodigo(String codigo) {
        return profesionalRepository.findByCodigo(codigo);
    }
    
    public List<Profesional> getProfesionalesByTipo(Long tipoProfId) {
        return profesionalRepository.findByTipoProfId(tipoProfId);
    }
}

