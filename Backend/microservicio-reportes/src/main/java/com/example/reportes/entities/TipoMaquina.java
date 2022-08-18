package com.example.reportes.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name="tipo_maquina")
@Table(name="tipo_maquina")
public class TipoMaquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_maquina")
    private int id_tipo_maquina;
    @Column(name="nombre_maquina")
    private String nombre_maquina;

}
