package com.ApiLaboratorio.mysqlResults.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gen_p_eps")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo; 

    // Cambiar "razonsocial" a "razonsocial" (sin el guion bajo) y agregar "razon_social"
    @Column(name = "razonsocial", nullable = false)
    private String razonSocial;

    @Column(name = "razon_social")
    private String razonSocialAlt;  // Segunda columna "razon_social" (no nula según la tabla)

    @Column(name = "nit")
    private String nit; 

    @Column(name = "habilita", nullable = false)
    private Boolean habilita;

    // Relación bidireccional con Nivel
    @OneToMany(mappedBy = "eps", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Nivel> niveles;
    
    // Relación bidireccional con Tarjetero
    @OneToMany(mappedBy = "eps")
    @JsonIgnoreProperties("eps")
    private List<Tarjetero> tarjeteros; 
}

