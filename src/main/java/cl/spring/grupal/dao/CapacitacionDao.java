package cl.spring.grupal.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.spring.grupal.modelo.Capacitacion;

@Repository
public class CapacitacionDao implements ICapacitacionDao {

	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
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
		// TODO Auto-generated method stub
		return false;
	}

}
