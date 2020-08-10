package ar.com.tercer.semana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.Serializable;

import org.junit.Test;

public class AppTest implements Serializable{

	@Test
	public void test() {
		double expected = 325;
		ElectricalOven electrical = new ElectricalOven();
		
		electrical.turnLed();
		electrical.turnOn();
		
		assertEquals(expected, electrical.getPower());
		
	}

}
