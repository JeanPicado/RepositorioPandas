package com.example.reportes.repositories;

import com.example.reportes.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepository extends JpaRepository<Imagen, Integer> {
}
