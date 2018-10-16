package ar.com.dariojolo.agenda.model.service;

import java.util.List;

import ar.com.dariojolo.agenda.apirest.models.entity.Persona;

public interface IPersonaService {

	public List<Persona>findAll();
	
	public Persona save (Persona persona);
	
	public void delete (Long id);
	
	public Persona findById (Long id);
}
