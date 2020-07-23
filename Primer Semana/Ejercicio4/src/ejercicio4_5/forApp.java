package ejercicio4_5;

public class forApp {
	public static void main(String[] args)
	{
		int contador = 0, cantidadVueltas = 10000, divisor = 20;
		
		for (int i = 0; i < cantidadVueltas; i++)
		{
			if (i%divisor == 0)
			{
				contador++;
			}
		}
		System.out.println("Cantidad de numeros divisibles por " + divisor + " entre 0 y " + cantidadVueltas + " : " + contador);
	}

}
