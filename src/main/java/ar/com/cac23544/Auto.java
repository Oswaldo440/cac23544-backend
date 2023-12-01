package ar.com.cac23544;

import java.time.LocalDate;

public class Auto {

	/*atributos*/
	
	String marca;
	String modelo;
	String color;
	Integer anio;
	Float velocidad;
	Float velocidadMaxima;
	Boolean encendido;
	String dominio;
	LocalDate fechaCreacion;
	
	/* constructor/es*/
	Auto(String  marca,
		 String modelo,
		 String color,
		 Integer anio,
		/* String dominio,*/
		 Float velocidadMaxima
		 ) {
		
		velocidad = 0f;
		encendido = Boolean.FALSE;
		fechaCreacion = LocalDate.now();
		//this es un puntero que señala a los atributo de la clase 
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		/* this.dominio = dominio;*/
		this.velocidadMaxima = velocidadMaxima;
	
	}
	
	
		/*metodos*/
	
		void encender() {
			if(!this.encendido) {
			this.encendido = Boolean.TRUE;
			}else {
				System.out.println("ya esta encendido");
			}
		}	
		void apagar() {
			if(this.encendido) {
				this.encendido = Boolean.FALSE;
				velocidad = 0f;
			}else {
				System.out.println("ya esta apagado");
			}
		}
		void acelerar() {
			if(this.encendido) {
				if(velocidad < velocidadMaxima) {
					this.velocidad++;
				}else {
					System.out.println("Llegaste a la velocidad maxima");
				}
			}else {
				System.out.println("Primero encender el auto para acelerar");
			}
		}
		
		void frenar() {
			if(this.encendido) {
				if(velocidad > 0) {
				this.velocidad--;
				}else {
					System.out.println("El auto llego a velocidad cero");
				}
			}else {
				System.out.println("Auto apagada");
			}
		}
	
	
		void frenarConGanas() {
			if(this.encendido) {
				while(this.velocidad > 0) {
					this.velocidad--;
				}
			}

		}
		
}		

