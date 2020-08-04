package ar.com.tercer.semana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		double expected = 325;
		ElectricalOven electrical = new ElectricalOven();
		
		electrical.turnLed();
		electrical.turnOn();
		
		assertEquals(expected, electrical.getPower());
		
	}

}
