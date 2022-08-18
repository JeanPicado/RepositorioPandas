package com.servicio.maquinaria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.maquinaria.entidades.Usuario;

public interface Repositorio_Usuario extends JpaRepository<Usuario, Integer> {

}
