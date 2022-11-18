package com.example.demo.tradicional;

public class Carro {
	private String marca;
	private String año;
	private String tipo;
	
	//GET Y SET	
	protected  String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	protected  void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", año=" + año + ", tipo=" + tipo + "]";
	}
	

}
