package com.ApiLaboratorio.mysqlResults.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.ListaOpcion;
import com.ApiLaboratorio.mysqlResults.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    Optional<Persona> findByNumeroIdentificacion(String numeroIdentificacion);

    List<Persona> findByNombre1(String nombre1);


    List<Persona> findByApellido1(String apellido1);
    
    Optional<Persona> findByTipoIdentificacionAndNumeroIdentificacionAndFechaNacimiento(ListaOpcion tipoIdentificacion, String numeroIdentificacion, Date fechaNacimiento);

}
