package com.servicio.cliente.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	private int id_cliente;

	private String nombre;
	private String apellido;
	private String nombre_usuario;
	private String telefono;
	private String email;
	private String clave;
	private int verificacion;

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
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

	public Cliente(int id_cliente, String nombre, String apellido, String nombre_usuario, String telefono, String email,
			String clave, int verificacion) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombre_usuario = nombre_usuario;
		this.telefono = telefono;
		this.email = email;
		this.clave = clave;
		this.verificacion = verificacion;
	}

	public Cliente() {
		super();
	}

}
