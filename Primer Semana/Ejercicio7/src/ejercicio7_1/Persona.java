package ejercicio7_1;

public interface Persona {

	public void hablar();
	public void dormir();
	
	default public void come() {
		System.out.println("Persona comiendo");
	}
}
