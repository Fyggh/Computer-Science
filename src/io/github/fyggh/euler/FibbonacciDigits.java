/**
 * 
 */
package io.github.fyggh.euler;

import java.math.BigInteger;

/**
 * @author 200503041
 *
 */
public class FibbonacciDigits {
	
	private static final int NUM_DIGITS = 1000;
	
	public int naiveSolution() {
		
		return -1;
		
	}
	
	public static BigInteger fibbonacci(BigInteger index) {
		return fibbonacci(index, BigInteger.ONE, BigInteger.ONE);
	}
	
	public static int fibbonacci(int index, int i, int j) {
		
		if (index < 2) {
			return j;
		}
		
		return fibbonacci(index - 1, j, i + j);
		
	}
	
	public static BigInteger fibbonacci(BigInteger index, BigInteger i, BigInteger j) {
		
		if (index.compareTo(new BigInteger("2")) < 0) {
			return j;
		}
		
		return fibbonacci(index.subtract(new BigInteger("1")), j, i.add(j));
	}
	
}
