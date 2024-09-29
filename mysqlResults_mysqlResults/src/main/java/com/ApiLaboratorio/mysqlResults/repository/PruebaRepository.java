package com.ApiLaboratorio.mysqlResults.repository;

import com.ApiLaboratorio.mysqlResults.entity.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Long> {

    List<Prueba> findByCodigoPrueba(String codigoPrueba);
}


