package com.example.reportes.services;

import com.example.reportes.entities.Municipio;

import java.util.List;

public interface MunicipioService {
    Municipio getMunicipio(int id);
    List<Municipio> listMunicipios();
}
