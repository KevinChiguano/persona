package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Cuenta;

public interface ICuentaRepository {
	
	public void insertar(Cuenta cuenta);
	public Cuenta buscar(Integer id);
	public void actualizar(Cuenta cuenta);
	public void eliminar(Integer id);

}
