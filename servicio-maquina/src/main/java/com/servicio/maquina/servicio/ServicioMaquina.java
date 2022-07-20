package com.servicio.maquina.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.maquina.entidades.Maquina;
import com.servicio.maquina.repositorio.RepositorioMaquina;

@Service
public class ServicioMaquina {

	@Autowired
	RepositorioMaquina repositorioMaquina;

	public void crearMaquina(Maquina maquina) {
		this.repositorioMaquina.save(maquina);
	}

	public List<Maquina> obtenerTodasLasMaquinas() {
		return this.repositorioMaquina.findAll();
	}

	public List<Maquina> buscarMaquinaPorDuenio(int id) {
		return this.repositorioMaquina.findByDuenio(id);
	}

	public List<Maquina> buscarMaquinaPorTipo(int tipo) {
		return this.repositorioMaquina.findByTipoMaquina(tipo);
	}

	public List<Maquina> buscarMaquinaPorMunicipio(int municipio) {
		return this.repositorioMaquina.findByMunicipio(municipio);
	}
}
