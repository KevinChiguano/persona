package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Persona;

@Repository
@Transactional
public class PersonaRepositoryImpl implements IPersonaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Persona persona = this.buscar(id);
		this.entityManager.remove(persona);
	}

	@Override
	public Persona buscarDinamico(String nombre, String apellido) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);
		Root<Persona> myTabla = myQuery.from(Persona.class);
		
		Predicate predicadoNombre = myBuilder.equal(myTabla.get("nombre"),nombre);
		Predicate predicadoApellido = myBuilder.equal(myTabla.get("apellido"),apellido);
		
		Predicate predicadoFinal = myBuilder.and(predicadoNombre,predicadoApellido);
		
		myQuery.select(myTabla).where(predicadoFinal);
		
		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);
		
		return myQueryFinal.getSingleResult();
		
	}

}
