package com.globallogic.bootcamp.patterns;

public class Currency {

	private final static Currency instance = new Currency();
	private String name;
	
	
	private Currency()
	{
		this.name = "ARS";
	}
	
	public static Currency getInstance()
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
