package com.example.demo.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class CarroElectricoSB extends CarroSB {
	private int cantdeamperiobateria;

	public int getCantdeamperiobateria() {
		return cantdeamperiobateria;
	}

	public void setCantdeamperiobateria(int cantdeamperiobateria) {
		this.cantdeamperiobateria = cantdeamperiobateria;
	}

	protected Integer calcularPrecio() {
		System.out.println("Precio de 23000");
		return 23000;
	}

}
