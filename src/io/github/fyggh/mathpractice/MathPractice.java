package io.github.fyggh.mathpractice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MathPractice {

	public static void main(String[] args) {
		
		final int UPPER_BOUND = 10;
		final int NUM_PROBLEMS = 10;
		
		int numCorrect = 0;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < NUM_PROBLEMS; i++) {
			
			int a = rand.nextInt(UPPER_BOUND) + 1;
			int b = rand.nextInt(UPPER_BOUND) + 1;
			
			System.out.printf("Problem %d of %d: What is %d + %d?\n", i + 1, NUM_PROBLEMS, a, b);
			
			try {
				if (scan.nextInt() == a + b) {
					System.out.println("That's correct!");
					numCorrect++;
				} else {
					System.out.printf("Sorry, that's incorrect. The correct answer is %d.\n", a + b);
				}
			} catch (InputMismatchException e) {
				System.out.printf("%s is not a valid input. The correct answer is %d.\n", scan.nextLine(), a + b);
			}
		}
		
		System.out.printf("You have answered %d problems correctly out of %d, for a score of %d%%", 
				numCorrect, NUM_PROBLEMS, numCorrect * 100 / NUM_PROBLEMS);
		
		scan.close();

	}

}

// Absent on Monday, December 12, 2017