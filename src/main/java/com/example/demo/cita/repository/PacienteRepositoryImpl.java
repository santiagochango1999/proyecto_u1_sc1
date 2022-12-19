package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository{

	private static List<Paciente> base=new ArrayList<>();
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		base.add(paciente);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		Paciente pa=null;
		for(Paciente p:base) {
			if(p.getCedula().equals(cedula)) {
				pa=p;
			}
		}
		return pa;
	}

}
