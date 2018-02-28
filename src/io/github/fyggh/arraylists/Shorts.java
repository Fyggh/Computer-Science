/**
 * 
 */
package io.github.fyggh.arraylists;

import java.awt.Color;

/**
 * @author 200503041
 *
 */
public class Shorts extends Pants {

	/**
	 * @param color
	 * @param waistSize
	 * @param length
	 */
	public Shorts(Color color, int waistSize, int length) {
		super(color, waistSize, length);
	}
	
	@Override
	public String toString() {
		return String.format("\nThese are %s shorts with a waistsize of %d and a length of %d", this.getColor(), getWaistSize(), getLength());
		
	}

}
