package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.PruebaOpcion;

@Repository
public interface PruebaOpcionesRepository extends JpaRepository<PruebaOpcion, Long> {

    List<PruebaOpcion> findByPruebaId(Long pruebaId);
}

