package ar.com.cac23544;

public class MainAuto {

	public static void main(String[] args) {
		//instanciar un objeto de la clase Auto
				Auto clio = new Auto("renault",
					 "clio",
					 "azul",
					  2020,
					  3f);
		// clio es un objeto de la clase Auto	
				clio.encender();
				clio.acelerar();
				clio.frenar();
				clio.frenar();
				clio.frenarConGanas();
	}
}
