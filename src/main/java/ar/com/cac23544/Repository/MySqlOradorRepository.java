package ar.com.cac23544.Repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import ar.com.cac23544.entity.Orador;

public class MySqlOradorRepository implements OradorRepository {

	@Override
	public void save(Orador orador) {
		
		//1 obtener una conexion 
		Connection con = AdministradorDeConexiones.getConnection();
		
		//2 preparo sql 
		String sql = " inser into orador (nombre, apellido, tema, email, fecha_alta) values(?,?,?,?,?)";
		
		try {
			PreparedStatement statement = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);	 
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getTema());
			statement.setString(4, orador.getMail());
			statement.setDate(5, null );
			
			statement.executeUpdate();//INSET/UPDATE/DELETE
			
			ResultSet res = statement.getGeneratedKeys();
			if(res.next()) {
				Long id = res.getLong(1);
				orador.setId(id);
			}
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:",e);
	 }
  }
	@Override
	public Orador getById(Long id) {
		
		//1 obtener una conexion 
		Connection con = AdministradorDeConexiones.getConnection();
		
		//2 preparo sql 
		String sql = " select id, nombre, apellido, tema, mail, fecha_alta from orador where id =?";
		
		Orador orador = null;
		try {
			PreparedStatement statement = con.prepareStatement(sql);	 
			statement.setLong(1, id);
			
			ResultSet res = statement.executeQuery();//SELECT
			
			if(res.next()) {
				Long dbId = res.getLong(1);
				String nombre = res.getString(2);
				String apellido = res.getString(3);
				String tema = res.getString(4);
				String email = res.getString(5);
				Date FechaAlta = res.getDate(6);
				
				orador = new Orador(dbId, nombre, apellido, tema, email,LocalDate.now()); 
				
			}
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:",e);
	 }
		return orador;
	}

	@Override
	public void update(Orador orador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Orador> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
