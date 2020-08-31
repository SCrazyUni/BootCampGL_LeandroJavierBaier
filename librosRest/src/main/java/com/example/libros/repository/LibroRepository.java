package com.example.libros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libros.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

}
