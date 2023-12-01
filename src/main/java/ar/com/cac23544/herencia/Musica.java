package ar.com.cac23544.herencia;

import java.util.Arrays;

public class Musica extends articulo {

	private String [] temas;
	
	public Musica(String titulo, Float precio, String img) {
		super(titulo, precio, img);
		// TODO Auto-generated constructor stub
	
	}

	public String[] getTemas() {
		return temas;
	}

	public void setTemas(String[] temas) {
		this.temas = temas;
	}

	@Override
	public String toString() {
		return super.toString() +  ",Musica [temas=" + Arrays.toString(temas) + "]";
	}

	
	
}
