package com.example.demo.cita.service;

import java.time.LocalDateTime;

public interface ICitaMedicaService {
	public void generar(String cedulaPaciente,String cedulaMedico, LocalDateTime fechaCita,Integer turno);
}
