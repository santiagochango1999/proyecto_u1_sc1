package com.example.demo.SpringBoot;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class VentaCarroSB {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechadeventa;
	private ClienteSB cliente;
	private CarroSB carro;
	private VendedorSB vendedor;

	public void venta(String numero, LocalDateTime fechaCita,ClienteSB clh,CarroSB cah,VendedorSB vh ) {
		
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechadeventa=LocalDateTime.now();
		
		Integer valorPrecio =cah.calcularPrecio();
		System.out.println("Valor:"+ valorPrecio);

		this.cliente=clh;
		
		this.vendedor=vh;
		

		this.guardarVenta(this);
		
		
	}
	

	
	private void guardarVenta(VentaCarroSB venta) {
		//Insert en la base de datos, guardar la cita
		System.out.println("se ha generado la venta");
		System.out.println(venta);
	}

	

	@Override
	public String toString() {
		return "VentaCarro [numero=" + numero + ", fechaCita=" + fechaCita + ", fechadeventa=" + fechadeventa
				+ ", cliente=" + cliente + ", carro=" + carro + ", vendedor=" + vendedor + "]";
	}

	// GET Y SET
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechadeventa() {
		return fechadeventa;
	}

	public void setFechadeventa(LocalDateTime fechadeventa) {
		this.fechadeventa = fechadeventa;
	}

	public ClienteSB getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSB cliente) {
		this.cliente = cliente;
	}

	public CarroSB getCarro() {
		return carro;
	}

	public void setCarro(CarroSB carro) {
		this.carro = carro;
	}

	public VendedorSB getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorSB vendedor) {
		this.vendedor = vendedor;
	}

	

}
