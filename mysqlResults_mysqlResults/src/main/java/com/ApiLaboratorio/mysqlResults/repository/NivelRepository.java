package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiLaboratorio.mysqlResults.entity.Nivel;

public interface NivelRepository extends JpaRepository<Nivel, Long> {
    List<Nivel> findByHabilitadoTrue();
}

