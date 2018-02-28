/**
 * 
 */
package io.github.fyggh.arraylists;

import java.util.List;
import java.util.Random;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 200503041
 *
 */
public class ArrayListTester {
	
	public static List<Integer> aList = new ArrayList<>();
	public static List<Pants> wardrobe = new ArrayList<>();
	
	public static Random rand = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int blueVal;
		int greenVal;
		int redVal;
		
		Color color;
		
		int waistSize;
		int length;
		
		
		
		for (int i = 0; i < 20; i++) {
			blueVal = rand.nextInt(255);
			greenVal = rand.nextInt(255);
			redVal = rand.nextInt(255);
			
			color = new Color(redVal, greenVal, blueVal);
			
			waistSize = rand.nextInt(40);
			length = rand.nextInt(40);
			
			if (rand.nextBoolean()) {
				wardrobe.add(new Pants(color, waistSize, length));
			}
			else {
				wardrobe.add(new Shorts(color, waistSize, length));
			}
			
		}
		
		System.out.println(wardrobe);
		
		for (int i = 0; i < 20; i++) {
			
			aList.add(Integer.valueOf((int) Math.pow(i, 1))); // java has autoboxing!
			aList.add((int) Math.pow(i, 2));
			
		}
		
		for (Iterator<Integer> iter = aList.listIterator(); iter.hasNext(); ) {
			System.out.println(iter.next());
		}
		
		//System.out.println(aList);
		

	}

}
