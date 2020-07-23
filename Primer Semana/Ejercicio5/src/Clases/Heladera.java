package Clases;

public class Heladera extends Electrodomestico{

	public double capacidad;
	public boolean tieneFreezer;
	public double capacidadFreezer;

	public void guardarElemento(String elemento)
	{
		System.out.println("Se ha guardado: " + elemento);
	}
	
	public void extraerElemento(String elemento)
	{
		System.out.println("Se ha extraido: " + elemento);
	}
	
	@Override
	public void encender()
	{
		System.out.println("Heladera encendida");
	}
	
	@Override
	public void apagar()
	{
		System.out.println("Heladera apagada");
	}

}
