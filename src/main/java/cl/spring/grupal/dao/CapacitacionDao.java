package cl.spring.grupal.dao;

import java.util.ArrayList;
import java.util.List;


import cl.spring.grupal.modelo.Capacitacion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class CapacitacionDao implements ICapacitacionDao {
	private static final Logger logger = LogManager.getLogger(CapacitacionDao.class);
	
	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		logger.info("Se ejecuta método obtenerCapacitaciones");
		List<Capacitacion> capacitaciones = new ArrayList<>();

        Capacitacion capacitacion1 = new Capacitacion();
        capacitacion1.setId(1);
        capacitacion1.setNombre("Capacitacion 1");
        capacitacion1.setDetalle("Descripción de la capacitación 1");
        capacitaciones.add(capacitacion1);

        Capacitacion capacitacion2 = new Capacitacion();
        capacitacion2.setId(2);
        capacitacion2.setNombre("Capacitacion 2");
        capacitacion2.setDetalle("Descripción de la capacitación 2");
        capacitaciones.add(capacitacion2);

        Capacitacion capacitacion3 = new Capacitacion();
        capacitacion3.setId(3);
        capacitacion3.setNombre("Capacitacion 3");
        capacitacion3.setDetalle("Descripción de la capacitación 3");
        capacitaciones.add(capacitacion3);
        
        return capacitaciones;
	}

	@Override
	public boolean crearCapacitacion(Capacitacion capacitacion) {
		logger.info("Se ejecuta método crearCapacitacion");
		
		capacitacion.setDetalle(capacitacion.mostrarDetalle(capacitacion.getLugar(), capacitacion.getHora1(), Capacitacion.formatearFecha(capacitacion.getFecha()), capacitacion.getDuracion()));
		
		System.out.println("Creando capacitación:");
        System.out.println("ID: " + capacitacion.getId());
        System.out.println("Nombre: " + capacitacion.getNombre());
        System.out.println("Detalle: " + capacitacion.getDetalle());
        
		return true;
	}

}
