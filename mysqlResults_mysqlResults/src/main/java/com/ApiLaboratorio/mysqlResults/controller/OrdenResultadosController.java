package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.OrdenResultado;
import com.ApiLaboratorio.mysqlResults.repository.OrdenResultadoRepository;
import com.ApiLaboratorio.mysqlResults.service.OrdenResultadosService;

@RestController
@RequestMapping("/api/orden-resultados")
@CrossOrigin(origins="http://localhost:3000")
public class OrdenResultadosController {

    @Autowired
    private OrdenResultadosService ordenResultadosService;
    @Autowired
    private OrdenResultadoRepository ordenResultadoRepository;

    @GetMapping("/all")
    public List<OrdenResultado> getAllOrdenResultados() {
        return ordenResultadosService.getAllOrdenResultados();
    }
    
    @GetMapping("/{id}")
    public Optional<OrdenResultado> getById(@PathVariable Long id){
    	return ordenResultadoRepository.findById(id);
    }
    
    @GetMapping("/orden/{ordenId}")
    public List<OrdenResultado> getResultadosByOrden(@PathVariable Long ordenId) {
        return ordenResultadosService.getResultadosByOrden(ordenId);
    }

    @GetMapping("/prueba/{pruebaId}")
    public List<OrdenResultado> getResultadosByPrueba(@PathVariable Long pruebaId) {
        return ordenResultadosService.getResultadosByPrueba(pruebaId);
    }
    
    @GetMapping("/first")
    public List<OrdenResultado> getFirst100(){
    	return ordenResultadosService.getFirst100();
    }
}
