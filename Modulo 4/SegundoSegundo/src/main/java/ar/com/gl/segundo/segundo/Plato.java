package ar.com.gl.segundo.segundo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Plato")
public class Plato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="nombre")
	private String nombre;

	
	@Column(name="description")
	private String description;

	@Column(name="Price")
	private double precio;
	
	public Plato()
	{
		
	}
	
	public Plato(String nombre, String description, double precio)
	{
		this.nombre = nombre;
		this.description = description;
		this.precio = precio;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public double getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	
	@Override
	public String toString()
	{
		String toString = "nombre: " + this.nombre + " \ndescripcion: " + this.description + " \nprecio: " + this.precio;
		return toString;
	}
	
	
}
