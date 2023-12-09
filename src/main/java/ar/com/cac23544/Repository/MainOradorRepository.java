package ar.com.cac23544.Repository;


import java.time.LocalDate;
import java.util.List;

import ar.com.cac23544.entity.Orador;



public class MainOradorRepository {


	public static void main(String[] args) {
	
		//
		OradorRepository repository = new MySqlOradorRepository();
		
		//obtener un orador desde la DB
		/*
		Orador newOrador = new Orador("Carlos", "Lopez", "java", "mail@mail.com", LocalDate.now());  
		repository.save(newOrador);
		System.out.println(newOrador);
		*/
		
		//consultar un registro
		/*
		Orador orador = repository.getById(1L);
		System.out.println(orador);
		*/
		
		//Un findAll 
		/*
		List<Orador> listado = repository.findAll();
		
		System.out.println(listado);
		*/
		
		//Delete
		/*
		repository.delete(2L);
		
		List<Orador> listado = repository.findAll();
		
		System.out.println(listado);
		*/
		
		//Update
		
		Orador oswaldo = repository.getById(1L);
		
		oswaldo.setApellido("Romero");
		oswaldo.setNombre("Oswaldo");
		oswaldo.setTema("Java");
				
		repository.update(oswaldo);
		
		System.out.println(repository.findAll());
		
		
	}

}
