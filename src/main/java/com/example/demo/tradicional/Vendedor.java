package com.example.demo.tradicional;

public class Vendedor {
	private String nombre;
	private String cedula;
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
}
