package com.example.generos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.generos.entity.Genero;
import com.example.generos.repository.GeneroRepository;
import com.example.generos.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8184052849805426597L;
	
	@Autowired
	private GeneroRepository generoRepository;

	public GeneroServiceImpl() {
		
		
	}
	
	@Override
	public List<Genero> getAll() {
		List<Genero> response = generoRepository.findAll();
		if(response.isEmpty())
		{
			generoRepository.save(new Genero(1, "Genero 1"));
			generoRepository.save(new Genero(2, "Genero 2"));
		}
		return response;
	}

	@Override
	public Genero getById(Integer id) {
		Genero response = generoRepository.getOne(id);
		
		return response;
	}

	@Override
	public void createGenero(Genero genero) {
		generoRepository.save(genero);
	}

	@Override
	public Genero updateGenero(Genero genero) {
		generoRepository.save(genero);
		return generoRepository.getOne(genero.getId());
	}

	@Override
	public void deleteGenero(Integer id) {
		generoRepository.deleteById(id);
	}

}
