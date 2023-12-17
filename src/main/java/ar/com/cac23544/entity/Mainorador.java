package ar.com.cac23544.entity;

import java.time.LocalDate;

public class Mainorador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear un objeto de la clase orador, que luego se enviara a la DB
		Orador nuevoorador = new Orador( "carlos", "lopez","email@email.com","JAVA", "docente", LocalDate.now());
	
		System.out.println(nuevoorador);
		
	
	}

}
