package com.example.reportes.repositories;

import com.example.reportes.entities.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaquinaRepository extends JpaRepository<Maquina, Integer> {
}
