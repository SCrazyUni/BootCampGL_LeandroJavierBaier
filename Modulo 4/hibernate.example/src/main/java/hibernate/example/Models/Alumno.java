package hibernate.example.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	public Alumno()
	{
		
	}
	
	public Alumno(String id, String nombre, String apellido)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getId()
	{
		return this.id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getApellido()
	{
		return this.apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	
	@Override
	public String toString()
	{
		String toString;
		toString = "id: " + this.id + " nombre: " + this.nombre + " apellido: " + this.apellido;
		return toString;
	}

}
