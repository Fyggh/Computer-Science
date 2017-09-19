package io.github.fyggh.face;

import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Face {

	
	private Ellipse2D head;
	private Arc2D eyeTop;
	
	public Face(double x, double y, double width, double height) {
		
		head = new Ellipse2D.Double(x, y, width, height);
		
		//eyeTop = new Arc2D.Double()
		
	}
	
	
	
}
