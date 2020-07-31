package coverage.loteria;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class TestApp {
	
	@Test
	@DisplayName("Ejercicio 2.2")
	void test()
	{
		Loteria loteria = new Loteria(200, 10000, new CartonGenerator());
		loteria.getBoletos();
		loteria.getPozo();
		loteria.getGanadores();
		loteria.jugada();
		loteria.hayGanadorUnico();
		loteria.hayCuadrupleGanador();
		

	}

}
