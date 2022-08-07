package com.servicio.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicio.cliente.entidades.Cliente;


@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Integer>{

}
