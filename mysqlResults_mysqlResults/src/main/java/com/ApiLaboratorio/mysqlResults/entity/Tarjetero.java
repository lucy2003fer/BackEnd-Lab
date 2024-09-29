package com.ApiLaboratorio.mysqlResults.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fac_m_tarjetero")
@Data
public class Tarjetero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String historia;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    @JsonIgnore
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_regimen", nullable = false)
    @JsonIgnoreProperties("niveles")
    private ListaOpcion regimen;

    @ManyToOne
    @JoinColumn(name = "id_eps")
    @JsonIgnoreProperties("tarjeteros")
    private Eps eps;

    @ManyToOne
    @JoinColumn(name = "id_nivel")
    @JsonIgnoreProperties("tarjeteros")
    private Nivel nivel;
}

