package com.example.demo.contralador;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UsuarioRegistroDTO;
import com.example.demo.modelo.Usuario;
import com.example.demo.servicio.UsuarioServicio;
import com.example.demo.utilis.utility;

import net.bytebuddy.utility.RandomString;

@Controller
@RequestMapping("/registro")
public class Controlador {

	
	private UsuarioServicio usuarioServicio;
	private Usuario usuario;
	private utility utilis;
	
	public Controlador(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}

	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}
	
	
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO, HttpServletRequest request) throws UnsupportedEncodingException, MessagingException 
			   {
		System.out.println("nobre regis " + registroDTO.getNombre());
		
		String siteURL = utilis.getSiteURL(request);
		usuarioServicio.sendVerificationEmail(registroDTO, siteURL);
		usuarioServicio.save(registroDTO, siteURL);
		return "redirect:/registro?Exito";

		
	
	
	}

	
	
	
	
	
	
	
	
}
