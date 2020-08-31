package com.example.autores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.autores.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
