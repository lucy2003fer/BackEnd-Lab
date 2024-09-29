package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Procedimiento;
import com.ApiLaboratorio.mysqlResults.repository.ProcedimientoRepository;

@Service
public class ProcedimientoService {

    @Autowired
    private ProcedimientoRepository procedimientoRepository;

 
    public List<Procedimiento> getAllProcedimientos() {
        return procedimientoRepository.findAll();
    }
    
    public List<Procedimiento> getProcedimientosByGrupoLaboratorio(Long grupoLaboratorioId) {
        return procedimientoRepository.findByGrupoLaboratorioId(grupoLaboratorioId);
    }

    public List<Procedimiento> getProcedimientosByCups(Long cupsId) {
        return procedimientoRepository.findByCupsId(cupsId);
    }
}

