package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.OrdenResultado;

@Repository
public interface OrdenResultadoRepository extends JpaRepository<OrdenResultado, Long> {

    List<OrdenResultado> findByOrdenId(Long ordenId);
    
    List<OrdenResultado> findByPruebaId(Long pruebaId);
    
    @Query(value = "SELECT * FROM lab_m_orden_resultados LIMIT 100", nativeQuery = true)
    List<OrdenResultado> findFirst100();
}
