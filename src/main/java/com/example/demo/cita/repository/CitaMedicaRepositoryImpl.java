package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	private static List<CitaMedica> base=new ArrayList<>();
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		base.add(citaMedica);
	}

	@Override
	public void borrar(String turno) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(turno));
	}

	@Override
	public CitaMedica buscar(String turno) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica=null;
		for(CitaMedica cm:base) {
			if(cm.getTurno().equals(turno)) {
				citaMedica=cm;
			}
			
		}
		return citaMedica;
	}

}
