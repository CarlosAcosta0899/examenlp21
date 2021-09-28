package com.example.examenparcial1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examenparcial1.model.Paciente;

@Repository
public interface PacienteService extends JpaRepository<Paciente, Integer>{

}
