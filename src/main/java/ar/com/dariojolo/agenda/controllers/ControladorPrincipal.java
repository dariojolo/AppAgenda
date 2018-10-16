package ar.com.dariojolo.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@GetMapping("personas/{id}")
	public Persona show(@PathVariable Long id) {
		return personaService.findById(id);
	}
	
	@PostMapping("personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona p) {
		//p.setFechaNacimiento(new Date());
		return personaService.save(p);
	}
	
	@PutMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update (@RequestBody Persona p, @PathVariable Long id) {
		Persona pActual = personaService.findById(id);
		pActual.setNombre(p.getNombre());
		pActual.setApellido(p.getApellido());
		pActual.setEmail(p.getEmail());
		
		return personaService.save(pActual);
		
	}
	
	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		personaService.delete(id);
	}
}
