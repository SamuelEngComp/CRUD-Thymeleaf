package com.crudthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudthymeleaf.model.Computador;

@Repository
public interface ComputadorRepository extends JpaRepository<Computador, Integer>{

}
