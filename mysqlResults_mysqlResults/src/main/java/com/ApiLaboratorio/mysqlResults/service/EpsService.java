package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Eps;
import com.ApiLaboratorio.mysqlResults.repository.EpsRepository;

@Service
public class EpsService {

    @Autowired
    private EpsRepository epsRepository;

    public List<Eps> getAllEps() {
        return epsRepository.findAll();
    }

    public Optional<Eps> getEpsById(Long id) {
        return epsRepository.findById(id);
    }

}


