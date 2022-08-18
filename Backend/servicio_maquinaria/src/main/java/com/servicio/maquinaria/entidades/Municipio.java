package com.servicio.maquinaria.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="municipio")

public class Municipio {
	
	@Id
	private int id_municipio;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	@JsonBackReference
	private Departamento departamento;
	
	@OneToMany(mappedBy = "municipio", fetch=FetchType.EAGER)
	private List<Maquina> maquina;

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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Municipio(int id_municipio, String nombre) {
		super();
		this.id_municipio = id_municipio;
		this.nombre = nombre;
	}

	public Municipio(String nombre) {
		super();
		this.nombre = nombre;
	}

	
}
