package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private String identificacion;
	private LocalDateTime fechaIdentificador;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public LocalDateTime getFechaIdentificador() {
		return fechaIdentificador;
	}
	public void setFechaIdentificador(LocalDateTime fechaIdentificador) {
		this.fechaIdentificador = fechaIdentificador;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaIdentificador=" + fechaIdentificador + "]";
	}
	
	

}
