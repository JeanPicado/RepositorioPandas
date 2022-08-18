package com.example.reportes.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter @Setter
@Entity(name="reserva")
@Table(name="reserva")
@NoArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reserva")
    private int id_reserva;
    @Column(name="fecha_inicio")
    private Date fecha_inicio;
    @Column(name="fecha_final")
    private Date fecha_final;
    @Column(name="precio_reserva")
    private float precio_reserva;

    @ManyToOne
    @JoinColumn( name="id_usuario")
    @JsonManagedReference
    private Usuario usuario;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn( name="id_maquina")
    @JsonManagedReference
    private Maquina maquina;

    public Reserva(int id_reserva, Date fecha_inicio, Date fecha_final,
                   float precio_reserva, Usuario usuario, Maquina maquina) {
        this.id_reserva = id_reserva;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.precio_reserva = precio_reserva;
        this.usuario = usuario;
        this.maquina = maquina;
    }


}
