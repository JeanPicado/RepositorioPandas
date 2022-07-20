package com.servicio.duenio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicio.duenio.entidades.Duenio;

@Repository
public interface RepositorioDuenio extends JpaRepository<Duenio, Integer>{
	
	

}
