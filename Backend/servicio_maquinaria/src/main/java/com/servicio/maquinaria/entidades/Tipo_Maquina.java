package com.servicio.maquinaria.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_maquina")

public class Tipo_Maquina {
	
	@Id
	private int id_tipo_maquina;
	
	private String nombre_maquina;
	
	@OneToMany(mappedBy="tipo_maquina", fetch=FetchType.EAGER)
	private List<Maquina> maquina;

	public int getId_tipo_maquina() {
		return id_tipo_maquina;
	}

	public void setId_tipo_maquina(int id_tipo_maquina) {
		this.id_tipo_maquina = id_tipo_maquina;
	}

	public String getNombre_maquina() {
		return nombre_maquina;
	}

	public void setNombre_maquina(String nombre_maquina) {
		this.nombre_maquina = nombre_maquina;
	}

	public Tipo_Maquina() {
		super();
	}

	public Tipo_Maquina(String nombre_maquina) {
		super();
		this.nombre_maquina = nombre_maquina;
	}
	
	

}
