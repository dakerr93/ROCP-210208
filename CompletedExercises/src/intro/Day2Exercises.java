package intro;

public class Day2Exercises{
	
	// 2 do-While Loops
	public void doWhile() {
		//ex 1		
		int i = 1;
		do {
			System.out.println(i);
			i+= 2;
		} while (i<=49);
				
		// ex 2	
		System.out.println("\n");
		char alphabet = 'a';
		do {
			System.out.println(alphabet);
			alphabet++;			
		} while( alphabet <= 'z');
	}
	
	// for Loop
	public void forLoop() {
		//ex 1		
		byte[] b = {11,22,33,44,55,66,77,88,99,100};
		for (int i=0;i<10;i++) {
			System.out.println(b[i]);
		}
	}
	
	// generates random number between 1 and 50 inclusive
	public int randomNumber() {
		double d = Math.random();		
		return(1+((int)(d*50))); //used help from stackoverflow: Min + (int)(Math.random() * ((Max - Min) + 1))		
	}	
	
	// returns a float array with squares of 4 integers accepted as args 
	public float[] _square_(int i1, int i2, int i3, int i4) {
		float[] intSqArray = {(i1*i1),(i2*i2),(i3*i3),(i4*i4)};
		return intSqArray;
	}
	
	// returns the smaller of 2 strings accepted as args
	public String findFirstWord(String s1, String s2) {
		int i =	s1.compareTo(s2);		
		if(i <=0) 		//s1 is same as or precedes s2
			return s1;
		else 
			return s2;		
	}	
	
	// accepts 2 int arrays and displays some statistics
	public void displayArrayStatistics(int a[], int b[]) {
		int aCounter = 0;
		int bCounter = 0;
		String result = "";
		// display the 2 arrays first		
		System.out.print("A= { ");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println("}");
		System.out.print("B= { ");
		for(int i:b)			
			System.out.print(i+" ");
		System.out.println("}");
		// end display the 2 arrays
		
		
		//test which array has more even numbers
		for(int i=0;i<a.length;i++) {			
			if((a[i] %2) == 0)
				++aCounter;
		}
		for(int i=0;i<b.length;i++) {			
			if((b[i] %2) == 0)
				++bCounter;
		}
		if(aCounter > bCounter)
			result = "A contains more Even numbers";
		else if (aCounter < bCounter)
			result = "B contains more Even numbers";
		else
			result = "A and B contains the same number of Even numbers";			
		System.out.println(result);
		// end %2 test

		//test which array has more multiples of 3
		aCounter = bCounter = 0;
		for(int i:a) {			
			if((i%3) == 0)
				++aCounter;
		}
		for(int i:b) {			
			if((i%3) == 0)
				++bCounter;
		}
		if(aCounter > bCounter)
			result = "A contains more Multiples of 3";
		else if (aCounter < bCounter)
			result = "B contains more Multiples of 3";
		else
			result = "A and B contains the same number of Multiples of 3";			
		System.out.println(""+result);
		// end %3 test		
		
		// test which array has more data
		if (a.length > b.length)
			result = "A contains more data";
		else if (a.length < b.length) 
			result = "B contains more data";
		else
			result = "A and B contain equal amount of data";
		System.out.println(""+result);
		// end size test
		
	}
	
	
	// returns the value of PI
	public double getPi() {
		return Math.PI;
	}
	
	
	// returns char array of the alphabet
	public char[] getAlphabetArray() {
		char cArray[] = new char[26];
		char c = '\u0061';
		for(int i=0; i<cArray.length;i++) {
			cArray[i] = c++;
		}
		return cArray;		
	}
	
	// prints all combinations from 2 lists of First and Last Names  
	public void nameGenerator() {
		String[] first = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William"};
		String[] last = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		int counter = 1;
		for(String fName:first) {
			for(String lName:last) {
				System.out.println((counter++)+": "+fName+" "+lName);
			}
		}
	}
	
	// prints a specific * pattern
	public void printPattern() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	//print 1 to 10
	public void print1To10() {
		int i = 1;
		while(i<11) {
			System.out.println(i++);			
		}
	}
	
	//print Even Numbers between -100 and 100
	public void printSomeEvenNums() {
		int i = -100;
		while(i<101) {			
			if((i%2) == 0) {
				System.out.println(i);			
			}
			i++;
		}
	}	
	
} // End class