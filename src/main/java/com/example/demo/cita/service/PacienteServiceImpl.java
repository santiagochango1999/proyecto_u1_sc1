package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Override
	public void agregar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(paciente);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.borrar(cedula);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscar(cedula);
	}

}
