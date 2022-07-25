package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Cuenta;
import com.uce.edu.demo.repository.ICuentaRepository;

@Service
public class CuentaServiceImpl implements ICuentaService{

	@Autowired
	private ICuentaRepository cuentaRepository;
	
	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscar(id);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(id);
	}

}
