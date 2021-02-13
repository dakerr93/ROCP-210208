import java.util.Scanner;

public class ImperialMetricHelper {
	private int scanCounter = 0;
	
	public void convert(Scanner sc) {
		
		String directions = "Select your conversion by entering the number:\n";
		if (scanCounter ==  0) {
			directions = directions 
					+ "1. Feet to Inches\n"
					+ "2. Feet to Yards\n"
					+ "3. Feet to Miles\n"
					+ "4. Meters to Miles\n"
					+ "q. End this Program\n"; 
		}
		System.out.println(directions);
		char choice = ((sc.next()).trim()).charAt(0);
		scanCounter++;

		boolean quit = false;
		double output = 0;
		switch (choice) {
			case '1' : 		output = getInputToConvert(sc)* 12;							
							break;
			case '2':  		output = getInputToConvert(sc)/3;
							break;
			case '3':  		output = getInputToConvert(sc)/5280;	
							break;
			case '4':  		output = getInputToConvert(sc)/1609.34;	
							break;			
			case 'q'|'Q': 	quit = true;
							break;			
			default: 		System.out.println("Not a valid choice. Try again.");
							break;
		}
		if(!quit) {
			System.out.println(output);
			convert(sc);
		}
	} // end convert method()	
	
	public double getInputToConvert(Scanner sc) {		
		System.out.println("Enter a value to convert: ");
		return sc.nextDouble();
		//check its a double
	}

}
