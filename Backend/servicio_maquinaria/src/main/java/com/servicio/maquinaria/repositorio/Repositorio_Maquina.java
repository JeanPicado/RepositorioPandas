package com.servicio.maquinaria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.maquinaria.entidades.Maquina;

public interface Repositorio_Maquina extends JpaRepository<Maquina, Integer>{
	
	public Maquina findById(int estado);

}
