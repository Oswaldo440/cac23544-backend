package ar.com.cac23544.Repository;

//java collection framework: spring
import java.util.List;


import ar.com.cac23544.entity.Orador;

public interface OradorRepository {
	
	
	public void save(Orador orador);

	public Orador getById(Long id);

	public void update(Orador orador);

	public void delete(Long id);

	public List<Orador> findAll();	
	
}
