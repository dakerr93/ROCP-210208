package scanner;
import java.util.Scanner;


public class UserInputSimulation {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String args[]) {
		UserInputHelper helper = new UserInputHelper();
	
		// Ex 1  count Vowels
		helper.countVowel(sc);
		
		//Ex 2: Case statements		
		helper.checkMovement(sc);
				
		// close Scanner
		sc.close();
	}	
		
}
