package io.github.fyggh.mathpractice;

import java.util.Random;
import java.util.Scanner;

public class MathPractice {

	public static void main(String[] args) {
		
		final int UPPER_BOUND = 10;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a = rand.nextInt(UPPER_BOUND) + 1;
		int b = rand.nextInt(UPPER_BOUND) + 1;
		
		System.out.printf("What is %d + %d?\n", a, b);
		if (scan.nextInt() == a + b) {
			System.out.println("That's correct!");
		}
		else {
			System.out.printf("Sorry, that's incorrect. The correct answer is %d.", a + b);
		}
		
		scan.close();

	}
	
	

}
