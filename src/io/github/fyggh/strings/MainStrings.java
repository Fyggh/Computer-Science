package io.github.fyggh.strings;

import java.math.BigInteger;

import io.github.fyggh.euler.FibbonacciDigits;

public class MainStrings {

	public static void main(String[] args) {
		
		String spam = "Quoting Monty Python";
		String python = spam.substring(14).toUpperCase();
		
		System.out.println(python);
		
		BigInteger index = new BigInteger("4781");
		
		System.out.println(FibbonacciDigits.fibbonacci(index).toString().length());

	}

}
