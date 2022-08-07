package com.servicio.cliente.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.servicio.cliente.entidades.Cliente;
import com.servicio.cliente.servicio.ServicioCliente;


@Controller
public class ControladorCliente {
	
	@Autowired
	ServicioCliente servicioCliente;
	
	@GetMapping("/")
	public String registrarCliente() {
		return "cliente";
	}
	
	@RequestMapping(value = "/cliente/crearCliente", method = RequestMethod.POST)
	public String crearCliente(@RequestParam(name = "id") int id_cliente,
								@RequestParam(name = "nombre") String nombre,
								@RequestParam(name = "apellido") String apellido,
								@RequestParam(name = "nombre_usuario") String nombre_usuario,
								@RequestParam(name = "telefono") String telefono,
								@RequestParam(name = "email") String email,
								@RequestParam(name = "clave") String clave,
								@RequestParam(name = "verificacion") int verificacion) {
		
		//Cliente(int id_cliente, String nombre, String apellido, String nombre_usuario, String telefono, String email,
		//		String clave, int verificacion)

		Cliente cliente = new Cliente(id_cliente, nombre, apellido, nombre_usuario, telefono, email, clave, verificacion);
		this.servicioCliente.crearCliente(cliente);
		return "cliente";
	}

}
