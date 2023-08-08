package cl.spring.grupal.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
	// Carga de la configuracion de la conexión a la BD
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//Creación del DAo de empleado
	ICapacitacionDao dao = (ICapacitacionDao)ctx.getBean("edao");

   

    @RequestMapping("/capacitaciones")
    public String ListarCapacitaciones(Model model) {
        List<Capacitacion> capacitaciones = dao.obtenerCapacitaciones();
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
		dao.crearCapacitacion(capacitacion);
		return "redirect:/capacitaciones";
	}
	
	
}
