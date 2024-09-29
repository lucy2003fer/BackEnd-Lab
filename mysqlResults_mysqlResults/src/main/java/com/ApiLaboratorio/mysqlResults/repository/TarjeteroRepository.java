package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Tarjetero;

@Repository
public interface TarjeteroRepository extends JpaRepository<Tarjetero, Long> {
    List<Tarjetero> findByHistoriaContaining(String historia);
}


