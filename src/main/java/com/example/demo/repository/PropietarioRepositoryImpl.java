package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

	private static List<Propietario> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Propietario propietario) {
		baseDatos.add(0, propietario);
		
	}

	@Override
	public void eliminar(String identificacion) {
		Propietario propietario = this.buscar(identificacion);
		baseDatos.remove(propietario);
		
		
	}

	@Override
	public Propietario buscar(String identificador) {
		Propietario proEncontrada = new Propietario();
		for(Propietario pro : baseDatos) {
			if(identificador.equals(pro.getIdentificacion())) {
				proEncontrada = pro;
			}
			}
		
		return proEncontrada;
	}
}
