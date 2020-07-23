package ejercicio8_1;

public class App {

	public static void main(String[] args)
	{
		try {
			throw new Exception("Esto es una excepcion");
		}catch (Exception ex)
		{
			System.out.println("Se produjo una excepcion: " + ex.getMessage());
		}
		finally
		{
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}
	}
}
