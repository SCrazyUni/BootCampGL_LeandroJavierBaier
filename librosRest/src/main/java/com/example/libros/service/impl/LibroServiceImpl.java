package com.example.libros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libros.entity.Libro;
import com.example.libros.repository.LibroRepository;
import com.example.libros.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1895285751829901955L;

	@Autowired
	private LibroRepository libroRepository;
	
	public LibroServiceImpl() {
		
	}
	
	@Override
	public List<Libro> getAll() {
		List<Libro> response = libroRepository.findAll();
		if(response.isEmpty())
		{
			libroRepository.save(new Libro(1234L, "Nuevo 1", 1,1));
			libroRepository.save(new Libro(4567L, "Nuevo 2", 2,2));
		}
		return response;
	}

	@Override
	public Libro getByIsbn(long isbn) {
		Libro response = libroRepository.getOne(isbn);
		
		return response;
	}

	@Override
	public void createLibro(Libro libro) {
		libroRepository.save(libro);
		
	}

	@Override
	public Libro updateLibro(Libro libro) {
		libroRepository.save(libro);
		
		return libroRepository.getOne(libro.getIsbn());
	}

	@Override
	public void deleteLibro(long isbn) {
		libroRepository.deleteById(isbn);
	}

}
