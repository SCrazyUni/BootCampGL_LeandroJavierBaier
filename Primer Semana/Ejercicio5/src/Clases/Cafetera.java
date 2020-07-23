package Clases;

public class Cafetera extends Electrodomestico{
	
	public double litros;
	
	public void elegirSabor(String sabor)
	{
		System.out.println("Sabor elegido: " + sabor);
	}
	
	@Override
	public void encender()
	{
		System.out.println("Cafetera encendida");
	}
	
	@Override
	public void apagar()
	{
		System.out.println("Cafetera apagada");
	}
}
