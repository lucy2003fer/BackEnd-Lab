package com.ApiLaboratorio.mysqlResults.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lab_m_orden")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orden {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private Documento documento;

    private String orden;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_historia")
    @JsonIgnoreProperties("regimen")
    private Tarjetero historia;

    @ManyToOne
    @JoinColumn(name = "id_profesional_ordena")
    private Profesional profesionalOrdena;

    
    private Boolean profesional_externo = false;

    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrdenResultado> ordenResultados;

    
    @JsonIgnoreProperties("ordenResultados")
    public Orden(Boolean profesional_externo) {
        this.profesional_externo = profesional_externo;
    }
}
