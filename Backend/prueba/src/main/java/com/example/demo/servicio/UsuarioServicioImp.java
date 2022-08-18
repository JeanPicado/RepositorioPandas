package com.example.demo.servicio;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UsuarioRegistroDTO;

import com.example.demo.modelo.Rol;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.UsarioRepositorio;


import net.bytebuddy.utility.RandomString;

@Service
public class UsuarioServicioImp implements UsuarioServicio {

	private UsarioRepositorio usarioRepositorio;
	
	
	private Usuario usuario;
   
   @Autowired
   private JavaMailSender mailsender;
	
	
	
	public UsuarioServicioImp(UsarioRepositorio usarioRepositorio) {
		super();
		this.usarioRepositorio = usarioRepositorio;
	}

	@Override
	public Usuario save(UsuarioRegistroDTO registroDTO,  String siteURL) {

		Usuario usuario = new Usuario(registroDTO.getNombre(), registroDTO.getApellido(), registroDTO.getEmail(),
				registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USR")));
		

		String randomCode = RandomString.make(64);
		usuario.setVerificationCode(randomCode);
		
         
		 return usarioRepositorio.save(usuario);
		
		 
		
	}
	
	
	

	

	public void sendVerificationEmail(UsuarioRegistroDTO registroDTO, String siteURL) 
			throws UnsupportedEncodingException, MessagingException   {
		String subject = "Please Verifi your registration";
		String senderName = "Shopme Team";
		String mailContent = "<p>Shopme" + registroDTO.getNombre() + "</p>";
	    mailContent += "<p>Please click the below to verify to your registration</p>";
	    
	    String verifyURL = siteURL + "/verify?code" + registroDTO.getVerificationCode();
	    
	    mailContent += "<h3><a href=\"" +    siteURL +       "\">VERIFY</a></h3>";
	    
	    mailContent += "<p>Thank you<br>The hopme team</p>";
	
	 MimeMessage message = mailsender.createMimeMessage();
	 MimeMessageHelper helper = new MimeMessageHelper(message);
	 
	 helper.setFrom("ebianney@innovabpo.io", senderName);
	 helper.setTo(registroDTO.getNombre());
	 helper.setSubject(subject);
	 helper.setText(mailContent, true);


   
	 
	 
	}

	// Este nos sirve para buscar
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usarioRepositorio.findByEmail(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("username");
		}

		return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));

	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());

	}

	public String signUpUser(Usuario usuario) {
		boolean userExists = usarioRepositorio.findByEmail(usuario.getEmail()).isEnabled();

		if (userExists) {
			// TODO check of attributes are the same and
			// TODO if email not confirmed send confirmation email.

			throw new IllegalStateException("email already taken");
		}
		return null;

		
	}

	
}
	
	
	
	
	

