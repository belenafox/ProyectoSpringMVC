package cl.spring.grupal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.spring.grupal.modelo.Usuario;

public class UsuarioDao implements IUsuarioDao {
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		 this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		String query = "select * from Usuarios";
		 
		 return jdbcTemplate.query(query, new RowMapper<Usuario>() {
           @Override
           public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        	   Usuario usuario = new Usuario();
        	   usuario.setId(rs.getInt("id"));
        	   usuario.setNombre(rs.getString("nombre"));
        	   usuario.setFechaNacimiento(rs.getString("fechaNacimiento"));
        	   usuario.setRut(rs.getString("rut"));
        	   usuario.setTipo(rs.getString("tipo"));
               return usuario;
           }
       });
	}

}
