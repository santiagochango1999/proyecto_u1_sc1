package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.service.ICitaMedicaService;
import com.example.demo.cita.service.IMedicoService;
import com.example.demo.cita.service.IPacienteService;


@SpringBootApplication
public class ProyectoU1Sc1Application implements CommandLineRunner{

	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private IMedicoService iMedicoService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1Sc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Medico medico=new Medico();
		medico.setApellido("chavez");
		medico.setNombre("saul");
		medico.setCedula("1707755441");
		medico.setTipo("odo");
		this.iMedicoService.agregar(medico);
		
		Paciente paciente=new Paciente();
		paciente.setApellido("chango");
		paciente.setNombre("santiago");
		paciente.setCedula("1727490953");
		paciente.setEdad("23");
		paciente.setTipo("joven");
		this.iPacienteService.agregar(paciente);
		
		this.citaMedicaService.generar("1727490953", "1707755441", LocalDateTime.of(2023, 4, 2, 12, 40), 12);
		
		
	}

}
