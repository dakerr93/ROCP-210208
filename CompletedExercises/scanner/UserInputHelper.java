package scanner;
import java.util.Scanner;

public class UserInputHelper {


	// Ex1: Count vowel in User Input
	public void countVowel(Scanner sc) {

		System.out.println("Enter your input:");
		char input[] = (sc.nextLine()).toCharArray();
		int vowelCount = 0;
		for(char c:input) {
			if(c=='a'|| c == 'e' || c=='i' ||c=='o' ||c=='u')
				vowelCount++;
		}
		System.out.println("The number of Vowels in your  entry is: "+vowelCount);
	} // end Ex1

	// Ex2: Case statements
	public void checkMovement(Scanner sc) {
		System.out.println("Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
		boolean quit = false;
		char input = ((sc.next()).trim()).charAt(0);
		String output = "";
		switch (input) {
			case 'q':  	quit = true;
						break;
			case '1' :  output = "Move Right";
						break;
			case '2':  	output = "Move Left";
						break;
			case '3':  	output = "Move Up";
						break;
			case '4':  	output = "Move Down";
						break;
			default:  	output = "Try again.";
						break;
		}
		System.out.println(output);
		if (!quit)
			checkMovement(sc); // recursively get User Input until quit
	} // end Ex2
}