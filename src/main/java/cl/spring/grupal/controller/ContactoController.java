package cl.spring.grupal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactoController {
	
	@RequestMapping("/contacto")
	public String Contacto() {
		
		return "contacto";
	}
}