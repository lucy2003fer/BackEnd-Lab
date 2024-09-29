package com.ApiLaboratorio.mysqlResults.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lab_p_pruebas_opciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PruebaOpcion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_prueba", nullable = false)
    private Prueba prueba; // Asegúrate de que la clase Prueba esté definida correctamente

    @Column(name = "opcion", nullable = false)
    private String opcion;

    @Column(name = "valor_ref_min_f")
    private Double valorRefMinF; // nullable

    @Column(name = "valor_ref_max_f")
    private Double valorRefMaxF; // nullable

    @Column(name = "valor_ref_min_m")
    private Double valorRefMinM; // nullable

    @Column(name = "valor_ref_max_m")
    private Double valorRefMaxM; // nullable

    @Column(name = "valor_ref_maxf")
    private Double valorRefMaxf; // nullable

    @Column(name = "valor_ref_maxm")
    private Double valorRefMaxm; // nullable

    @Column(name = "valor_ref_minf")
    private Double valorRefMinf; // nullable

    @Column(name = "valor_ref_minm")
    private Double valorRefMinm; // nullable
}
