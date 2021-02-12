package day34;

public class WeatherMachine {	
	private Thermometer th = new Thermometer();
	private String city = "The Greatest City in the World!";

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	WeatherMachine() {
		super();
	}
	
	WeatherMachine(String city) {
		setCity(city);
	}
	
	private int[] getPastTemperatures() {
		int[] temps = new int[24];
		for(int i=0;i<24;i++) {
			temps[i] = th.getTemperature(); //get 24 random temperatures for the 24 hours of day
		}
		return temps;
	}
	
	public void getWeatherReport() {
		int[] temps = this.getPastTemperatures();
		System.out.println("Your Last 24 Hours: in "+this.getCity());
		for(int i=0;i<24;i++) {
			System.out.println(i+":00 - "+temps[i]+" degrees"); //display 24 hours and their temperatures			
		}
	}
}
