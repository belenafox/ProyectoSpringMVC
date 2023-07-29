package cl.spring.grupal.dao;

import java.util.List;

import cl.spring.grupal.modelo.Capacitacion;

public interface ICapacitacionDao {
	public List<Capacitacion> obtenerCapacitaciones();
	public boolean crearCapacitacion(Capacitacion capacitacion);
}
