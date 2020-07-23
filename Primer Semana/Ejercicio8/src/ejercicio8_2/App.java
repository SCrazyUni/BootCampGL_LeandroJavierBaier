package ejercicio8_2;

public class App {

	public static void main(String[] args)
	{
		Object nuevo = null;
		
		try {
			nuevo.getClass();
		}catch(Exception ex)
		{
			System.out.println("Se produjo una excepcion: " + ex.getMessage());
		}
	}
}
