package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Tarjetero;
import com.ApiLaboratorio.mysqlResults.repository.TarjeteroRepository;

@Service
public class TarjeteroService {

    private final TarjeteroRepository tarjeteroRepository;

    @Autowired
    public TarjeteroService(TarjeteroRepository tarjeteroRepository) {
        this.tarjeteroRepository = tarjeteroRepository;
    }

    public List<Tarjetero> getAllTarjeteros() {
        return tarjeteroRepository.findAll();
    }

    public Optional<Tarjetero> getTarjeteroById(Long id) {
        return tarjeteroRepository.findById(id);
    }

    public Tarjetero createTarjetero(Tarjetero tarjetero) {
        return tarjeteroRepository.save(tarjetero);
    }

    public void deleteTarjetero(Long id) {
        tarjeteroRepository.deleteById(id);
    }
}


