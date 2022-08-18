package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Usuario;

public interface UsarioRepositorio extends JpaRepository< Usuario, Long> {
	
	public Usuario findByEmail(String email);

}
