package com.java.ivson.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.ivson.domain.Exercicio;

public interface ExercicioRepository extends MongoRepository<Exercicio, String>	 {

}
