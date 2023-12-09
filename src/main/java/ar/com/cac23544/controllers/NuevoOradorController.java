package ar.com.cac23544.controllers;

import java.io.IOException;
import java.time.LocalDate;

import ar.com.cac23544.Repository.MySqlOradorRepository;
import ar.com.cac23544.Repository.OradorRepository;
import ar.com.cac23544.entity.Orador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/orador/nuevo")
public class NuevoOradorController extends HttpServlet{
	
	//crear Post
	protected void doPost(
			HttpServletRequest request, // <--> aca lo que manda el usuario
			HttpServletResponse respone)/*manda el backend al frontend*/
		throws ServletException, IOException {
		
		// capturo los parametros del front
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String tema = request.getParameter("tema");
		String email = request.getParameter("email");
		
		//creo mi orador con esos parametros
		
		Orador nuevo = new Orador(nombre, apellido, tema, email, LocalDate.now());
		
		//ahora por medio del repository guardo en la DB
		
		OradorRepository repository = new MySqlOradorRepository();
		
		repository.save(nuevo);
		
		//ahora respondo al front
		respone.getWriter().print("OK"); 
		
		
	}
			
}
