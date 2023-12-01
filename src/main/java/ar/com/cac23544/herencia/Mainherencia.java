package ar.com.cac23544.herencia;

public class Mainherencia {


	public static void main(String[] args) {
		// crear Articulo 
		articulo a1 = new articulo("Titulo1", 150.5f,"http://url.com/bla1.jpg" );
		
		a1.setAutor("autor a1");
		
		//metodos disponoblas
		//System.out.println(a1);
		
		//Hijo h = new Hijo()
		
		Musica m1 = new Musica("Musica1", 250.7f,"http://url.com/mus2.jpg" );
				
		m1.setAutor("autor m1");
		String [] temas = new String[] {"t1","t2","t3"};
		m1.setTemas(temas);
	
		//System.out.println(m1);
		
		articulo p1 = new Pelicula("Pel1", 878f, "blas.jpg");
		
		//pelicula denrto del articulo
		//((Pelicula)p1).
		
		Pelicula peli = (Pelicula)p1; //down casting
		peli.setFormato("Blue Ray");
		peli.setProductora("Warner");
		p1.setAutor("peli1");
		
		//System.out.println(p1);
		
		// vextor para guardar la instancias 
		
		articulo [] resultados = new articulo [3];
		resultados[0] = a1;
		resultados[1] = m1;
		resultados[2] = p1;
		
		for(articulo aux : resultados) {
			System.out.println(aux);
		}
		
				
	}
	
}
