package cl.spring.grupal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.spring.grupal.dao.ICapacitacionDao;
import cl.spring.grupal.modelo.Capacitacion;

@Controller
public class CapacitacionesController {
	private final ICapacitacionDao capacitacionDao;

    @Autowired
    public CapacitacionesController(ICapacitacionDao capacitacionDao) {
    	super();
        this.capacitacionDao = capacitacionDao;
    }

    @RequestMapping("/capacitaciones")
    public String ListarCapacitaciones(Model model) {
        List<Capacitacion> capacitaciones = capacitacionDao.obtenerCapacitaciones();
        model.addAttribute("capacitaciones", capacitaciones);
        return "capacitaciones";
    }
    
    @GetMapping("/crearCapacitacion")
    public String mostrarFormularioCrearCapacitacion(Model model) {
    	model.addAttribute("capacitacion", new Capacitacion());
    	return "crearCapacitacion";
    }
    
    @PostMapping("/crearCapacitacion")
	public String CrearCapacitacion(@ModelAttribute Capacitacion capacitacion) {
		capacitacionDao.crearCapacitacion(capacitacion);
		return "redirect:/capacitaciones";
	}
	
	
}
