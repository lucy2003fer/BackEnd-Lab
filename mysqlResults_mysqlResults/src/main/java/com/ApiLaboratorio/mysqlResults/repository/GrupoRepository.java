package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
	List<Grupo> findAllByHabilitadoTrue();

	List<Grupo> findByNombre(String nombre);

}

