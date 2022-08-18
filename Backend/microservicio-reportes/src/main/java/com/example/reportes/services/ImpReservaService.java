package com.example.reportes.services;

import com.example.reportes.entities.Reserva;
import com.example.reportes.repositories.MaquinaRepository;
import com.example.reportes.repositories.ReservaRepository;
import com.example.reportes.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ImpReservaService implements ReservaService{
    @Autowired
    private ReservaRepository reservaRepository;
    @Autowired
    private MaquinaRepository maquinaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Reserva getReserva(int id) {
        Optional<Reserva> reservaOptional = reservaRepository.findById(id);
        if (reservaOptional.isPresent()) {
            return reservaOptional.get();
        }
        return null;
    }
    @Override
    public List<Reserva> listReserva() {
        return reservaRepository.findAll();
    }
    @Override
    public List<Reserva> listarFechaIncioMaquina(){
        Query query  = entityManager.createNativeQuery
                ("Select monthname(r.fecha_inicio), tm.nombre_maquina\n"+
                        "from reserva r inner join maquina m\n"+
                        "on r.id_maquina=m.id_maquina\n"+
                        "inner join tipo_maquina tm\n"+
                        "on tm.id_tipo_maquina=m.id_tipo_maquina\n" +
                        "group by tm.nombre_maquina");
        List<Reserva> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public List<Reserva> listarVecesRentadaMaquina(){
        Query query  = entityManager.createNativeQuery
                ("Select count(tm.nombre_maquina), tm.nombre_maquina \n"+
                        "from reserva r inner join maquina m\n"+
                        "on r.id_maquina=m.id_maquina\n"+
                        "inner join tipo_maquina tm\n"+
                        "on tm.id_tipo_maquina=m.id_tipo_maquina\n" +
                        "group by tm.nombre_maquina");
        List<Reserva> resultList = query.getResultList();
        return resultList;
    }





}
