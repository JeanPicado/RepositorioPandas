package com.servicio.maquinaria.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamento")

public class Departamento {
	
	@Id
	private int id_departamento;
	
	private String nombre;
	
	@OneToMany(mappedBy="departamento", fetch=FetchType.EAGER)
	private List<Municipio> municipio;

	public Departamento() {
		super();
	}

	public Departamento(int id_departamento, String nombre) {
		super();
		this.id_departamento = id_departamento;
		this.nombre = nombre;
	}

	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
