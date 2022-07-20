package com.servicio.duenio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.duenio.entidades.Duenio;
import com.servicio.duenio.repositorio.RepositorioDuenio;

@Service
public class ServicioDuenio {
	
	@Autowired
	RepositorioDuenio repositorioDuenio;
	
	public List<Duenio> obtenerTodosLosDuenios(){
		return repositorioDuenio.findAll();
	}
	
	public Duenio obtenerDuenioPorId(int id) {
		return repositorioDuenio.findById(id).orElse(null);
	}
	
	public void crearDuenio(Duenio duenio) {
		this.repositorioDuenio.save(duenio);
	}

}
