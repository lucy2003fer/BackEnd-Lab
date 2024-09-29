package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    Optional<Documento> findByCodigo(String codigo);

    List<Documento> findAllByHabilitaTrue();  // Método para obtener documentos habilitados
}
