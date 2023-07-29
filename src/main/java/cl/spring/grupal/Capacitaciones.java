package cl.spring.grupal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Capacitaciones {

	@RequestMapping("/capacitaciones")
	public String ListarCapacitaciones() {
		return "capacitaciones";
	}
}
