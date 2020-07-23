package Ejercicio5_1;

import Clases.Electrodomestico;
import Clases.Heladera;

public class App {
	
	public static void main(String[] args)
	{
		Electrodomestico electrodomestico = new Electrodomestico();
		Heladera heladera = new Heladera();
		
		System.out.println("Heladera capacidad: " + heladera.capacidad);
		System.out.println("Heladera marca: " + heladera.marca);
		System.out.println("Heladera tiene freezer: " + heladera.tieneFreezer);
		System.out.println("Heladera capacidad freezer: " + heladera.capacidadFreezer);
		heladera.apagar();
		heladera.encender();
		heladera.guardarElemento("Melon");
		heladera.extraerElemento("Cerveza");
		
		System.out.println("Electrodomestico marca: " + electrodomestico.marca);
		System.out.println("Electrodomestico peso: " + electrodomestico.peso);
		electrodomestico.encender();
		electrodomestico.apagar();
	}

}
