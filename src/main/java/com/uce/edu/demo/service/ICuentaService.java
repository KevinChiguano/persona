package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Cuenta;

public interface ICuentaService {

	public void insertar(Cuenta cuenta);
	public Cuenta buscar(Integer id);
	public void actualizar(Cuenta cuenta);
	public void eliminar(Integer id);
}
