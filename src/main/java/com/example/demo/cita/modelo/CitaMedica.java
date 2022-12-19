package com.example.demo.cita.modelo;

import java.time.LocalDateTime;

public class CitaMedica {
	
	private Integer turno;
	private LocalDateTime fecha;
	private LocalDateTime fechaCita;
	private Medico medico;
	private Paciente paciente;
	
	
	@Override
	public String toString() {
		return "CitaMedica [turno=" + turno + ", fecha=" + fecha + ", fechaCita=" + fechaCita + ", medico=" + medico
				+ ", paciente=" + paciente + "]";
	}
	
	//METODOS GET Y SET
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	

}
