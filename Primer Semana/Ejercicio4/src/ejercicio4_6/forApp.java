package ejercicio4_6;

import java.util.ArrayList;

public class forApp {

	public static void main (String[] args)
	{
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Lunes");
		lista.add("Martes");
		lista.add("Miercoles");
		lista.add("Jueves");
		lista.add("Viernes");
		lista.add("Sabado");
		lista.add("Domingo");
		
		for (int i = 0; i < 7; i++)
		{
			System.out.println("Dia de la semana: " + lista.get(i));
		}

	}
}
