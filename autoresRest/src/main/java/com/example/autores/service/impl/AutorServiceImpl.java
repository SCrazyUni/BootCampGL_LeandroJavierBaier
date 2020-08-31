package com.example.autores.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autores.entity.Autor;
import com.example.autores.repository.AutorRepository;
import com.example.autores.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6342652088243368908L;

	@Autowired
	private AutorRepository autorRepository;
	
	public AutorServiceImpl()
	{
		
	}
	
	@Override
	public List<Autor> getAll() {
		List<Autor> response = autorRepository.findAll();
		if(response.isEmpty())
		{
			autorRepository.save(new Autor(1, "Autor 1", "Argentino"));
			autorRepository.save(new Autor(2, "Autor 2", "Argentino"));
		}
		return response;
	}

	@Override
	public Autor getById(Integer id) {
		Autor response = autorRepository.getOne(id);
		return response;
	}

	@Override
	public void createAutor(Autor autor) {
		autorRepository.save(autor);
	}

	@Override
	public Autor updateAutor(Autor autor) {
		autorRepository.save(autor);
		return autorRepository.getOne(autor.getIdAutor());
	}

	@Override
	public void deleteAutor(Integer id) {
		autorRepository.deleteById(id);
	}

}
