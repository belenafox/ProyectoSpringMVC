package cl.spring.grupal.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.spring.grupal.modelo.Usuario;

public interface IUsuarioDao {
	void setJdbcTemplate(JdbcTemplate jdbcTemplate);
	public List<Usuario> listarUsuarios();
}
