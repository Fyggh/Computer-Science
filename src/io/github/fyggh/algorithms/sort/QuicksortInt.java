/**
 * 
 */
package io.github.fyggh.algorithms.sort;

/**
 * @author 200503041
 *
 */
public class QuicksortInt {

	/**
	 * 
	 */
	public QuicksortInt() {
		// TODO Auto-generated constructor stub
	}
	
	public static void quicksort(int[] arr, int lo, int hi) {
		
		if (lo < hi) {
		
			int p = partition(arr, lo, hi);
			
			quicksort(arr, lo, p);
			quicksort(arr, p + 1, hi);
		
		}
		
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		
		int pivot = arr[hi];
		int i = lo - 1;
		int j = hi + 1;
		
		while (true) {
			
			do {
				i++;
			} while (arr[i] < pivot);
			
			do {
				j--;
			} while (arr[j] > pivot);
			
			if (i > j) {
				return j;
			}
			
			swap(arr, i, j);
			
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
