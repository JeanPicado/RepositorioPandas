package com.example.cliente.services;

import com.example.cliente.entities.Cliente;
import com.example.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAll(){
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente getbyId(Long id) {
        return (Cliente)clienteRepository.findById(id).get();
    }
    @Override
    public void remove(Long id){
        clienteRepository.deleteById(id);
    }
    @Override
    public void save(Cliente cliente){
        clienteRepository.save(cliente);
    }



}
