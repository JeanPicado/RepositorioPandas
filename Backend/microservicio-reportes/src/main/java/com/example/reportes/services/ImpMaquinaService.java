package com.example.reportes.services;

import com.example.reportes.entities.Maquina;
import com.example.reportes.entities.Usuario;
import com.example.reportes.repositories.MaquinaRepository;
import com.example.reportes.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpMaquinaService implements MaquinaService{
    @Autowired
    private MaquinaRepository maquinaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Maquina getMaquinaById(int id) {
        Optional<Maquina> maquinaOptional = maquinaRepository.findById(id);
        if (maquinaOptional.isPresent()) {
            return maquinaOptional.get();
        }
        return null;
    }
    @Override
    public List<Maquina> listMaquina() {
        return maquinaRepository.findAll();
    }
    /*
    public Maquina addMaquina(Maquina maquina){
        Usuario usuario =usuarioRepository.findById(maquina.getUsuario()
                .getId_usuario()).orElse(null);
        if(null==usuario){
            usuario = new Usuario();
        }
        usuario.setNombre(maquina.getUsuario().getNombre());
        usuario.setApellido(maquina.getUsuario().getApellido());
        usuario.setEmail(maquina.getUsuario().getEmail());
        usuario.setTelefono(maquina.getUsuario().getTelefono());
        usuario.setClave(maquina.getUsuario().getClave());
        return maquinaRepository.save(maquina);
    }*/
}
