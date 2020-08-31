package com.example.libros.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libros.DTO.LibroDTO;
import com.example.libros.client.AutorServiceProxy;
import com.example.libros.client.GeneroServiceProxy;
import com.example.libros.entity.Libro;
import com.example.libros.service.LibroService;

@RestController
@RequestMapping("/v1/libros")
public class LibroController {

	@Autowired
	private AutorServiceProxy autorServiceProxy;
	
	@Autowired
	private GeneroServiceProxy generoServiceProxy;
	
	@Autowired
	private LibroService libroService;
	
	public LibroController(LibroService libroService) {
		this.libroService = libroService;
	}
	
	@GetMapping
	public List<LibroDTO> retrieveAllBooks()
	{
		List<Libro> request = libroService.getAll();
		
		List<LibroDTO> response = listLibroToListLibroDTO(request);
		
		return response;
	}
	
	@GetMapping(path = "/{isbn}")
	public LibroDTO retrieveBookByIsbn(@PathVariable(name = "isbn") long isbn)
	{
		Libro request = libroService.getByIsbn(isbn);
		LibroDTO response = LibroToLibroDTO(request);
		
		return response;
	}
	
	@PostMapping
	public String createBook(@Validated @RequestBody Libro book)
	{
		libroService.createLibro(book);
		
		return "Libro Creado!";
	}
	
	@PutMapping
	public String updateBook(@Validated @RequestBody Libro book)
	{
		libroService.updateLibro(book);
		
		return "Libro Actualizado!";
	}
	
	@DeleteMapping(path = "/{isbn}")
	public LibroDTO deleteBook(@PathVariable(name = "isbn") long isbn)
	{
		LibroDTO response = LibroToLibroDTO(libroService.getByIsbn(isbn));
		
		libroService.deleteLibro(isbn);
		
		return response;
	}
	
	private LibroDTO LibroToLibroDTO(Libro libro)
	{
		LibroDTO response = new LibroDTO();
		response.setIsbn(libro.getIsbn());
		response.setTitulo(libro.getTitulo());
		response.setAutor(autorServiceProxy.retrieveAutorById(libro.getIdAutor()));
		response.setGenero(generoServiceProxy.retrieveGeneroById(libro.getIdGenero()));
		
		return response;
	}
	
	private List<LibroDTO> listLibroToListLibroDTO(List<Libro> listLibro)
	{
		List<LibroDTO> response = new ArrayList<LibroDTO>();
		for(Libro libro : listLibro)
		{
			response.add(LibroToLibroDTO(libro));
		}
		
		return response;
	}
}
