package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Eagle {

	int x;
	int y;
	String name;
	
	
	public Eagle(int x, int y, String eaglename) {
	
	x = 0;
	y = 0;
	name = eaglename;
}
		public void draw ( Graphics2D g2) {
		
		Ellipse2D.Double head= new Ellipse2D.Double(x, y, 25, 25);
		g2.setColor(Color.white);
		g2.fill (head);
		
		
}
}