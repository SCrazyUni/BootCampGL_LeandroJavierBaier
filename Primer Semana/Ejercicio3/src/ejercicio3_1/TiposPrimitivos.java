package ejercicio3_1;

public class TiposPrimitivos {

	private int myNum;
	private char caracter;
	private float flotante;
	private boolean booleano;
	private short numero;
	
	public TiposPrimitivos(){
		myNum = 15;
		caracter = 'a';
		flotante = 2436.2456f;
		booleano = true;
		numero = 500;
		
	}
	
	public void MostrarValores()
	{
		System.out.println(myNum);
		System.out.println(caracter);
		System.out.println(flotante);
		System.out.println(booleano);
		System.out.println(numero);
	}
	
}
