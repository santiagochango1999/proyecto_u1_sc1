package com.example.demo.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class CarroAutomaticoSB  extends CarroSB{
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
