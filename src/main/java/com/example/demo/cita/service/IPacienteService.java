package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteService {
	public void agregar(Paciente paciente);
	public void eliminar(String cedula);
	public Paciente buscar(String cedula);
}
