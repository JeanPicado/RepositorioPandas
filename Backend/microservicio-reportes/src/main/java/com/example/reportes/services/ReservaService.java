package com.example.reportes.services;

import com.example.reportes.DTO.ReservaDTO;
import com.example.reportes.entities.Reserva;

import javax.persistence.Query;
import java.util.List;

public interface ReservaService {
    Reserva getReserva(int id);

    List<Reserva> listReserva();

    List<Reserva> listarFechaIncioMaquina();

    List<Reserva> listarVecesRentadaMaquina();
}
