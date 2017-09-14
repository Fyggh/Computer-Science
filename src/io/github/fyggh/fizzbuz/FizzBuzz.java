package io.github.fyggh.fizzbuz;

public class FizzBuzz {

	public static void main(String[] args) {

		int totalCounter;
		int fizzCounter = 0;
		int buzzCounter = 0;
		
		boolean printTotal = true;
		
		for (totalCounter = 0; totalCounter < 100; ) {
			
			totalCounter++;
			fizzCounter++;
			buzzCounter++;
			
			printTotal = true;
			
			if (fizzCounter == 3) {
				
				fizzCounter = 0;
				printTotal = false;
				System.out.print("fizz");
			
			}
			
			if (buzzCounter == 5) {
				
				buzzCounter = 0;
				printTotal = false;
				System.out.print("buzz");
				
			}
			
			if (printTotal) {
				
				System.out.print(totalCounter);
				
			}
			
			System.out.println();
			
		}

	}

}
