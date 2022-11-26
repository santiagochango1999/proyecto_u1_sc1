package com.example.demo.SpringBoot;

public class CarroSB {
	
	private String marca;
	private String año;
	private String tipo;
	
	protected Integer calcularPrecio() {
		System.out.println("Sin Descuento");
		return 0;
	}
	
	//GET Y SET	
	public  String getTipo() {
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
	public  void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", año=" + año + ", tipo=" + tipo + "]";
	}
	

}
