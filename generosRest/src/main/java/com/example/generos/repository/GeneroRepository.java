package com.example.generos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.generos.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{

}
