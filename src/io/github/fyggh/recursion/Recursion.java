package io.github.fyggh.recursion;

public class Recursion {

	public Recursion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(problem4(6));

	}
	
	private static int problem4(int x) {
		if (x % 2 == 0 && x > 0) {
			return problem4(x-2) - 2*problem4((x-1) % 3) + 1;
		}
		else if (x % 2 == 1) {
			return x + 1;
		}
		else {
			return 0;
		}
	}
	
	private static int fibo(int n, int a, int b) {
		if (n == 0) {
			return b;
		}
		else if (n == 1) {
			return b;
		}
		else {
			return fibo(n-1, b, a+b);
		}
		
	}
	
	public static int fibo(int n) {
		return fibo(n, 1, 1);
	}

}
