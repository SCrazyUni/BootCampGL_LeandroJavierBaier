package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class OrderTest {

	@Test
	@DisplayName("Test de Currency")
	public void test() {
		Order expected = new Order(50, "Descripcion experada", Currency.getInstance(), Product.getInstance());
		Order nuevo = new Order(20, "Descripcion nueva", Currency.getInstance(), Product.getInstance());
		
		assertNotEquals(nuevo, expected);
		assertEquals(nuevo.getCurrency(), expected.getCurrency());
	}
	
	@Test
	@DisplayName("Test de product")
	public void test2()
	{
		Order expected = new Order(50, "Descripcion experada", Currency.getInstance(), Product.getInstance());
		Order nuevo = new Order(20, "Descripcion nueva", Currency.getInstance(), Product.getInstance());
		
		assertNotEquals(nuevo, expected);
		assertEquals(nuevo.getProduct(), expected.getProduct());
	}
}
