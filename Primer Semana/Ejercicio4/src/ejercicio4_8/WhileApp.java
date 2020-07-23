package ejercicio4_8;

public class WhileApp {

	public static void main(String[] args)
	{
		int i = 1, vueltas = 50;
		String estado;
		
		while(i <= vueltas)
		{
			if (i%2 == 0)
			{
				estado = "Par";
			}
			else
			{
				estado = "Impar";
			}
			System.out.println("Valor iterado: " + i + " " + estado);
			i++;
		}
	}
}
