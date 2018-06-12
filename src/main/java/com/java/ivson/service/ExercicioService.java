package com.java.ivson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ivson.domain.Exercicio;
import com.java.ivson.repository.ExercicioRepository;

@Service
public class ExercicioService {

	@Autowired
	ExercicioRepository exercicioRepository;
	
	public List<Exercicio> findAll() {
		return exercicioRepository.findAll();
	}
	
}
