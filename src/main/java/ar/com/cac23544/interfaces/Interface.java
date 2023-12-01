package ar.com.cac23544.interfaces;

public interface Interface {
	
	final String Hola = "";
	
	public void metodo1();
	
	// parecido a uina clase abstracta 
	public default void metodo2() {
		System.out.println("Metodo2");
	
	}

}
