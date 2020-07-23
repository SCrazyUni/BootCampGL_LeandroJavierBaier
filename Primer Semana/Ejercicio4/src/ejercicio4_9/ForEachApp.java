package ejercicio4_9;

import java.util.ArrayList;

public class ForEachApp {

	public static void main(String[] args)
	{
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		for (int i = 1; i <=10; i++)
		{
			listaNumeros.add(i);
		}
		
		for(Integer num:listaNumeros)
		{
			System.out.println("El valor iterado es: " + num);
		}
	}
}
