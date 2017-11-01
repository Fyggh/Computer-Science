package io.github.fyggh.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathIO {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a = 0;
		double b = 0;
		
		System.out.println("Please enter two numbers separated by a space.");
		
		try {
			a = scan.nextDouble();
			b = scan.nextDouble();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		Operations op = new Operations(a, b);
		
		op.printSum();
		op.printDifference();
		op.printProduct();
		op.printQuotient();
		op.printModulus();
		op.printPower();

		scan.close();
		
	}

}
