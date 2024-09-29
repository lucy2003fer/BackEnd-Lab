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
@Table(name = "fac_p_profesional")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    private String registroMedico;

    @ManyToOne
    @JoinColumn(name = "id_tipo_prof")
    private ListaOpcion tipoProf;
}
