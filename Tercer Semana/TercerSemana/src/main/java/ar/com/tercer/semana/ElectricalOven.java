package ar.com.tercer.semana;

public class ElectricalOven extends ElectricalApplianse {
	
	private LedApplianse ledApplianse = new LedApplianse();
	
	public ElectricalOven()
	{
		
	}
	
	
	@Override
	public void turnOn()
	{
		this.setPower((this.getPower() - 75));
	}

	public void turnLed()
	{
		this.setPower(ledApplianse.turnOn(this.getPower()));
	}
}
