package com.example.reportes.controller;

import com.example.reportes.entities.Reserva;
import com.example.reportes.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class ReporteController {
    private Long ver = new Date().getTime();

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    public ReservaService reservaService;

    @RequestMapping(value = "/")
    @ResponseBody
    ModelAndView home() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("index");
        mav.addObject("ver", ver);
        mav.addObject("videos", getMaquinas());

        return mav;
    }

    @GetMapping(value = "/reserva/dashboard", produces = "application/json")
    public ResponseEntity<List<Reserva>> getAllVecesRentadasPorMes() {
        List<Reserva> reservasQuery = reservaService.listarFechaIncioMaquina();
        return new ResponseEntity<>(reservasQuery, HttpStatus.OK);
    }

    @GetMapping(value = "/reserva/listDashboard", produces = "application/json")
    public ResponseEntity<List<Reserva>> getAllVecesRentadas() {
        List<Reserva> reservasQuery = reservaService.listarVecesRentadaMaquina();
        return new ResponseEntity<>(reservasQuery, HttpStatus.OK);
    }

    @RequestMapping(value = "/api")
    @ResponseBody
    HashMap<String, Object> api(
            @RequestParam(value = "from") String from1,
            @RequestParam(value = "to") String to1,
            @RequestParam(value = "video") String video1){
        HashMap<String, Object> r = new HashMap<String, Object>();

        r.put("subsdia", getMaquinas(from1, to1, video1));
        r.put("subssem", getMaquinaMes(from1, to1, video1));

        return r;
    }

    private List<Object[]> getMaquinaMes(String from1, String to1, String video1) {
        String sql = "Select monthname(r.fecha_inicio), tm.nombre_maquina\n"+
                "from reserva r inner join maquina m\n"+
                "on r.id_maquina=m.id_maquina\n"+
                "inner join tipo_maquina tm\n"+
                "on tm.id_tipo_maquina=m.id_tipo_maquina\n";
        String where=getConditionalSql(from1, to1, video1);
        sql += where+" group by tm.nombre_maquina";
        return getSqlValues(sql, from1, to1, video1);
    }

    private List<Object[]> getMaquinas(String from1, String to1, String video1) {
        String sql = "Select month(r.fecha_incio), tm.nombre_maquina \n"+
                "from reserva r inner join maquina m\n"+
                "on r.id_maquina=m.id_maquina\n"+
                "inner join tipo_maquina tm\n"+
                "on tm.id_tipo_maquina=m.id_tipo_maquina\n";
        String where=getConditionalSql(from1, to1, video1);
        sql +=where+ "group by tm.nombre_maquina desc";

        return getSqlValues(sql, from1, to1, video1);
    }

    private String getConditionalSql(String from1, String to1, String video1) {
        String where="";
        if ( !from1.equals("") ) where+=" date >= :from ";

        if ( !to1.equals("") ) {
            if ( !where.equals("") ) where+=" and ";
            where+=" date <= :to ";
        }

        if ( !video1.equals("") ) {
            if ( !where.equals("") ) where+=" and ";
            where+=" video = :video ";
        }

        if ( !where.equals("") ) where=" where "+where;

        return where;
    }
    private List<Object[]> getSqlValues(String sql, String from1, String to1, String video1) {
        Query query = entityManager.createNativeQuery(sql);

        if (!from1.equals("")) query.setParameter("from", from1);
        if (!to1.equals("")) query.setParameter("to", to1);
        if (!video1.equals("")) query.setParameter("video", video1);

        return query.getResultList();
    }
    private List<Object[]> getMaquinas() {
        Query query = entityManager.createNativeQuery(
                "select tm.nombre_maquina from reserva r \n"+
                        "inner join maquina m\n"+
                        "on r.id_maquina=m.id_maquina\n"+
                        "inner join tipo_maquina tm\n"+
                        "on tm.id_tipo_maquina=m.id_tipo_maquina\n"
        );
        return query.getResultList();
    }

}




