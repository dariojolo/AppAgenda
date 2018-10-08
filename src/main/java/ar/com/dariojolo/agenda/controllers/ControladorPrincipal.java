package ar.com.dariojolo.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.dariojolo.agenda.apirest.models.entity.Persona;
import ar.com.dariojolo.agenda.model.service.IPersonaService;

@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ControladorPrincipal {
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping(value="/personas") 
	public List<Persona> listarPersonas () {
		return personaService.findAll();
		}
	
}
