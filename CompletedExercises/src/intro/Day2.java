package intro;

public class Day2 {
	int i;
	public static void main(String args[]) {		
		Day2Exercises ex = new Day2Exercises();		
		
		System.out.println("DoWhile Ex1 & Ex2:");
		ex.doWhile();
		
		System.out.println("\nForLoop Ex1:");
		ex.forLoop();
		
		int random = ex.randomNumber();
		System.out.println("\nMethods Ex1: Random Number between 1 & 50: "+random);
		
		System.out.println("\nMethod-Parameters Ex1:");
		float f[] = ex._square_(1, 2, 3, 4);
		for(float ff:f) {
			System.out.println(ff);			
		}
		
		System.out.println("\nMethod-Parameters Ex2:");
		System.out.println("Comparing strings 'Momma' and 'Mommy' returns "+"'"+ex.findFirstWord("Momma", "Mommy")+"'");
	
		
		System.out.println("\nMethod-Parameters Ex3:");
		ex.displayArrayStatistics(new int[]{1,2,3,4,5,6,7,8,9,9}, new int[]{0,1,2,3,4,5,6,7,8});
		
		System.out.println("\nMethod-Returns Ex1:");
		double d = ex.getPi();
		System.out.println("PI = "+d);
		
		System.out.println("\nMethod-Returns Ex2:\nThe Alphabet");
		char cArray[] = ex.getAlphabetArray();
		for(char c:cArray) {
			System.out.println(c);
		}
		
		System.out.println("\nNested Loops Ex1: Names Generator");
		ex.nameGenerator();
		
		System.out.println("\nNested Loops Ex1: Print * Pattern");
		ex.printPattern();
		
		System.out.println("\nWhile Loops Ex1: Print 1 to 10");
		ex.print1To10();
		
		System.out.println("\nWhile Loops Ex2: Print Even Numbers between -100 and 100");
		ex.printSomeEvenNums();
	}
}