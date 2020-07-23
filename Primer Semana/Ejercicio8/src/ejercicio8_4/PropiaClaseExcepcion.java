package ejercicio8_4;

public class PropiaClaseExcepcion {

	public static void main(String[] args)
	{
		try {
			MiExcepcion ex = new MiExcepcion();
			ex.setMensaje("Mi propia excepcion");
			throw ex;
		}
		catch(MiExcepcion ex)
		{
			ex.mostrarMensaje();
		}
		
	}
}
