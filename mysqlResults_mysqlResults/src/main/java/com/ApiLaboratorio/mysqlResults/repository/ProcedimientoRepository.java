package com.ApiLaboratorio.mysqlResults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiLaboratorio.mysqlResults.entity.Procedimiento;

@Repository
public interface ProcedimientoRepository extends JpaRepository<Procedimiento, Long> {

    List<Procedimiento> findByGrupoLaboratorioId(Long grupoLaboratorioId);
    
    List<Procedimiento> findByCupsId(Long cupsId);
}
