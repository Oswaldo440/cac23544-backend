package ar.com.cac23544.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ar.com.cac23544.Repository.MySqlOradorRepository;
import ar.com.cac23544.Repository.OradorRepository;
import ar.com.cac23544.entity.Orador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//htpp://localhost:8080/web-app-23544/api/orador/nuevo
@WebServlet("/api/orador")
public class NuevoOradorController extends HttpServlet{
	
	//crear Post
	protected void doPost(
			HttpServletRequest request, // <--> aca lo que manda el usuario
			HttpServletResponse response)/*manda el backend al frontend*/
		throws ServletException, IOException {
		
		String json = request.getReader()
				.lines()
				.collect(Collectors.joining(System.lineSeparator()));
		
		//convierto de json String a Objecto java usando libreria de jackson2
				ObjectMapper mapper = new ObjectMapper();
				mapper.registerModule(new JavaTimeModule());
				mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				
				OradorRequest oradorRequest = mapper.readValue(json, OradorRequest.class);
				
				//creo mi orador con esos parametros
				Orador nuevo = new Orador(
						oradorRequest.getNombre(), 
						oradorRequest.getApellido(),
						oradorRequest.getEmail(),
						oradorRequest.getTema(),
						LocalDate.now()
				);		
		
				//ahora por medio del repository guardo en la DB
				
				OradorRepository repository = new MySqlOradorRepository();
				
				repository.save(nuevo);
				
				//ahora respondo al front: json, Convirtiendo el nuevo Orador a json
				String jsonParaEnviarALFrontend = mapper.writeValueAsString(nuevo);
				
				response.getWriter().print(jsonParaEnviarALFrontend);
	
	
	}	
			
		
}
			

