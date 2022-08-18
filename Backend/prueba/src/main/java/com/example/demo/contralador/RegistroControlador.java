package com.example.demo.contralador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.servicio.UsuarioServicio;

@Controller
public class RegistroControlador {
	
	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping({"/","/login"})
	public String index() {
		return "login";
	}

	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		
		return "index";
	}
}
	

