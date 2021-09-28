package com.example.examenparcial1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenparcial1.model.Paciente;
import com.example.examenparcial1.repository.PacienteService;

@Service
public class PacienteServiceImpl implements PPacienteService {
	
	
	@Autowired
	private PacienteService paciente;
	
	@Override
	public Paciente create(Paciente p) {
		// TODO Auto-generated method stub
		return paciente.save(p);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		
		return paciente.findAll();
	}

	@Override
	public Paciente read(int id) {
		// TODO Auto-generated method stub
		return paciente.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		paciente.deleteById(id);
	}

	@Override
	public Paciente update(Paciente p) {
		// TODO Auto-generated method stub
		return paciente.save(p);
	}

}
