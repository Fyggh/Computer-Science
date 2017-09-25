/**
 * Package containing logic for performing binary searches
 */
package io.github.fyggh.algorithms.search.binary;

/**
 * @author Fyggh
 *
 */
public abstract class BinarySearch {

	BinarySearch() {
		super();
	}
	
	public static int search(int[] array, int searchTerm) {
		
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
	
}
