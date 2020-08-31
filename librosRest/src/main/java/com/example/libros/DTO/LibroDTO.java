package com.example.libros.DTO;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class LibroDTO {
	
	private long isbn;
	private String titulo;
	private Object autor;
	private Object genero;
	
}
