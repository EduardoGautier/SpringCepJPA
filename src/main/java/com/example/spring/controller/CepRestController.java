package com.example.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.CepEntity;
import com.example.spring.repository.CepRepository;

@RestController
@RequestMapping("/cep")
public class CepRestController {

	@Autowired
	 CepRepository repository;
	
	@GetMapping("/")
	public Iterable<CepEntity>getAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<CepEntity> getIterable(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/add")
	public CepEntity addCep(@RequestBody CepEntity cep) {
		return repository.save(cep);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
