package com.example.reportes.entities;


import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="municipio")
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_municipio")
    private int id_municipio;
    @Column(name="nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name="id_departamento")
    private Departamento departamento;

}
