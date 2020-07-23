package ejercicio4_10;

import java.util.ArrayList;

public class ForEachApp {

	public static void main(String[] args)
	{
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Lunes");
		lista.add("Martes");
		lista.add("Miercoles");
		lista.add("Jueves");
		lista.add("Viernes");
		lista.add("Sabado");
		lista.add("Domingo");
		
		for (String dia:lista)
		{
			System.out.println("Dia de la semana: " + dia);
		}
	}
}
