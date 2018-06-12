package com.java.ivson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.ivson.domain.Exercicio;
import com.java.ivson.service.ExercicioService;

@Controller
@RequestMapping("/exercicios")
public class ExercicioController {

	@Autowired
	private ExercicioService exercicioService;
	
	@GetMapping
	@ResponseBody
	public List<Exercicio> findAll() {
		return exercicioService.findAll();
	}
}
