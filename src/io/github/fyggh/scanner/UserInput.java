package io.github.fyggh.scanner;

import java.util.Random;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		boolean stillLooking = true;
		int number = rand.nextInt(9) + 1;
		
		
		System.out.println("Let's play a guessing game. Guess the number I'm thinking of. It's between 1 and 10.");
		
		while (stillLooking) {
			
			int i;
			
			i = scan.nextInt();
			
			if (i == number) {
				System.out.println("You did it! My number was " + number + "!");
				return;
			}
			else {
				System.out.println("Whoops, guess again!");
				if (number > i) {
					System.out.println("My number is greater than " + i + ".");
				}
				else {
					System.out.println("My number is less than " + i + ".");
				}
			}
			
		}
			
	}

}
