package com.example.reportes.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="maquina")
@Table(name="maquina")
@ToString
@NoArgsConstructor
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_maquina")
    private int id_maquina;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="precio_dia")
    private float precio_dia;
    @Column(name="precio_hora")
    private float precio_hora;
    @Column(name="estado")
    private Byte estado;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    @JsonManagedReference
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "id_municipio")
    private Municipio municipio;

    @OneToOne
    @JoinColumn(name = "id_imagen")
    private Imagen imagen;

    @OneToOne
    @JoinColumn(name = "id_tipo_maquina")
    private TipoMaquina tipoMaquina;


    public Maquina(int id_maquina, String nombre, String descripcion, float precio_dia,
                   float precio_hora, Byte estado, Usuario usuario, Municipio municipio,
                   Imagen imagen, TipoMaquina tipoMaquina) {
        this.id_maquina = id_maquina;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_dia = precio_dia;
        this.precio_hora = precio_hora;
        this.estado = estado;
        this.usuario = usuario;
        this.municipio = municipio;
        this.imagen = imagen;
        this.tipoMaquina = tipoMaquina;
    }
}
