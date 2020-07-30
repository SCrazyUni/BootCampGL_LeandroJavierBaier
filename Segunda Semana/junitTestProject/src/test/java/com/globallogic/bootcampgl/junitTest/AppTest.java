package com.globallogic.bootcampgl.junitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

	
	@Test
	@DisplayName("Ejercicio 1.1")
	void test1()
	{
		assertEquals("Test", "Test");
	}
	

	@Test
	@DisplayName("Ejercicio 1.2")
	void test2()
	{
		String cadena1 = "cadena", cadena2 = "cadena", cadena3 ="diferente";
		assertEquals(cadena1, cadena2);
		assertNotEquals(cadena2, cadena3);
	}
	
	
	@Test
	@DisplayName("Ejercicio 1.3")
	void test3()
	{
		assertTrue(25 > 12);
		assertFalse(25 > 27);
	}
	
	
	@Test
	@DisplayName("Ejerccio 1.4")
	void test4()
	{
		Long numero = null;
		assertNull(numero);
		numero = 1L;
		assertNotNull(numero);
	}
	
	//EJERCICIO 1.5 -------------------------------------

	@Test
	@DisplayName("Ejercicio 1.2 F")
	void test2f()
	{
		String cadena1 = "cadena", cadena2 = "cadena", cadena3 ="diferente";
		assertNotEquals(cadena1, cadena2);
		assertEquals(cadena2, cadena3);
	}
	
	
	@Test
	@DisplayName("Ejercicio 1.3 F")
	void test3f()
	{
		assertFalse(25 > 12);
		assertTrue(25 > 27);
	}
	
	
	@Test
	@DisplayName("Ejerccio 1.4 F")
	void test4f()
	{
		Long numero = null;
		assertNotNull(numero);
		numero = 1L;
		assertNull(numero);
	}
	
	
}
