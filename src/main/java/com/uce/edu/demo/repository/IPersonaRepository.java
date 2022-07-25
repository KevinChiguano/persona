package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Persona;

public interface IPersonaRepository {
	
	public void insertar(Persona persona);
	public Persona buscar(Integer id);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public Persona buscarDinamico(String nombre, String apellido);

}
