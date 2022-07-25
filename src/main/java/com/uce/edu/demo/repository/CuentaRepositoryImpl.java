package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Cuenta;

@Repository
@Transactional
public class CuentaRepositoryImpl implements ICuentaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cuenta cuenta = this.buscar(id);
		this.entityManager.remove(cuenta);
	}

}
