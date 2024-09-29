package com.ApiLaboratorio.mysqlResults.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ApiLaboratorio.mysqlResults.entity.Cups;

import java.util.List;

@Repository
public interface CupsRepository extends JpaRepository<Cups, Long> {
    List<Cups> findByNombre(String nombre);
}


