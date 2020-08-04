package com.globallogic.bootcamp.patterns;

public class Order {

	private Currency currency = Currency.getInstance();
	private Product product = Product.getInstance();
	private String description;
	private int count;
	
	public Order()
	{
		
	}
	
	public Order(int count, String description, Currency currency, Product product)
	{
		this.count = count;
		this.description = description;
		this.currency = currency;
		this.product = product;
	}
	
	
	
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public Currency getCurrency()
	{
		return this.currency;
	}
	
	public void setCurrency(Currency currency)
	{
		this.currency = currency;
	}
	
	public Product getProduct()
	{
		return this.product;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}
}
