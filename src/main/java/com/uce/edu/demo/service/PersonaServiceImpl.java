package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Persona;
import com.uce.edu.demo.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepository personaRepository;
	
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepository.insertar(persona);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.personaRepository.buscar(id);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepository.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.personaRepository.eliminar(id);
	}

	@Override
	public Persona buscarDinamico(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.personaRepository.buscarDinamico(nombre, apellido);
	}

}
