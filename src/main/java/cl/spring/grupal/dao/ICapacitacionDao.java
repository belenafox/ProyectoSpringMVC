package cl.spring.grupal.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.spring.grupal.modelo.Capacitacion;

public interface ICapacitacionDao {
	void setJdbcTemplate(JdbcTemplate jdbcTemplate);
	public List<Capacitacion> obtenerCapacitaciones();
	public int crearCapacitacion(Capacitacion capacitacion);
	
}
