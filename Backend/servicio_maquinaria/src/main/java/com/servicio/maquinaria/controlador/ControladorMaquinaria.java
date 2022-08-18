package com.servicio.maquinaria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.servicio.maquinaria.entidades.Maquina;
import com.servicio.maquinaria.servicio.Servicio_Maquina;

@Controller
public class ControladorMaquinaria {
	
	@Autowired
	Servicio_Maquina servicio_maquina;
	
	@GetMapping("/")
	public String principal() {
		return "Principal";
	}
	
	@GetMapping("/home")
	public String home() {
		return "Principal";
	}
	
	@GetMapping("/maquinas")
	public String maquinas() {
		return "maquinas";
	}
	
	@RequestMapping(value = "/listaMaquinas", method = RequestMethod.GET)
	public List<Maquina> listadoMaquinas () {
		return this.servicio_maquina.obtenerTodasLasMaquinas();
	}
	
	@RequestMapping(value = "/buscarMaquinas", method = RequestMethod.GET)
	public Maquina buscarMaquina(@RequestParam(name = "estado") int estado) {
		return this.servicio_maquina.obtenerMaquinasPorEstado(estado);
	}

}
