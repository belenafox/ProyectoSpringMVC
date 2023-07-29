package cl.spring.grupal.dao;

import java.util.List;

import cl.spring.grupal.modelo.Capacitacion;

public interface ICapacitacionDao {
	List<Capacitacion> obtenerCapacitaciones();
	boolean crearCapacitacion(Capacitacion capacitacion);
}
