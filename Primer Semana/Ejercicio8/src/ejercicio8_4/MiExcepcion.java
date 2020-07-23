package ejercicio8_4;

public class MiExcepcion extends Exception{

	private String mensaje;
	
	public String getMensaje() {return this.mensaje;}
	public void setMensaje(String nuevoMensaje) {this.mensaje = nuevoMensaje;}
	
	public void mostrarMensaje()
	{
		System.out.println(mensaje);
	}
}
