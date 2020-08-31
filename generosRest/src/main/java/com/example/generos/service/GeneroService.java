package com.example.generos.service;

import java.io.Serializable;
import java.util.List;

import com.example.generos.entity.Genero;

public interface GeneroService extends Serializable{

	public List<Genero> getAll();
	public Genero getById(Integer id);
	public void createGenero(Genero genero);
	public Genero updateGenero(Genero genero);
	public void deleteGenero(Integer id);
	
}
