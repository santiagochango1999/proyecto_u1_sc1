package com.example.demo.herencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VentaCarroH {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechadeventa;
	private ClienteH cliente;
	private CarroH carro;
	private VendedorH vendedor;

	public void venta(String numero, LocalDateTime fechaCita,ClienteH clh,CarroH cah,VendedorH vh ) {
		
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechadeventa=LocalDateTime.now();
		
		Integer valorPrecio =cah.calcularPrecio();
		System.out.println("Valor:"+ valorPrecio);

		this.cliente=clh;
		
		this.vendedor=vh;
		

		this.guardarVenta(this);
		
		
	}
	

	
	private void guardarVenta(VentaCarroH venta) {
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

	public ClienteH getCliente() {
		return cliente;
	}

	public void setCliente(ClienteH cliente) {
		this.cliente = cliente;
	}

	public CarroH getCarro() {
		return carro;
	}

	public void setCarro(CarroH carro) {
		this.carro = carro;
	}

	public VendedorH getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorH vendedor) {
		this.vendedor = vendedor;
	}

	

}
