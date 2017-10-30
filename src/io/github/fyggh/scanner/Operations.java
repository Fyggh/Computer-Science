/**
 * 
 */
package io.github.fyggh.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 200503041
 *
 */
public class Operations {

	int a;
	int b;
	boolean failure;
	Scanner scan = new Scanner(System.in);
	
	
	
	/**
	 * 
	 */
	public Operations() {
		
		do {
			failure = false;
			scan.reset();
			try {
				a = scan.nextInt();
				b = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Sorry, I didn't catch that."); // this is broken?
				failure = true;
			
			}
		} while (failure);
	}
	
	public void printSum() {
		System.out.println(a + b);
	}
	
	public void printDifference() { 
		System.out.println(a - b);
	}
	
	public void printProduct() {
		System.out.println(a * b);
	}
	
	public void printQuotient() {
		System.out.println(a / b);
	}
	
	public void printModulus() {
		System.out.println(a % b);
	}
	
	public void printPower() {
		System.out.println(Math.pow(a, b));
	}

}
