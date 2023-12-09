package ar.com.cac23544.Repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.cac23544.entity.Orador;
import ar.com.cac23544.utils.Dateutils;

public class MySqlOradorRepository implements OradorRepository {

	//private static final ResultSet DateUtils = null;

	@Override
	public void save(Orador orador) {
		
			
		
		//2 preparo sql 
		String sql = "insert into orador (nombre, apellido, tema, email, fecha_alta) values(?,?,?,?,?)";
		
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);	 
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getTema());
			statement.setString(4, orador.getEmail());
			statement.setDate(5, new java.sql.Date(Dateutils.asDate(orador.getFechaAlta()).getTime()));
			
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
		//Connection con = AdministradorDeConexiones.getConnection();
		
		//2 preparo sql 
		String sql = " select id, nombre, apellido, tema, email, fecha_alta from orador where id =?";
		
		Orador orador = null;
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = con.prepareStatement(sql);	 
			statement.setLong(1, id);
			
			ResultSet res = statement.executeQuery();//SELECT
			
			if(res.next()) {
				Long dbId = res.getLong(1);
				String nombre = res.getString(2);
				String apellido = res.getString(3);
				String tema = res.getString(4);
				String email = res.getString(5);
				Date fechaAlta = res.getDate(6);
				
				orador = new Orador(dbId, nombre, apellido, tema, email, Dateutils.asLocalDate(fechaAlta)); 
				
			}
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:",e);
	 }
		return orador;
	}

	@Override
	public void update(Orador orador) {
		
		String sql = "update orador "
				+ "set nombre=?, apellido=?, tema=?, email=? "
				+ "where id = ?";
		
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			
			PreparedStatement statement = con.prepareStatement(sql);
			
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getTema());
			statement.setString(4, orador.getEmail());
			statement.setLong(5, orador.getId());
			
			
			statement.executeUpdate();
		
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo actualizar el orador:", e);
	 }		
		
	}

	@Override
	public void delete(Long id) {
		 
		String sql = " delete from orador where id =?";
		
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			
			PreparedStatement statement = con.prepareStatement(sql);

			statement.setLong(1,id);
			
			statement.executeUpdate();//INSET/UPDATE/DELETE
		
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo eliminar el orador:",e);
	 }		
   }

	@Override
	public List<Orador> findAll() {
	
 		String sql = " select id, nombre, apellido, tema, email, fecha_alta from orador";
		
 		List<Orador> oradores = new ArrayList<>();
 		
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = con.prepareStatement(sql);	 
			
			
			ResultSet res = statement.executeQuery();//SELECT
			
			while (res.next()) {
				Long dbId = res.getLong(1);
				String nombre = res.getString(2);
				String apellido = res.getString(3);
				String tema = res.getString(4);
				String email = res.getString(5);
				LocalDate fechaAlta = Dateutils.asLocalDate(res.getDate(6));
				
				oradores.add(new Orador(dbId, nombre, apellido, tema, email,fechaAlta)); 
				
			}
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:",e);
	 }
		return oradores;
		
	}
}
