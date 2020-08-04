package ar.com.tercer.semana;

public class ElectricalApplianse {
	private double power;
	
	public ElectricalApplianse()
	{
		this.power = 500;
	}
	
	
	public void turnOn()
	{
		this.power -= 50;
	}
	
	
	
	public double getPower()
	{
		return this.power;
	}
	
	public void setPower(double power)
	{
		this.power = power;
	}
}
