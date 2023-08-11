package cl.spring.grupal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import cl.spring.grupal.modelo.Capacitacion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CapacitacionDao implements ICapacitacionDao {
	private static final Logger logger = LogManager.getLogger(CapacitacionDao.class);
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		logger.info("Se ejecuta método obtenerCapacitaciones");
		 String query = "select * from capacitaciones";
		 
		 return jdbcTemplate.query(query, new RowMapper<Capacitacion>() {
            @Override
            public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
                Capacitacion capacitacion = new Capacitacion();
                capacitacion.setId(rs.getInt("id"));
                capacitacion.setNombre(rs.getString("nombre"));
                capacitacion.setDetalle(rs.getString("detalle"));
                return capacitacion;
            }
        });
	}

	@Override
	public int crearCapacitacion(Capacitacion capacitacion) {
		logger.info("Se ejecuta método crearCapacitacion");
		
		capacitacion.setDetalle(capacitacion.mostrarDetalle(capacitacion.getLugar(), capacitacion.getHora1(), Capacitacion.formatearFecha(capacitacion.getFecha()), capacitacion.getDuracion()));
		
		String query = "insert into Capacitaciones (nombre, detalle) values (?, ?)";
	    return jdbcTemplate.update(query, capacitacion.getNombre(), capacitacion.getDetalle());
	}

}
