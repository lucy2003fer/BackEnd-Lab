package com.ApiLaboratorio.mysqlResults.service;

import com.ApiLaboratorio.mysqlResults.entity.Prueba;
import com.ApiLaboratorio.mysqlResults.repository.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PruebaService {

    @Autowired
    private PruebaRepository pruebaRepository;


    public List<Prueba> getAllPruebas() {
        return pruebaRepository.findAll();
    }


    public Optional<Prueba> getPruebaById(Long id) {
        return pruebaRepository.findById(id);
    }


    public Prueba savePrueba(Prueba prueba) {
        return pruebaRepository.save(prueba);
    }


    public void deletePrueba(Long id) {
        pruebaRepository.deleteById(id);
    }
    
    public List<Prueba> findByCodigoPrueba(String codigoPrueba) {
        return pruebaRepository.findByCodigoPrueba(codigoPrueba);
    }
}


