package ejercicio7_1;

public class mainAnimal {

	public static void main(String[] args)
	{
		Perro dog = new Perro();
		
		dog.dormir();
		dog.sonidoAnimal();
		
		dog.come("Perro");
		Animal.camina("Perro");
	}
}
