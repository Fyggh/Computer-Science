package io.github.fyggh.mathpractice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MathPractice {

	public static void main(String[] args) {
		
		final int UPPER_BOUND = 10;
		final ArrayList<Operation> operationList = new ArrayList<>();
		operationList.add(new Add());
		operationList.add(new Subtract());
		operationList.add(new Operation("*") {
			apply = (x,y) -> x*y;
		})
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		Operation op = operationList.get(rand.nextInt(operationList.size()));
		
		int a = rand.nextInt(UPPER_BOUND) + 1;
		int b = rand.nextInt(UPPER_BOUND) + 1;
		
		System.out.printf("What is %d %s %d?\n", a, op.getSign(), b);
		if (scan.nextInt() == op.apply(a, b)) {
			System.out.println("That's correct!");
		}
		else {
			System.out.printf("Sorry, that's incorrect. The correct answer is %d.", op.apply(a, b));
		}
		
		scan.close();

	}
	
	private static abstract class Operation implements BiFunction<Integer, Integer, Integer> {
		
		private String sign;
		
		protected Operation(String sign) {
			this.setSign(sign);
		}

		public Operation() {
			// TODO Auto-generated constructor stub
		}

		/**
		 * @return the sign
		 */
		public String getSign() {
			return sign;
		}

		/**
		 * @param sign the sign to set
		 */
		public void setSign(String sign) {
			this.sign = sign;
		}
		
		
		
	}
	
	private static class Add extends Operation {

		public Add() {
			this.setSign("+");
		}
		
		@Override
		public Integer apply(Integer arg0, Integer arg1) {
			// TODO Auto-generated method stub
			return arg0 + arg1;
		}
		
	}
	
	private static class Subtract extends Operation {

		public Subtract() {
			this.setSign("-");
		}
		
		@Override
		public Integer apply(Integer arg0, Integer arg1) {
			// TODO Auto-generated method stub
			return arg0 - arg1;
		}
		
	}

}
