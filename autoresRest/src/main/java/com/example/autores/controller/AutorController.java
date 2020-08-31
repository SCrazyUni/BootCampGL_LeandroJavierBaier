package com.example.autores.controller;

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

import com.example.autores.entity.Autor;
import com.example.autores.service.AutorService;

@RestController
@RequestMapping("/v1/autores")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	public AutorController(AutorService autorService)
	{
		this.autorService = autorService;
	}
	
	@GetMapping
	public List<Autor> retrieveAutores()
	{
		List<Autor> response = autorService.getAll();
		
		return response;
	}
	
	@GetMapping(path = "/{id}")
	public Autor retrieveById(@PathVariable(name = "id") Integer id)
	{
		Autor response = autorService.getById(id);
		
		return response;
	}
	
	@PostMapping
	public String createAutor(@Validated @RequestBody Autor autor)
	{
		autorService.createAutor(autor);
		
		return "Autor Creado!";
	}
	
	@PutMapping
	public Autor updateAutor(@Validated @RequestBody Autor autor)
	{
		Autor response = autorService.updateAutor(autor);
		
		return response;
	}
	
	@DeleteMapping(path = "{id}")
	public String deleteAutorById(@PathVariable(name = "id") Integer id)
	{
		autorService.deleteAutor(id);
		
		return "Autor Borrado!";
	}
	
	
}
