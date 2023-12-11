package ar.com.cac23544.controllers;

public class OradorRequest {
	private String nombre;
	private String apellido;
	private String tema;
	private String email;
	
	public OradorRequest() {
		
	}
	public OradorRequest(String nombre, String apellido, String tema, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tema = tema;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTema() {
		return tema;
	}

	public String getEmail() {
		return email;
	}
	
}