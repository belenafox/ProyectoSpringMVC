package cl.spring.grupal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.spring.grupal.modelo.Capacitacion;

@Controller
public class ContactoController {
	
	@GetMapping("/contacto")
    public String mostrarFormularioContacto() {
    	return "contacto";
    }
	    
    @PostMapping("/formContacto")
	public String ObtenerContacto(
			@RequestParam("nombre") String nombre,
			@RequestParam("email") String email,
			@RequestParam("consulta") String consulta) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Email: " + email);
		System.out.println("Consulta: " + consulta);
		return "contacto";
    }
			
}
