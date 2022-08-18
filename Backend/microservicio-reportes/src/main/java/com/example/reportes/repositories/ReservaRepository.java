package com.example.reportes.repositories;

import com.example.reportes.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ReservaRepository extends JpaRepository<Reserva,Integer> {

}
