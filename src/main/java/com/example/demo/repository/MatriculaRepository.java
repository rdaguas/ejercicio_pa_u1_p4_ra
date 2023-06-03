package com.example.demo.repository;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaRepository {
	
	public void insertar(Matricula identificador);
	public Matricula buscar(Matricula placa);
	

}
