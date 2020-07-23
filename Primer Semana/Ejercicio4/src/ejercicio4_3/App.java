package ejercicio4_3;

public class App {

	public static void main(String[] args)
	{
		int compra = 400, descuento1 = 20, descuento2 = 25, montoParaDescuento1 = 300, montoParaDescuento2 = 350;
		
		if (compra == montoParaDescuento1)
		{
			System.out.println("El descuento es de: " + descuento1 + "%");
		}
		else if(compra >= montoParaDescuento2)
		{
			System.out.println("El descuento es de: " + descuento2 + "%");
		}
		else
		{
			System.out.println("Sin descuento es monto es de : " + compra);
		}
		
	}
}
