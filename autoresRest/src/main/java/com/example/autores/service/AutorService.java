package com.example.autores.service;

import java.io.Serializable;
import java.util.List;

import com.example.autores.entity.Autor;

public interface AutorService extends Serializable {

	public List<Autor> getAll();
	public Autor getById(Integer id);
	public void createAutor(Autor autor);
	public Autor updateAutor(Autor autor);
	public void deleteAutor(Integer id);
}
