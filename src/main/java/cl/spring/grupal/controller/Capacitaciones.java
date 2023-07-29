package cl.spring.grupal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.spring.grupal.dao.CapacitacionDao;
import cl.spring.grupal.modelo.Capacitacion;

@Controller
public class Capacitaciones {
	private final CapacitacionDao capacitacionDao;

    @Autowired
    public Capacitaciones(CapacitacionDao capacitacionDao) {
        this.capacitacionDao = capacitacionDao;
    }

    @RequestMapping("/capacitaciones")
    public String ListarCapacitaciones(Model model) {
        List<Capacitacion> capacitaciones = capacitacionDao.obtenerCapacitaciones();
        model.addAttribute("capacitaciones", capacitaciones);
        System.out.println("capacitaciones: "+capacitaciones);
        return "capacitaciones";
    }
	
	
}
