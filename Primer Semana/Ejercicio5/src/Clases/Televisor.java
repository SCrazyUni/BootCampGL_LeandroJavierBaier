package Clases;

public class Televisor extends Electrodomestico{
	
	public double pulgadas;
	public String resolucion;
	
	public void cambiarCanal(int canalNuevo)
	{
		System.out.println("Se cambio al canal: " + canalNuevo);
	}
	
	@Override
	public void encender()
	{
		System.out.println("Televisor encendido");
	}
	
	@Override
	public void apagar()
	{
		System.out.println("Televisor apagado");
	}
	

}
