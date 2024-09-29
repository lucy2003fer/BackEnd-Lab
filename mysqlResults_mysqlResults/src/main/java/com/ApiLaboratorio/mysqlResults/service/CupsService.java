package com.ApiLaboratorio.mysqlResults.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ApiLaboratorio.mysqlResults.entity.Cups;
import com.ApiLaboratorio.mysqlResults.repository.CupsRepository;

import java.util.List;

@Service
public class CupsService {

    @Autowired
    private CupsRepository cupsRepository;

    public List<Cups> getAllCups() {
        return cupsRepository.findAll();
    }

    public List<Cups> getCupsByNombre(String nombre) {
        return cupsRepository.findByNombre(nombre);
    }
}


