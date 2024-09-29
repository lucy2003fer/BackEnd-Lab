package com.ApiLaboratorio.mysqlResults.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiLaboratorio.mysqlResults.entity.Documento;
import com.ApiLaboratorio.mysqlResults.repository.DocumentoRepository;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    // Obtener todos los documentos
    public List<Documento> getAllDocumentos() {
        return documentoRepository.findAll();
    }

    // Obtener un documento por código
    public Optional<Documento> getDocumentoByCodigo(String codigo) {
        return documentoRepository.findByCodigo(codigo);
    }

    // Obtener todos los documentos habilitados
    public List<Documento> getDocumentosHabilitados() {
        return documentoRepository.findAllByHabilitaTrue();
    }

    // Crear o guardar un documento
    public Documento saveDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

    // Eliminar un documento por ID
    public void deleteDocumento(Long id) {
        documentoRepository.deleteById(id);
    }
}
