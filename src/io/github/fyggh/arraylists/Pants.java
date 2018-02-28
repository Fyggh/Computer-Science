/**
 * 
 */
package io.github.fyggh.arraylists;

import java.awt.Color;

/**
 * @author 200503041
 *
 */
public class Pants {
	
	private Color color;
	private int waistSize;
	private int length;

	/**
	 * @param color
	 * @param waistSize
	 * @param length
	 */
	public Pants(Color color, int waistSize, int length) {
		super();
		this.color = color;
		this.waistSize = waistSize;
		this.length = length;
	}
	
	@Override
	public String toString() {
		return String.format("\nThese are %s pants with a waistsize of %d and a length of %d", getColor(), getWaistSize(), getLength());
		
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the waistSize
	 */
	public int getWaistSize() {
		return waistSize;
	}

	/**
	 * @param waistSize the waistSize to set
	 */
	public void setWaistSize(int waistSize) {
		this.waistSize = waistSize;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
}
