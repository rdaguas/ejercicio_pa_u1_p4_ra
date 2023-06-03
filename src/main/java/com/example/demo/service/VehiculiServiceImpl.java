package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;
@Service
public class VehiculiServiceImpl implements VehiculoService{
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.borrar(placa);
		
	}

}
