package com.example.generos.controller;

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

import com.example.generos.entity.Genero;
import com.example.generos.service.GeneroService;

@RestController
@RequestMapping("/v1/generos")
public class GeneroController {

	@Autowired
	private GeneroService generoService;
	
	public GeneroController(GeneroService generoService)
	{
		this.generoService = generoService;
	}
	
	@GetMapping
	public List<Genero> retrieveGeneros()
	{
		List<Genero> response = generoService.getAll();
		
		return response;
	}
	
	@GetMapping(path = "/{id}")
	public Genero retrieveGeneroById(@PathVariable(name = "id") final Integer id)
	{
		Genero response = generoService.getById(id);
		
		return response;
	}
	
	@PostMapping
	public String createGenero(@Validated @RequestBody final Genero genero)
	{
		generoService.createGenero(genero);
		
		return "Genero Creado!";
	}
	
	@PutMapping
	public Genero updateGenero(@Validated @RequestBody final Genero genero)
	{
		Genero response = generoService.updateGenero(genero);
		
		return response;
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteGenero(@PathVariable final Integer id)
	{
		generoService.deleteGenero(id);
		
		return "Genero Borrado!";
	}
	
	
}
