package com.ApiLaboratorio.mysqlResults.entity;

import java.sql.Date;
import java.util.List;

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
import lombok.Data;

@Entity
@Table(name = "gen_m_persona")
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 'bigint'

    // 'id_tipoid' es un Integer
    @ManyToOne
    @JoinColumn(name = "id_tipoid", nullable = false)
    private ListaOpcion tipoIdentificacion;

    // 'numeroid' (character varying(20))
    @Column(name = "numeroid", nullable = false)
    private String numeroIdentificacion;

    // 'apellido1' y 'apellido2' (character varying(255))
    @Column(name = "apellido1", nullable = false)
    private String apellido1;

    @Column(name = "apellido2", nullable = false)
    private String apellido2;

    // 'nombre1' y 'nombre2' (character varying(255))
    @Column(name = "nombre1", nullable = false)
    private String nombre1;

    @Column(name = "nombre2", nullable = false)
    private String nombre2;

    // 'fechanac' (date)
    @Column(name = "fechanac")
    private Date fechaNacimiento;

    // 'id_sexobiologico' (bigint)
    @ManyToOne
    @JoinColumn(name = "id_sexobiologico")
    private ListaOpcion sexoBiologico;

    // 'direccion' (character varying(255))
    private String direccion;

    // 'tel_movil' (character varying(10))
    @Column(name = "tel_movil")
    private String telefonoMovil;

    // 'email' (character varying(255))
    private String email;

    // Relación con Tarjetero (si existe en tu modelo)
    @OneToMany(mappedBy = "persona")
    @JsonIgnoreProperties("persona")
    private List<Tarjetero> tarjeteros;
}

