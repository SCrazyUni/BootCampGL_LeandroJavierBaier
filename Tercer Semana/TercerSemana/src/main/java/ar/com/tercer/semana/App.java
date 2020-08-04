package ar.com.tercer.semana;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ElectricalOven electrical = new ElectricalOven();
        
        System.out.println("Power: " + electrical.getPower());
        
        electrical.turnOn();
        
        System.out.println("Power: " + electrical.getPower());
        
        electrical.turnLed();
        
        System.out.println("Power; " + electrical.getPower());
    }
}
