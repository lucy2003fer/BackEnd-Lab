package com.ApiLaboratorio.mysqlResults.entity;

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
@Table(name = "lab_p_procedimientos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Procedimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cups", nullable = false)
    private Cups cups;

    @ManyToOne
    @JoinColumn(name = "id_grupo_laboratorio", nullable = false)
    private Grupo grupoLaboratorio;

    private String metodo;
}
