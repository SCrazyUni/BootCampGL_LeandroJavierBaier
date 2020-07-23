package ejercicio7_1;

public interface Animal {

	public void dormir();
	public void sonidoAnimal();
	
	default public void come(String animal)
	{
		System.out.println("El "+ animal + " se alimenta.");
	}
	
	static public void camina(String animal)
	{
		System.out.println("El " + animal + " camina.");
	}
}
