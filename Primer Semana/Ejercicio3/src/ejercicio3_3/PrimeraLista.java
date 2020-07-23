package ejercicio3_3;

import java.util.ArrayList;

public class PrimeraLista {

	public static void main (String[] args)
	{
		ArrayList<String> letters = new ArrayList<String>(); 
		letters.add("A");
		letters.add("B");
		letters.add("C");
		imprimir(letters);
		System.out.println(letters.size());
		letters.add(0, "X");
		imprimir(letters);
	}
	
	public static void imprimir(ArrayList<String> lista)
	{
		for(String elemento : lista)
		{
			System.out.println(elemento);
		}
	}
}
