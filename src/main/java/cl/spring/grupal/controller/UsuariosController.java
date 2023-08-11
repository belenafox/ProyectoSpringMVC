package cl.spring.grupal.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.spring.grupal.dao.IUsuarioDao;
import cl.spring.grupal.modelo.Usuario;

@Controller
public class UsuariosController {
	// Carga de la configuracion de la conexión a la BD
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			
	//Creación del DAo de empleado
	IUsuarioDao dao = (IUsuarioDao)ctx.getBean("usuariodao");

    @RequestMapping("/usuarios")
    public String ListarUsuarios(Model model) {
        List<Usuario> usuarios = dao.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }
}
