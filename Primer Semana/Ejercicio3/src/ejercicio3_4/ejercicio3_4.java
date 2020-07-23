package ejercicio3_4;

import java.util.Scanner;

public class ejercicio3_4 {
	
	public static void main(String[] args)
	{
		StudentDetails estudiante = new StudentDetails();
		try (Scanner inputScan = new Scanner(System.in)) {
			int inputAge;
			
			System.out.print("Ingrese la edad: ");
			inputAge = inputScan.nextInt();
			if (inputAge != estudiante.studentAge(inputAge))
			{
				System.out.println("\n\n ERROR");
			}
		}
		
	}

}
