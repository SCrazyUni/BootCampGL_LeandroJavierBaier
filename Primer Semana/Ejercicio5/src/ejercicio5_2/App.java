package ejercicio5_2;


import Clases.Cafetera;
import Clases.Electrodomestico;
import Clases.Heladera;
import Clases.Televisor;
import java.util.ArrayList;

public class App {
	
	public static void main(String[] args)
	{
		Cafetera cafetera = new Cafetera();
		Heladera heladera = new Heladera();
		Televisor televisor = new Televisor();
		Electrodomestico electro = new Electrodomestico();
		
		ArrayList<Electrodomestico> listaElectro = new ArrayList<Electrodomestico>();
		
		listaElectro.add(cafetera);
		listaElectro.add(heladera);
		listaElectro.add(televisor);
		listaElectro.add(electro);
		
		for(Electrodomestico el : listaElectro)
		{
			el.encender();
		}
	
	}

}
