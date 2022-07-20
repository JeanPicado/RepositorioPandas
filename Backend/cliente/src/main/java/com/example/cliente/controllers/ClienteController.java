package com.example.cliente.controllers;

import com.example.cliente.entities.Cliente;
import com.example.cliente.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService service;

    @GetMapping("/api/clientes")
    public List<Cliente> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/clientes/{id}")
    public Cliente get(@PathVariable String id){
        return service.getbyId(Long.parseLong(id));
    }

    @DeleteMapping("/api/clientes/{id}")
    public void remove(@PathVariable Long id){
        service.remove(id);
    }
    @PostMapping("/api/clientes")
    public void save(@RequestBody Cliente cliente){
        service.save(cliente);
    }

}
