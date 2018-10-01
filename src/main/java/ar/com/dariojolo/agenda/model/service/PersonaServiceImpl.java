package ar.com.dariojolo.agenda.model.service;

import java.util.List;

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

}
