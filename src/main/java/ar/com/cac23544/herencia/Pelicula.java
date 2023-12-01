package ar.com.cac23544.herencia;

public class Pelicula extends articulo {
	
	private String productora;
	private String formato;

	public Pelicula(String titulo, Float precio, String img) {
		super(titulo, precio, img);
		// TODO Auto-generated constructor stub
		
		
				
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return super.toString() + ", Pelicula [productora=" + productora + ", formato=" + formato + "]";
	}

	
}
