package com.ApiLaboratorio.mysqlResults.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.ListaOpcion;
import com.ApiLaboratorio.mysqlResults.entity.Persona;
import com.ApiLaboratorio.mysqlResults.repository.PersonaRepository;

@Service
public class PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public Optional<Persona> getPersonaByIdentificacion(String numeroIdentificacion) {
        return personaRepository.findByNumeroIdentificacion(numeroIdentificacion);
    }

    public List<Persona> getPersonasByNombre1(String nombre1) {
        return personaRepository.findByNombre1(nombre1);
    }
    
    public Optional<Persona> buscarPorIdentificacion(ListaOpcion tipoId, String numeroId, Date fechaNac) {
        return personaRepository.findByTipoIdentificacionAndNumeroIdentificacionAndFechaNacimiento(tipoId, numeroId, fechaNac);
    }

}
