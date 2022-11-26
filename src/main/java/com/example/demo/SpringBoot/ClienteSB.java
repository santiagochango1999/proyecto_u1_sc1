package com.example.demo.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class ClienteSB {
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
		return "Cliente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}

}
