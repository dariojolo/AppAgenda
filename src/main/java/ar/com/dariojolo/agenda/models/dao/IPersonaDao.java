package ar.com.dariojolo.agenda.models.dao;

import org.springframework.data.repository.CrudRepository;
import ar.com.dariojolo.agenda.apirest.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
	
}
