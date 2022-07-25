package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Persona;
import com.uce.edu.demo.service.IPersonaService;

@SpringBootApplication
public class PersonaApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = Logger.getLogger(PersonaApplication.class);

	@Autowired
	private IPersonaService personaService;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.setNombre("Augosto");
		persona.setApellido("Hopenhaimer");
		
		//this.personaService.insertar(persona);
		LOGGER.info(this.personaService.buscarDinamico("Augosto", "Hopenhaimer"));
	}

}
