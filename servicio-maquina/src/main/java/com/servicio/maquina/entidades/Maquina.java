package com.servicio.maquina.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "maquina")
public class Maquina {

	@Id
	private int id_maquina;
	
	private int id_duenio;
	private int id_tipo_maquina;
	private int id_municipio;
	private String nombre;
	private String descripcion;
	private float precio_por_dia;
	private float precio_por_hora;
	private int estado;

	public int getId_maquina() {
		return id_maquina;
	}

	public void setId_maquina(int id_maquina) {
		this.id_maquina = id_maquina;
	}

	public int getId_duenio() {
		return id_duenio;
	}

	public void setId_duenio(int id_duenio) {
		this.id_duenio = id_duenio;
	}

	public int getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}

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

	public float getPrecio_por_dia() {
		return precio_por_dia;
	}

	public void setPrecio_por_dia(float precio_por_dia) {
		this.precio_por_dia = precio_por_dia;
	}

	public float getPrecio_por_hora() {
		return precio_por_hora;
	}

	public void setPrecio_por_hora(float precio_por_hora) {
		this.precio_por_hora = precio_por_hora;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Maquina(int id_maquina, int id_duenio, int tipo_maquina, int id_municipio, String nombre, String descripcion,
			float precio_por_dia, float precio_por_hora, int estado) {
		super();
		this.id_maquina = id_maquina;
		this.id_duenio = id_duenio;
		this.id_tipo_maquina = tipo_maquina;
		this.id_municipio = id_municipio;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_por_dia = precio_por_dia;
		this.precio_por_hora = precio_por_hora;
		this.estado = estado;
	}

	public Maquina() {
		super();
	}

	public int getId_tipo_maquina() {
		return id_tipo_maquina;
	}

	public void setId_tipo_maquina(int id_tipo_maquina) {
		this.id_tipo_maquina = id_tipo_maquina;
	}
	

}
