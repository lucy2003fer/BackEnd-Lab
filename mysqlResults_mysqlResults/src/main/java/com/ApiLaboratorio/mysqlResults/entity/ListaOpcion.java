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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gen_p_listaopcion")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class ListaOpcion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "variable", nullable = false)
    private String variable;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "valor", nullable = false)
    private String valor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    // Reflejamos tanto abreviación como abreviatura de la tabla
    @Column(name = "abreviacion", nullable = false)
    private String abreviacion;

    @Column(name = "abreviatura", nullable = true)  // Este campo es opcional en la tabla
    private String abreviatura;
    
    @Column(name = "habilita", nullable = false)
    private boolean habilitado;

    // Relación bidireccional con Nivel
    @OneToMany(mappedBy = "regimen", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("tarjeteros")
    private List<Nivel> niveles;
    
    @OneToMany(mappedBy = "regimen")
    @JsonIgnore // Usar esta anotación para la relación inversa
    private List<Tarjetero> tarjeteros;
}

