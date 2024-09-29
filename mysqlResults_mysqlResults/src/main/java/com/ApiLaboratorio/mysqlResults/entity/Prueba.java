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
@Table(name = "lab_p_pruebas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_procedimiento", nullable = false)
    private Procedimiento procedimiento;

    @Column(name = "codigo_prueba", nullable = false)
    private String codigoPrueba;

    @Column(name = "nombre_prueba", nullable = false)
    private String nombrePrueba;

    @ManyToOne
    @JoinColumn(name = "id_tipo_resultado", nullable = false)
    private ListaOpcion tipoResultado;

    @Column(nullable = false)
    private String unidad;

    @Column(name = "habilita", nullable = true)
    private boolean habilitado = true;  // Valor por defecto

}



