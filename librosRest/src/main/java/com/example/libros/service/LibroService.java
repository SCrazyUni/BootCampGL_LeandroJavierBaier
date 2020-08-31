package com.example.libros.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.libros.entity.Libro;

@Service
public interface LibroService extends Serializable {
	
	public List<Libro> getAll();
	public Libro getByIsbn(long isbn);
	public void createLibro(Libro libro);
	public Libro updateLibro(Libro libro);
	public void deleteLibro(long isbn);
	
}
