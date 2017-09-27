package io.github.fyggh.functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import io.github.fyggh.algorithms.search.binary.BinarySearch;

public abstract class BasicFunctions {

	private Function<Integer, Integer> increment = x -> x + 1;
	private BiFunction<List<Integer>, Integer, Integer> search = BinarySearch::search;
	
	public BasicFunctions() {
		
		increment.apply(5);
		
	}

}
