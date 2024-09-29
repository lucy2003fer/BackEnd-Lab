package com.ApiLaboratorio.mysqlResults.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fac_p_cups")
@Data
public class Cups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 'bigint'

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;  // 'character varying(255)'

    @Column(name = "nombre", nullable = false)
    private String nombre;  // 'character varying(255)'

    @Column(name = "habilita", nullable = true)
    private Boolean habilita = true;  // 'boolean', con valor por defecto true
}
