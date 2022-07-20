package com.servicio.cliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.cliente.entidades.Cliente;
import com.servicio.cliente.repositorio.RepositorioCliente;


@Service
public class ServicioCliente {
	
	@Autowired
	RepositorioCliente repositorioCliente;
	
	public List<Cliente> obtenerTodosLosDuenios(){
		return repositorioCliente.findAll();
	}
	
	public Cliente obtenerClientePorId(int id) {
		return repositorioCliente.findById(id).orElse(null);
	}
	
	public void crearCliente(Cliente cliente) {
		this.repositorioCliente.save(cliente);
	}

}
