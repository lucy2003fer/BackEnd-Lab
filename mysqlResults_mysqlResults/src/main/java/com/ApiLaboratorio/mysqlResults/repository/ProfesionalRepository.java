package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Profesional;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, Long> {

    Optional<Profesional> findByCodigo(String codigo);
   
    List<Profesional> findByTipoProfId(Long tipoProfId);
}

