package ejercicio6_1;

public class Persona {

	private String dni;
	private String nacionalidad;
	
	public String getDni() {return this.dni;}
	public void setDni(String nuevoDni) {this.dni = nuevoDni;}
	
	public String getNacionalidad() {return this.nacionalidad;}
	public void setNacionalidad(String nuevaNacionalidad) {this.nacionalidad = nuevaNacionalidad;}

	public void mostrarDatos()
	{
		System.out.println("Dni: " + dni);
		System.out.println("Nacionalidad: " + nacionalidad);
	}
}