package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.ListaOpcion;

@Repository
public interface ListaOpcionRepository extends JpaRepository<ListaOpcion, Long> {


    List<ListaOpcion> findAllByHabilitadoTrue();

    List<ListaOpcion> findAllByVariable(String variable);
}
