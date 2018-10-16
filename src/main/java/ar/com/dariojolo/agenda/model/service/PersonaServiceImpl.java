package ar.com.dariojolo.agenda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.dariojolo.agenda.apirest.models.entity.Persona;
import ar.com.dariojolo.agenda.models.dao.IPersonaDao;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Persona> findAll() {
		return (List<Persona>)personaDao.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		personaDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Persona findById(Long id) {
		return personaDao.findById(id).orElse(null);
	}

}
