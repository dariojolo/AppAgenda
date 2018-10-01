package ar.com.dariojolo.agenda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPrincpal {
	
	@GetMapping(value="/saludo") 
	public String inicio () {
		return "Hola";
		
	}
	
}
