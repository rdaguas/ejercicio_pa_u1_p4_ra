package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {
	
	private static List<Matricula> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Matricula identificador) {
		baseDatos.add(identificador);		
		
	}

	@Override
	public Matricula buscar(Matricula placa) {
		Matricula matriEncontrada = new Matricula();
		for(Matricula mat : baseDatos) {
			if(mat.getVehiculo().equals(placa)){
				matriEncontrada = mat;
			}
		}
		
		return matriEncontrada;
	}

}
