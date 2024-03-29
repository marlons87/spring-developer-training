package com.demo.dto;

import lombok.Data;

@Data
public class TarjetaDto {
    private int id;
    private String numero;
    private String tipo;
    private Boolean estado; // activo/desactivo
}
