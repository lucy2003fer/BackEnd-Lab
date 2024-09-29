package com.ApiLaboratorio.mysqlResults.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class LoginRequest {
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private Date fechaNacimiento;
}
