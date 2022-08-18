package com.example.reportes.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class ReservaDTO {
    private String nombre_maquina;
    private int cantidad_maquina;
    private Date fecha_inicio;

    public ReservaDTO(Date fecha_inicio, int cantidad_maquina, String nombre_maquina){
        this.fecha_inicio = fecha_inicio;
        this.cantidad_maquina = cantidad_maquina;
        this.nombre_maquina = nombre_maquina;
    }


}
