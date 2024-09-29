package com.ApiLaboratorio.mysqlResults.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lab_m_orden_resultados")
@Data
public class OrdenResultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_orden", nullable = false)
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_procedimiento", nullable = false)
    @JsonIgnore
    private Procedimiento procedimiento;

    @ManyToOne
    @JoinColumn(name = "id_prueba", nullable = false)
    @JsonIgnore
    private Prueba prueba;

    @ManyToOne
    @JoinColumn(name = "id_pruebaopcion")
    @JsonIgnore
    private PruebaOpcion pruebaOpcion;

    private String resOpcion;

    private Double resNumerico;

    @Column(name = "resTexto", columnDefinition = "TEXT")
    private String resTexto;

    @Column(name = "resMemo", columnDefinition = "TEXT")
    private String resMemo;

    private Integer numProcesamientos;
}


