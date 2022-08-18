package com.servicio.maquinaria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "maquina")

public class Maquina {

	@Id
	private int id_maquina;
	
	private String nombre;
	private String descripcion;
	private float precio_dia;
	private float precio_hora;
	private int estado;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	@JsonBackReference
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_maquina")
	@JsonBackReference
	private Tipo_Maquina tipo_maquina;
	
	@ManyToOne
	@JoinColumn(name="id_municipio")
	@JsonBackReference
	private Municipio municipio;
	
	@ManyToOne
	@JoinColumn(name="id_imagen")
	@JsonBackReference
	private Imagen imagen;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio_dia() {
		return precio_dia;
	}

	public void setPrecio_dia(float precio_dia) {
		this.precio_dia = precio_dia;
	}

	public float getPrecio_hora() {
		return precio_hora;
	}

	public void setPrecio_hora(float precio_hora) {
		this.precio_hora = precio_hora;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Maquina(int id_maquina, String nombre, String descripcion, float precio_dia, float precio_hora, int estado) {
		super();
		this.id_maquina = id_maquina;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_dia = precio_dia;
		this.precio_hora = precio_hora;
		this.estado = estado;
	}

	public Maquina(String nombre, String descripcion, float precio_dia, float precio_hora, int estado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_dia = precio_dia;
		this.precio_hora = precio_hora;
		this.estado = estado;
	}

	public Maquina() {
		super();
	}
	
	
}
