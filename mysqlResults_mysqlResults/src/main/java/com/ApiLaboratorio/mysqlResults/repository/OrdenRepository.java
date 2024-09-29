package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {

    List<Orden> findByDocumentoId(Long documentoId);
   
    List<Orden> findByProfesionalOrdenaId(Long profesionalOrdenaId);
    
    
}

