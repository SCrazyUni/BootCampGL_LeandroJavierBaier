package ejercicio7_1;

public class Hombre implements Persona, Animal{

	
	public static void main(String[] args)
	{
		Hombre hombre = new Hombre();
		
		hombre.come();
		hombre.sonidoAnimal();
		hombre.dormir();
		hombre.hablar();
		hombre.come("Hombre");
	}
	@Override
	public void sonidoAnimal() {
		System.out.println("Los hombres hacen muchos sonidos diferentes");
		
	}

	@Override
	public void hablar() {
		System.out.println("Los hombres hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("Los hombres duermen muchas horas");
	}

}
