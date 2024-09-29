package com.ApiLaboratorio.mysqlResults.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "gen_p_documento")
@Data  // Lombok genera automáticamente getters, setters, equals, hashCode, toString
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 'bigint', autogenerado

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;  // 'character varying(255)', con restricción UNIQUE

    @Column(name = "nombre", nullable = false)
    private String nombre;  // 'character varying(254)', no nulo

    @Column(name = "habilita", nullable = false)
    private Boolean habilita = true;  // 'boolean', no nulo con valor por defecto 'true'
}
