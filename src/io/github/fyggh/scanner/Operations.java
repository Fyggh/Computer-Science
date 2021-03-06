package io.github.fyggh.scanner;

public class Operations {

	double a;
	double b;
	
	public Operations(double a, double b) {
		this.a = a;
		this.b = b;
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
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("Can't divide by 0, you fool."); // although it looks like double division by 0.0 returns Double.infinity?
		}
	}
	
	public void printModulus() {
		try {
			System.out.println(a % b);
		} catch (ArithmeticException e) {
			System.err.println("Can't divide by 0, you fool."); // although double modulus looks like it returns NaN
		}
	}
	
	public void printPower() {
		System.out.println(Math.pow(a, b));
	}

}
