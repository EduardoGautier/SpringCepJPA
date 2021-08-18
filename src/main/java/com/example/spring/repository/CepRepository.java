package com.example.spring.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.spring.entity.CepEntity;

public interface CepRepository extends CrudRepository<CepEntity, Long> {

  
}
