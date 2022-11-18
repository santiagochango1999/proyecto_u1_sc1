package com.example.demo.tradicional;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VentaCarro {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechadeventa;
	private Cliente cliente;
	private Carro carro;
	private Vendedor vendedor;

	public void venta(String numero, LocalDateTime fechaCita, String nombreCliente, String cedulaCliente,
			String marcaCarro, String añoCarro,String tipo, String nombreVendedor, String cedulaVendedor) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechadeventa=LocalDateTime.now();
		
		Cliente clienteObjeto=new Cliente();
		clienteObjeto.setCedula(cedulaCliente);
		clienteObjeto.setNombre(nombreCliente);
		
		this.cliente=clienteObjeto;
		
		Vendedor vendedorObjeto= new Vendedor();
		vendedorObjeto.setCedula(cedulaVendedor);
		vendedorObjeto.setNombre(nombreVendedor);
		
		this.vendedor=vendedorObjeto;
		
		//automatico (A) electrico (E)
		if(tipo.equals("A")) {
			CarroAutomatico carroA=new CarroAutomatico();
			carroA.setTipgasolina("Diesel");
			carroA.setTipo("A");
			
			this.carro=carroA;
			System.out.println("CARRO A "+ carroA.getTipgasolina());
		}else {
			
			CarroElectrico carroE= new CarroElectrico();
			carroE.setCantdeamperiobateria(100);
			carroE.setTipo("E");
			
			this.carro=carroE;
			System.out.println("Amperaje de bateria es de: "+carroE.getCantdeamperiobateria());
		}
		
		this.carro.setAño(añoCarro);
		this.carro.setMarca(marcaCarro);
		
		this.guardarVenta(this);
		
	}
	
	private void guardarVenta(VentaCarro venta) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	

}
