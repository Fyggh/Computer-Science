/**
 * Package containing logic for performing binary searches
 */
package io.github.fyggh.algorithms.search.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Fyggh
 *
 */
public abstract class BinarySearch {

	BinarySearch() {
		super();
	}
	
	public static int search(int[] array, int searchTerm) {
		
		//List list = Arrays.asList(array);
		
		
		int max = array.length;
		int min = 0;
		int guess;
		
		int timesRun = 0;
		
		int index = -1;
		
		while (max >= min) {
			
			guess = (int) Math.floor((max - min)/2);
			timesRun++;
			
			if (array[guess] == searchTerm) {
				index = guess;
				break;
			}
			else if (array[guess] < searchTerm) {
				max = guess - 1;
			}
			else {
				min = guess + 1;
			}
		}
		
		System.out.println(timesRun);
		return index;
		
	}

	public static int search(List<Integer> list, int searchTerm) { //TODO Can't do a binary search on an unsorted list!
		// TODO Auto-generated method stub
		
		int max = list.size() - 1;
		int min = 0;
		int guess;
		
		int timesRun = 0;
		
		int index = -1;
		
		while (max >= min) {
			
			guess = (int) Math.floor((max + min)/2);
			timesRun++;
			
			if (list.get(guess) == searchTerm) {
				index = guess;
				break;
			}
			else if (list.get(guess) > searchTerm) {
				max = guess - 1;
			}
			else {
				min = guess + 1;
			}
		}
		
		System.out.println(timesRun);
		return index;
		
	}
	
}
