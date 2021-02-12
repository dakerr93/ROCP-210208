package day34;
import java.util.Random;

public class Thermometer {
	
	public int getTemperature() {		
		Random r = new Random(); 
		return(r.nextInt(109));	//generate random number between 0 and 108 inclusive	
	}
}
