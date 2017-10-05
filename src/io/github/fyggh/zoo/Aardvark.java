/**
 * 
 */
package io.github.fyggh.zoo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

import javax.swing.JComponent;

/**
 * @author 200503041
 *
 */
public class Aardvark {

	private int x, y;
	private int numPoints;
	
	private double[] xPoints = {5.0, 300, 30};
	private double[] yPoints = {3, 20, 300};
	
	/**
	 * 
	 */
	public Aardvark() {
		super();
		numPoints = xPoints.length;
	}
	
	/**
	 * 
	 */
	public Aardvark(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void paint(Graphics2D g2) { //how does he want this? how is this being called?
		// TODO draw aardvark
		
		Ellipse2D.Double where = new Ellipse2D.Double(1000, 1000, 10, 10);
		
		Path2D.Double aardvarkPath = new Path2D.Double(Path2D.WIND_NON_ZERO, this.numPoints);
		
		aardvarkPath.moveTo(xPoints[0], yPoints[0]);
		
		for (int i = 1; i < numPoints; i++) {
			
			aardvarkPath.quadTo(1000, 1000, xPoints[i], yPoints[i]);
			
		}
		
		aardvarkPath.closePath();
		
		
		
		g2.fill(aardvarkPath);
		g2.setPaint(Color.blue);
		g2.fill(where);
	}

	
}
