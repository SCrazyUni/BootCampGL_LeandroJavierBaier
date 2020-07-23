package ejercicio4_11;

public class ForEachApp {

	public static void main(String[] args)
	{
		String cadena = "BootCamp 2020";
		
		for(char letra : cadena.toCharArray())
		{
			System.out.println(letra);
		}
	}
}
