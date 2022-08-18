package com.example.reportes.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="imagen")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_imagen")
    private int id_imagen;
    @Column(name="enlace_imagen")
    private String enlace_imagen;
    //Hay poner las variables correctas -- faltan mas
}
