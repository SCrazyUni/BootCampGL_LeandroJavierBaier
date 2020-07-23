package ejercicio8_3;

public class App {

	public static void main(String[] args)
	{
		try {
			int numero[];
			numero = new int[4];
			numero[4] = 5; 
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("índice de array fuera de límites\n");
		}
	}
}
