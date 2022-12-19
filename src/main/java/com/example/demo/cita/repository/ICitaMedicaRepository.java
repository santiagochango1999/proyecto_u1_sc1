package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	public void insertar(CitaMedica citaMedica);
	public void borrar(String turno);
	public CitaMedica buscar(String turno);

}
