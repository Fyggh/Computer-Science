/**
 * 
 */
package io.github.fyggh.algorithms.helpers;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;

/**
 * @author 200503041
 *
 */
public class RandomArrayList<T> extends ArrayList<T>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2235747553361231480L;
	Random rand = new Random();
	
	public RandomArrayList(Function<Random, T> creator, int length) {
		
		for (int i = 0; i < length; i++) {
			this.add(creator.apply(rand));
		}
		
	}
	
}
