package ejercicio4_2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args)
	{
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("A");
		lista.add("b");
		
		for (String elemento : lista)
		{
			if (verificarMayuscula(elemento))
			{
				System.out.println("Es una letra mayuscula");
			}
			else
			{
				System.out.println("No es una letra mayuscula");
			}
		}
	}
	
	private static boolean verificarMayuscula(String letra)
	{
		if (letra == letra.toUpperCase())
		{
			return true;
		}
		return false;
	}
}
