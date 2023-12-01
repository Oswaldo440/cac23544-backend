package ar.com.cac23544.herencia;

public class articulo {

	private String titulo;
	private Float precio;
	private String autor;
	private String img;
	
	//alt+alt+shist+s
	public articulo(
			String titulo, 
			Float precio, 
			String img
		) {

		this.titulo = titulo;
		this.precio = precio;
		this.img = img;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "articulo [titulo=" + titulo + ", precio=" + precio + ", autor=" + autor + ", img=" + img + "]";
	}



}



