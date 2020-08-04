package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CurrencyInstanceTest {

	@Test
	public void test() {
		Currency current = Currency.getInstance();
		Currency expected = Currency.getInstance();
		
		current.setName("Nuevo");
		
		assertEquals(current.getName(), expected.getName());
	}

}
