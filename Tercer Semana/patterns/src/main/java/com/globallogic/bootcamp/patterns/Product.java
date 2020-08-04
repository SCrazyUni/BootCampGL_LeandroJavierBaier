package com.globallogic.bootcamp.patterns;

public class Product {

	private String name;
	private final static Product instance = new Product();
	
	private Product()
	{
		this.name = "Clavos";
	}
	
	public static Product getInstance()
	{
		return instance;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	
}
