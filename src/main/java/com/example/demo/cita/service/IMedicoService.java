package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Medico;

public interface IMedicoService {
	public void agregar(Medico medico);
	public void eliminar(String cedula);
	public Medico buscar(String cedula);
}
