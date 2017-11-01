/**
 * 
 */
package io.github.fyggh.scanner;

/**
 * @author 200503041
 *
 */
public class OperationsInt {

	int a;
	int b;
	
	public OperationsInt(int a, int b) {
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
			System.err.println("Can't divide by 0, you fool.");
		}
	}
	
	public void printDoubleQuotient() {
		try {
			System.out.println((double) a / (double) b);
		} catch (ArithmeticException e) {
			System.err.println("Can't divide by 0, you fool.");
		}
	}
	
	public void printModulus() {
		try {
			System.out.println(a % b);
		} catch (ArithmeticException e) {
			System.err.println("Can't divide by 0, you fool.");
		}
	}
	
	public void printPower() {
		System.out.println(Math.pow(a, b));
	}

}
