package ar.com.cac23544.herencia;

public class Libro extends articulo {

	private String isbn;
	
	public Libro(
			String titulo, 
			Float precio, 
			String img
			
			
			) {
		
		
		super(titulo, precio, img);
		// TODO Auto-generated constructor stub
	

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + ",Libro [isbn=" + isbn + "]";
	}
	
	
	
	
	
}
