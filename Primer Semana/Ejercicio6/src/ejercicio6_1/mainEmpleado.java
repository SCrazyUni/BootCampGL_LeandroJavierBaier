package ejercicio6_1;

import java.util.Scanner;

public class mainEmpleado {
	
	static final int cantidadMaximaEmpleados = 20;

	public static void main(String[] args)
	{
		Empleado listaEmpleado[];
		listaEmpleado = new Empleado[cantidadMaximaEmpleados];
		
		boolean band = true;
		System.out.println("Indique la cantidad de empleados a ingresar (no mayor a " + cantidadMaximaEmpleados + "): ");
		try (Scanner inputScanner = new Scanner(System.in)) {
			int cantidadEmpleados = 0;
			
			do {
				cantidadEmpleados = inputScanner.nextInt();
				
				if (cantidadEmpleados < 1 || cantidadEmpleados > cantidadMaximaEmpleados)
				{
					System.out.println("Ingrese una cantidad de empleados entre 1 y " + cantidadMaximaEmpleados);
				}
				else
				{
					band = false;
				}
				
			}while (band);
			
			for (int i = 0; i < cantidadEmpleados; i++)
			{
				System.out.flush();
				System.out.println("Empleado Nº: " + (i + 1));
				listaEmpleado[i] = cargarEmpleado();
			}
			
			System.out.println("Ingrese el monto de la hora extra: ");
			Empleado.setImporteHoraExtra(inputScanner.nextFloat());
			
			ordenarEmpleadosPorSueldo(listaEmpleado, cantidadEmpleados);
			System.out.println("-----------------------------");
			System.out.println("\nEmpleado con mayor sueldo: ");
			listaEmpleado[cantidadEmpleados - 1].mostrarDatos();
			
			System.out.println("-----------------------------");
			System.out.println("\nEmpleado con menor sueldo: ");
			listaEmpleado[0].mostrarDatos();
			
			ordenarEmpleadosPorImporteHorasExtra(listaEmpleado, cantidadEmpleados);
			System.out.println("-----------------------------");
			System.out.println("\nEmpleado con mayor importe de horas extra: ");
			listaEmpleado[cantidadEmpleados - 1].mostrarDatos();
			
			System.out.println("-----------------------------");
			System.out.println("\nEmpleado con menor importe de horas extra: ");
			listaEmpleado[0].mostrarDatos();
			
			System.out.println("-----------------------------");
			System.out.println("\nLista de empleados ordenados por sueldo: ");
			ordenarEmpleadosPorSueldo(listaEmpleado, cantidadEmpleados);
			for(int i = 0; i < cantidadEmpleados; i++)
			{
				listaEmpleado[i].mostrarDatos();
			}
		}
	}
	
	public static Empleado cargarEmpleado()
	{
		boolean band = true;
		Scanner inputScanner = new Scanner(System.in) ;
			System.out.print("Ingrese el DNI del empleado: ");
			String dni = null;
			inputScanner.hasNextLine();
			dni = inputScanner.nextLine();
			Empleado nuevoEmpleado = new Empleado(dni);
			
			System.out.print("\nIngrese el nombre: ");
			nuevoEmpleado.setNombre(inputScanner.nextLine());
			
			System.out.print("\nIngrese el sueldo: ");
			nuevoEmpleado.setSueldo(inputScanner.nextFloat());
			
			System.out.print("\nEsta casado (S/N): ");
			do {
				
				String estado;
				estado = inputScanner.next();
				if (estado.toLowerCase().charAt(0) == 'n' || estado.toLowerCase().charAt(0) == 's') {
					if (estado.toLowerCase().charAt(0) == 'n')
					{
						nuevoEmpleado.setCasado(false);
					}
					else
					{
						nuevoEmpleado.setCasado(true);
					}
					band = false;
				}
				else {
					
					System.out.println("Ingrese S o N");
				}
			}while(band);
			
			System.out.print("\nIngrese la cantidad de hijos: ");
			nuevoEmpleado.setCantidadHijos(inputScanner.nextInt());
			
			System.out.print("\nIngrese Nacionalidad: ");
			nuevoEmpleado.setNacionalidad(inputScanner.next());
			
			System.out.print("\nIngrese Cantidad de Horas Extra: ");
			nuevoEmpleado.setHorasExtrasDelMes(inputScanner.nextFloat());
			
			System.out.print("\nIngrese tipo de IRPF: ");
			nuevoEmpleado.setTipoDeIRPF(inputScanner.nextInt());
			return nuevoEmpleado;
	
	}
	
	public static void ordenarEmpleadosPorSueldo(Empleado listaEmpleados[], int cantidadTotalDeEmpleados)
	{
		Empleado aux;
		for(int i = 0; i < cantidadTotalDeEmpleados - 1; i++)
		{
			for (int j = i; j < cantidadTotalDeEmpleados; j++)
			{
				if (listaEmpleados[i].calcularSueldoBruto() > listaEmpleados[j].calcularSueldoBruto())
				{
					aux = listaEmpleados[i];
					listaEmpleados[i] = listaEmpleados[j];
					listaEmpleados[j] = aux;
				}
			}
		}
	}
	
	public static void ordenarEmpleadosPorImporteHorasExtra(Empleado listaEmpleados[], int cantidadTotalDeEmpleados)
	{
		Empleado aux;
		for(int i = 0; i < cantidadTotalDeEmpleados - 1; i++)
		{
			for (int j = i; j < cantidadTotalDeEmpleados; j++)
			{
				if (listaEmpleados[i].importeHorasExtrasRealizadas() > listaEmpleados[j].importeHorasExtrasRealizadas())
				{
					aux = listaEmpleados[i];
					listaEmpleados[i] = listaEmpleados[j];
					listaEmpleados[j] = aux;
				}
			}
		}
	}
}
