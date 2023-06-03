package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matricula {
	
	private LocalDate fechaMatricula;
	private BigDecimal valorMatricula;
	private String propietario;
	private String Vehiculo;
	
	//get y set 
	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getVehiculo() {
		return Vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		Vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", propietario="
				+ propietario + ", Vehiculo=" + Vehiculo + "]";
	}
	
	
	

}
