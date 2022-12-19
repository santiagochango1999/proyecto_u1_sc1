package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);
	public void borrar(String cedula);
	public Paciente buscar(String cedula);
	

}
