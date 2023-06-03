package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService{
	@Autowired
	private MatriculaRepository matriculaRepository;
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public void crear(String propietario, String placaVehiculo) {
		// TODO Auto-generated method stub
		Propietario propietario1 = this.propietarioRepository.buscar(placaVehiculo);
		Vehiculo vehi = this.vehiculoRepository.buscar(placaVehiculo);
		
		
	}

}
