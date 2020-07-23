package ejercicio6_1;

public class Empleado extends Persona{

	private String id;

	private String nombre;
	private boolean casado;
	private int cantidadHijos;
	private float sueldo;
	private float horasExtrasDelMes;
	private int tipoDeIRPF;
	
	private static float importeHoraExtra;
	
	public Empleado(String dni)
	{
		this.setDni(dni);
		this.id = dni;
	}
	
	//Metodos get y set de los atributos privados
	
	public String getId() {return this.id;}
	public void setId(String IdNuevo) {this.id = IdNuevo;}

	public float getSueldo() {return this.sueldo;}
	public void setSueldo(float sueldoNuevo) {this.sueldo = sueldoNuevo;}
	
	public float getHorasExtrasDelMes() {return this.horasExtrasDelMes;}
	public void setHorasExtrasDelMes(float cantidadHorasExtrasDelMes) {this.horasExtrasDelMes = cantidadHorasExtrasDelMes;}
	
	public int getTipoDeIRPF() {return this.tipoDeIRPF;}
	public void setTipoDeIRPF(int nuevoIRPF) {this.tipoDeIRPF = nuevoIRPF;}
	
	public static float getImporteHoraExtra() { return Empleado.importeHoraExtra;}
	public static void setImporteHoraExtra(float nuevoImporteHoraExtra) {Empleado.importeHoraExtra = nuevoImporteHoraExtra;}
	
	public String getNombre() {return this.nombre;}
	public void setNombre(String nombreNuevo) {this.nombre = nombreNuevo;}
	
	public boolean getCasado () {return this.casado;}
	public void setCasado(boolean estaCasado) {this.casado = estaCasado;}
	
	public int getCantidadHijos() {return this.cantidadHijos;}
	public void setCantidadHijos(int cantidadDeHijos) {this.cantidadHijos = cantidadDeHijos;}
	
	//Metodos de la clase
	
	public float importeHorasExtrasRealizadas()
	{
		return Empleado.importeHoraExtra * this.horasExtrasDelMes;
	}
	
	public float calcularSueldoBruto ()
	{
		return this.sueldo + this.importeHorasExtrasRealizadas();
	}
	
	public float calcularSueldoConRetencionesIRPF()
	{
		float sueldoBruto = this.calcularSueldoBruto(), cantidadRetencion;
		int retencionIRPF = this.tipoDeIRPF;
		if (this.getCasado())
		{
			retencionIRPF -= 2;
		}
		if (retencionIRPF - cantidadHijos > 0)
		{
			retencionIRPF -= cantidadHijos;
		}
		else
		{
			retencionIRPF = 0;
		}
		
		cantidadRetencion = (retencionIRPF * sueldoBruto) / 100;
		
		return cantidadRetencion;
	}
	
	@Override
	public void mostrarDatos()
	{
		System.out.println(this.getDni() + " " + nombre);
		System.out.println("Sueldo Base: " + sueldo);
		System.out.println("Horas extras: " + horasExtrasDelMes);
		System.out.println("tipo IRPF: " + tipoDeIRPF);
		if (casado)
		{
			System.out.println("Casado: S");
		}
		else
		{
			System.out.println("Casado: N");
		}
		System.out.println("Cantidad de Hijos " + cantidadHijos);
	}
	
}
