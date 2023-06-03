package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {
	public static List<Vehiculo> baseDatos = new ArrayList<>();
	@Autowired
	private PropietarioRepository propietarioRepository;

	
	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.borrar(vehiculo.getModelo());
		this.insertar(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		Vehiculo vehiculo = new Vehiculo();
		for(Vehiculo vehi : baseDatos) {
			if(placa.equals(vehi.getPlaca())) {
				
			}
		}
		return vehiculo;
	}

	@Override
	public void borrar(String placa) {
		Vehiculo vehi = this.buscar(placa);
		baseDatos.remove(vehi);
	}

}
