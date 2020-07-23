package ejercicio5_3;

public class App {
	
	public static void main(String[] args)
	{
		Gato gato = new Gato();
		
		gato.setNombre("Copo de nieve");
		gato.setPatas(4);
		
		System.out.println("Nombre del gato: " + gato.getNombre());
		System.out.println("Cantidad de patas: " + gato.getPatas());
	}

}
