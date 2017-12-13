package io.github.fyggh.streams;

import java.util.stream.IntStream;

public class StreamPractice {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 100)
				.filter(x -> x % 2 != 0)
				.sum();
		
		System.out.println(sum);

	}

}
