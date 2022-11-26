package com.example.demo.herencia;

public class CarroAutomaticoH  extends CarroH{
	private String tipgasolina;

	public String getTipgasolina() {
		return tipgasolina;
	}

	public void setTipgasolina(String tipgasolina) {
		this.tipgasolina = tipgasolina;
	}

	protected Integer calcularPrecio() {
		System.out.println("Precio de 12000");
		return 12000;
	}

}
