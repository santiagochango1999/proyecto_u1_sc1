package com.example.demo.cita.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.CitaMedica;
import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.ICitaMedicaRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private IMedicoService iMedicoService;
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	@Override
	
	public void generar(String cedulaPaciente, String cedulaMedico,LocalDateTime fechaCita,Integer turno) {
		// TODO Auto-generated method stub
	
		CitaMedica citaMedica=new CitaMedica();
		citaMedica.setFecha(LocalDateTime.now());
		citaMedica.setFechaCita(fechaCita);
		Medico medico=this.iMedicoService.buscar(cedulaMedico);
		citaMedica.setMedico(medico);
		Paciente paciente=this.iPacienteService.buscar(cedulaPaciente);
		citaMedica.setPaciente(paciente);
		
		if(medico.getTipo().equals("odo")) {
			citaMedica.setTurno(turno);
		}else {
			citaMedica.setTurno(turno+1);
		}
		
		
		this.iCitaMedicaRepository.insertar(citaMedica);
		System.out.println("se genero turno");
	}

}
