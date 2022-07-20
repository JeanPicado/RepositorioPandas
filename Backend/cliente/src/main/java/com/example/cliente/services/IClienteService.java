package com.example.cliente.services;

import com.example.cliente.entities.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> getAll();
    Cliente getbyId(Long id);
    void remove(Long id);
    void save(Cliente cliente);
}
