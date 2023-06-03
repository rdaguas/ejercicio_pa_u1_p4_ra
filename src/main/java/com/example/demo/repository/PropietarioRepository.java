package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {
	
	public void insertar(Propietario propietario);
	public Propietario buscar(String identificador);
	public void eliminar(String identificacion);

}
