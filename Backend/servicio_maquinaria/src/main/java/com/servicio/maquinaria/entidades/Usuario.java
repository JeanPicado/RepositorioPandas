package com.servicio.maquinaria.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	private int id_usuario;

	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private String clave;
	private int verificacion;
	
	@OneToMany(mappedBy = "usuario", fetch=FetchType.EAGER)
	private List<Maquina> maquina;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getVerificacion() {
		return verificacion;
	}

	public void setVerificacion(int verificacion) {
		this.verificacion = verificacion;
	}

	public Usuario(int id_usuario, String nombre, String apellido, String telefono, String email, String clave,
			int verificacion) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.clave = clave;
		this.verificacion = verificacion;
	}

	public Usuario(String nombre, String apellido, String telefono, String email, String clave) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.clave = clave;
	}

	public Usuario() {
		super();
	}
	
}
