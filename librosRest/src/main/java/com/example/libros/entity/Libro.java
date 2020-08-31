package com.example.libros.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
	
	@Id
	@Column(name = "ISBN", nullable = false, unique = true)
	private long isbn;
	
	@Column(name = "TITULO", length = 100, nullable = false)
	private String titulo;
	
	@Column(name = "ID_AUTOR", nullable = false)
	private Integer idAutor;
	
	@Column(name = "ID_GENERO", nullable = false)
	private Integer idGenero;
}
