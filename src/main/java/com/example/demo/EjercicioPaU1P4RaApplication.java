package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4RaApplication implements CommandLineRunner{

	@Autowired
	private MatriculaService matriculaService;
	@Autowired
	private VehiculoService  vehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4RaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setModelo("x-trail");
		vehiculo.setPlaca("123");
		vehiculo.setPrecio(BigDecimal.valueOf(2000));
		
		this.vehiculoService.agregar(vehiculo);
		
	}

}
