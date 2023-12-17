package ar.com.cac23544.entity;

import java.time.LocalDate;

public class Orador {
	//atributos
	private Long id;
	private String nombre;
	private String apellido;
	private String tema;
	private String email;
	private String coment;
	private LocalDate fechaAlta;
	
	
	
	
	
	//constructor
	// usar cuando voy a enviar un objeto a la db
	//usar cont+shift+s
	
	public Orador(String nombre, String apellido, String tema, String email, String coment, LocalDate fechaAlta) {
		init(nombre, apellido, tema, email, coment, fechaAlta);
	//alt+shit+m
	}
	
	public Orador(Long id, String nombre, String apellido, String tema, String email, String coment, LocalDate fechaAlta) {
		this.id = id;
		init(nombre, apellido, tema, email, coment, fechaAlta);

			
	}
		
	
	private void init(String nombre, String apellido, String tema, String email, String coment, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tema = tema;
		this.email = email;
		this.coment = coment;
		this.fechaAlta = fechaAlta;

	}
	//implementar un metodo llamado toString() de la clase object
		//alt+shift+s
	// otroa forma de polimorfismo Sobreescritura 
	
	@Override
	public String toString() {
		return "orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tema=" + tema + ", email="
				+ email + ", coment =" + coment + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
	// getters/setters 
		public Long getId() {
		return this.id;
	}
	/*	
	public void setId(Long id) {
		this.id = id;
	}
	*/
	//alt+shift+s

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre){
		if(nombre != null) {
		this.nombre = nombre;
		}else {
			this.nombre = "N/D";
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getComent() {
		return coment;
	}
	public void setComent(String coment) {
		this.coment = coment;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void setId(Long id) {
		this.id = id;
	}	
}
