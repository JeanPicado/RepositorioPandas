package com.example.demo.servicio;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.dto.UsuarioRegistroDTO;
import com.example.demo.modelo.Usuario;

import antlr.collections.List;

public interface UsuarioServicio extends UserDetailsService{
    
	
	
	
	
	public Usuario save(UsuarioRegistroDTO registroDTO,  String siteURL);
	
	public void sendVerificationEmail(UsuarioRegistroDTO registroDTO, String siteURL ) throws UnsupportedEncodingException, MessagingException;
	
	
}
