package com.servicio.duenio.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.duenio.entidades.Duenio;
import com.servicio.duenio.servicio.ServicioDuenio;

@RestController
public class ControladorDuenio {
	
	@Autowired
	ServicioDuenio servicioDuenio;
	
	@RequestMapping(value = "/duenio/crearDuenio", method = RequestMethod.GET)
	public Duenio crearDuenio(@RequestParam(name = "id") int id_duenio,
								@RequestParam(name = "nombre") String nombre,
								@RequestParam(name = "apellido") String apellido,
								@RequestParam(name = "nombre_usuario") String nombre_usuario,
								@RequestParam(name = "telefono") String telefono,
								@RequestParam(name = "email") String email,
								@RequestParam(name = "clave") String clave,
								@RequestParam(name = "verificacion") int verificacion) {
		
		//Duenio(int id_duenio, String nombre, String apellido, String nombre_usuario, String telefono, String email,
		//		String clave, int verificacion)

		Duenio duenio = new Duenio(id_duenio, nombre, apellido, nombre_usuario, telefono, email, clave, verificacion);
		this.servicioDuenio.crearDuenio(duenio);
		return duenio;
	}
	
	

}
