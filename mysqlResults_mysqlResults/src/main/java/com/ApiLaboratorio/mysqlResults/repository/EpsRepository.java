package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Eps;

@Repository
public interface EpsRepository extends JpaRepository<Eps, Long> {

    // Método para encontrar una EPS por su código
    Eps findByCodigo(String codigo);

    // Método para encontrar todas las EPS habilitadas
    List<Eps> findByHabilitaTrue(); // Cambiado a 'habilita'
}



