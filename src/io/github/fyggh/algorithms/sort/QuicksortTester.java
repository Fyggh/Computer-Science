/**
 * 
 */
package io.github.fyggh.algorithms.sort;

import java.util.Arrays;

/**
 * @author 200503041
 *
 */
public class QuicksortTester {
	
	static int[] nums = {5,1,4,2,67,2,4,6,223,7,45,2,6,23,1,4,6,8,34,2};
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(nums));
		QuicksortInt.quicksort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));

	}

}
