package com.example.demo.cita.modelo;

public class Medico {
	private String nombre;
	private String apellido;
	private String cedula;
	private String tipo;
	
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", tipo=" + tipo + "]";
	}
	
	//METODOS GET Y SET
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
