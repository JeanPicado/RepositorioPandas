package com.servicio.maquina.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.maquina.entidades.Maquina;
import com.servicio.maquina.servicio.ServicioMaquina;

@RestController
public class ControladorMaquina {
	
	@Autowired
	ServicioMaquina servicioMaquina;
	
	@RequestMapping(value = "/maquina/crearCrearMaquina", method = RequestMethod.GET)
	public Maquina crearMaquina(@RequestParam(name = "id") int id_maquina,
								@RequestParam(name = "idDuenio") int id_duenio,
								@RequestParam(name = "idTipoMaquina") int id_tipo_maquina,
								@RequestParam(name = "idMunicipio") int id_municipio,
								@RequestParam(name = "nombre") String nombre,
								@RequestParam(name = "descripcion") String descripcion,
								@RequestParam(name = "precioxdia") float precioxdia,
								@RequestParam(name = "precioxhora") float precioxhora,
								@RequestParam(name = "estado") int estado) {
		
		//Maquina(int id_maquina, int id_duenio, int tipo_maquina, int id_municipio, String nombre, String descripcion,
		//		float precio_por_dia, float precio_por_hora, int estado)
		
		Maquina maquina = new Maquina(id_maquina, id_duenio, id_tipo_maquina, id_municipio, nombre, descripcion, precioxdia, precioxhora, estado);
		this.servicioMaquina.crearMaquina(maquina);
		return maquina;

	}
}
