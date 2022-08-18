package com.example.demo.servicio;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class EmailService implements EmailSender{

	private  static Logger LOGGER = (Logger) LoggerFactory.getLogger(EmailService.class);
	
	private JavaMailSender mailsender;
	
	@Override
	@Async
	public void send(String to, String email) {
		try {
			MimeMessage mimeMessage = mailsender.createMimeMessage();
			MimeMessageHelper helper =  new MimeMessageHelper(mimeMessage, "utf-8");
			helper.setText(email, true);
			helper.setTo(to);
			helper.setSubject("Confirm your email");
			helper.setFrom("maher@gmail.com");
			mailsender.send(mimeMessage);
			
			
		} catch(MessagingException e) {
			LOGGER.error("fail to send email", e);
			throw new IllegalStateException("failed to send email");
			
		}
		
	}

}
