package ar.com.cac23544.Repository;

import ar.com.cac23544.entity.Orador;



public class MainOradorRepository {


	public static void main(String[] args) {
	
		//
		OradorRepository repository = new MySqlOradorRepository();
		
		//obtener un orador dela DB
		
		Orador orador = repository.getById(1L);
		
		System.out.println(orador);
		
	}

}
