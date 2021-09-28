package com.example.examenparcial1.service;

import java.util.List;

import com.example.examenparcial1.model.Paciente;

public interface PPacienteService {
	Paciente create(Paciente p);
	List<Paciente> readAll();
	Paciente read(int id);
	void delete(int id);
	Paciente update(Paciente p);
}
