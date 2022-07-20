package com.servicio.maquina.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicio.maquina.entidades.Maquina;

@Repository
public interface RepositorioMaquina extends JpaRepository<Maquina, Integer>{
	
	public List<Maquina> findByDuenio(int id_duenio);
	public List<Maquina> findByTipoMaquina(int id_tipo_maquina);
	public List<Maquina> findByMunicipio(int id_municipio);
	

}
