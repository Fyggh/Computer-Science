/**
 * 
 */
package io.github.fyggh.zoo;

import java.util.ArrayList;
import java.util.List;

import io.github.fyggh.zoo.SVGReader.Instruction;

/**
 * @author Fyggh
 *
 */
public final class SVGReader {

	
	/**
		 * @author Fyggh
		 *
		 */
	protected class Instruction {

		private char instructionType;
		private double[] points;
		
		/**
		 * @param instructionType
		 * @param points
		 */
		protected Instruction(char instructionType, double[] points) {
			super();
			this.instructionType = instructionType;
			this.points = points;
		}
		
		protected Instruction(char instructionType, String points) {
			this(instructionType, extractPoints(points));
		}
		
	}

	private List<Instruction> instructions = new ArrayList();
	
	/**
	 * 
	 */
	public SVGReader() {
		// TODO Auto-generated constructor stub
	}
	
	public void read(String svg) {
		
		//svg.replaceAll(regex, replacement)
		
		//while (true_)
		
	}
	
	public double[] extractPoints(String points) {
		
		// example point string: 82.567,0,86,42.212,86,86
		
		String[] pointsStringArray = points.replace(',', ' ').replaceAll("(?<!\\A)-", " -").split("\\s+"); //TODO add handling for negative exponents
		
		double[] pointsDoubleArray = new double[pointsStringArray.length];
		
		for (int i = 0; i < pointsStringArray.length; i++) {
			
			pointsDoubleArray[i] = Double.parseDouble(pointsStringArray[i]); //TODO add possibility of NumberFormatException
			
		}
		
		return pointsDoubleArray;
		
	}
	
	//public String reformatString

}
