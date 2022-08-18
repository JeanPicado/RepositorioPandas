package com.servicio.maquinaria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.maquinaria.entidades.Maquina;
import com.servicio.maquinaria.repositorio.Repositorio_Maquina;

@Service
public class Servicio_Maquina {
	
	@Autowired
	Repositorio_Maquina repositorio_maquina;
	
	public List<Maquina> obtenerTodasLasMaquinas(){
		return this.repositorio_maquina.findAll();
	}
	
	public Maquina obtenerMaquinasPorEstado (int estado) {
		return this.repositorio_maquina.findById(estado);
	}

}
