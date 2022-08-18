package com.example.reportes.services;

import com.example.reportes.entities.Maquina;
import com.example.reportes.entities.Municipio;

import java.util.List;

public interface MaquinaService {
    Maquina getMaquinaById(int id);

    List<Maquina> listMaquina();
}
