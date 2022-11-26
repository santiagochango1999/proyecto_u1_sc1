package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteH clienteObjeto=new ClienteH();
		clienteObjeto.setCedula("123456789");
		clienteObjeto.setNombre("ALEX");
		
		
		VendedorH vendedorObjeto= new VendedorH();
		vendedorObjeto.setCedula("1227490964");
		vendedorObjeto.setNombre("PAUL");
		
		CarroAutomaticoH carroA=new CarroAutomaticoH();
		carroA.setTipgasolina("Diesel");
		carroA.setTipo("A");
		carroA.setAño("2022");
		carroA.setMarca("NISSAN");
		
		CarroElectricoH carroE= new CarroElectricoH();
		carroE.setCantdeamperiobateria(100);
		carroE.setTipo("E");
		carroE.setAño("2010");
		carroE.setMarca("TOYOTA");
		
		VentaCarroH cita = new VentaCarroH();
		cita.venta("12", LocalDateTime.of(2022, 12,2,8,30),clienteObjeto,carroA,vendedorObjeto);

	}

}
