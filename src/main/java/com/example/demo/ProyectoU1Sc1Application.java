package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.SpringBoot.CarroAutomaticoSB;
import com.example.demo.SpringBoot.ClienteSB;
import com.example.demo.SpringBoot.VendedorSB;
import com.example.demo.SpringBoot.VentaCarroSB;

@SpringBootApplication
public class ProyectoU1Sc1Application implements CommandLineRunner{

	@Autowired
	private CarroAutomaticoSB carroau;

	@Autowired
	private VentaCarroSB ventacarroSB;

	@Autowired
	private ClienteSB clienteSB;
	
	@Autowired
	private VendedorSB vendedorSB;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1Sc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Spring BOOT");
		this.carroau.setAño("2013");
		this.carroau.setMarca("NISSAN");
		this.carroau.setTipo("A");
		this.carroau.setTipgasolina("DIESEL");

		System.out.println(carroau);

		ventacarroSB.venta("123123",  LocalDateTime.of(2022, 12,2,8,30), clienteSB, carroau, vendedorSB);
	}

}
