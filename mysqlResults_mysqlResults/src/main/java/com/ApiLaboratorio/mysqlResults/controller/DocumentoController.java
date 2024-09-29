package com.ApiLaboratorio.mysqlResults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiLaboratorio.mysqlResults.entity.Documento;
import com.ApiLaboratorio.mysqlResults.service.DocumentoService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    @GetMapping("/all")
    public List<Documento> getAllDocumentos() {
        return documentoService.getAllDocumentos();
    }

    @GetMapping("/habilitados")
    public List<Documento> getDocumentosHabilitados() {
        return documentoService.getDocumentosHabilitados();
    }
}

