package com.example.reportes.services;

import com.example.reportes.entities.Municipio;
import com.example.reportes.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpMunicipioService implements MunicipioService{
    @Autowired
    private MunicipioRepository municipioRepository;

    @Override
    public Municipio getMunicipio(int id){
        Optional<Municipio> municipioOptional = municipioRepository.findById(id);
        if(municipioOptional.isPresent()){
            return municipioOptional.get();
        }
        return null;
    }

    @Override
    public List<Municipio> listMunicipios(){
        return municipioRepository.findAll();
    }


}
