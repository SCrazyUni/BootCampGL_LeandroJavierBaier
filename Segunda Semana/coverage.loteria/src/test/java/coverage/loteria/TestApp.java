package coverage.loteria;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;


@ExtendWith(MockitoExtension.class)
public class TestApp {
	
	@Mock
	CartonGenerator cartonMock;
	
	@Test
	@DisplayName("Ejercicio 2.2")
	void test()
	{
		Loteria loteria = new Loteria(200, 5, new CartonGenerator());
		
		loteria.getBoletos();
		loteria.getPozo();
		loteria.getGanadores();
		loteria.jugada();
		loteria.hayGanadorUnico();
		loteria.hayCuadrupleGanador();
		

	}
	
	@Test
	@DisplayName("Ejercicio 3.2")
	void mockTestUnGanador()
	{
		Loteria loteria = new Loteria (200, 1, cartonMock);
		
		Mockito.when(cartonMock.isGanador()).thenReturn(true);
		
		loteria.jugada();
		loteria.hayGanadorUnico();
	}
	
	@Test
	void mockTestCuatroGanadores()
	{
	Loteria loteria = new Loteria (200, 4, cartonMock);
		
		Mockito.when(cartonMock.isGanador()).thenReturn(true);
		
		loteria.jugada();
		loteria.hayCuadrupleGanador();
	}

}
