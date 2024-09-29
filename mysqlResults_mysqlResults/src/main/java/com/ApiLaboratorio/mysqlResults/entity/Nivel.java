package com.ApiLaboratorio.mysqlResults.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fac_p_nivel")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class Nivel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación con Eps (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "id_eps", nullable = false)
    @JsonIgnore
    private Eps eps;
    
    @Column(name = "nivel", nullable = false)
    private String nivel;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    // Relación con ListaOpcion (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "id_regimen", nullable = false) // clave no nula
    @JsonIgnore
    private ListaOpcion regimen;

    @Column(name = "habilita", nullable = true)
    private Boolean habilitado;  
    
    // Relación con Tarjetero (OneToMany)
    @OneToMany(mappedBy = "nivel")
    @JsonIgnoreProperties("nivel")
    private List<Tarjetero> tarjeteros;
}

