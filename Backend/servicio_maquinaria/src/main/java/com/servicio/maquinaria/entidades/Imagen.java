package com.servicio.maquinaria.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="imagen")

public class Imagen {
	
	@Id
	private int id_imagen;
	
	private String enlace_imagen;
	
	@OneToMany(mappedBy = "imagen", fetch=FetchType.EAGER)
	private List<Maquina> maquina;

	public int getId_imagen() {
		return id_imagen;
	}

	public void setId_imagen(int id_imagen) {
		this.id_imagen = id_imagen;
	}

	public String getEnlace_imagen() {
		return enlace_imagen;
	}

	public void setEnlace_imagen(String enlace_imagen) {
		this.enlace_imagen = enlace_imagen;
	}

	public Imagen() {
		super();
	}

	public Imagen(int id_imagen, String enlace_imagen) {
		super();
		this.id_imagen = id_imagen;
		this.enlace_imagen = enlace_imagen;
	}

	public Imagen(String enlace_imagen) {
		super();
		this.enlace_imagen = enlace_imagen;
	}
	
	

}
