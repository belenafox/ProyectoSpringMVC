package cl.spring.grupal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrearCapacitacionController {
	
	@RequestMapping("/crearCapacitacion")
	public String CrearCapacitacion() {
		
		return "crearCapacitacion";
	}
}
