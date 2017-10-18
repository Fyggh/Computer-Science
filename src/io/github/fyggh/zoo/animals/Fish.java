package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Fish {
	int xCoord, yCoord, w, h;
	
	public Fish(int x, int y) {
		xCoord = x;
		yCoord = y;
	}
	
	public void draw(Graphics2D g2) {
		Ellipse2D.Double Body = new Ellipse2D.Double(xCoord, yCoord, 40, 20);
		g2.setColor(Color.BLUE);
		g2.fill(Body);
		
		Rectangle eye = new Rectangle(xCoord + 5, yCoord + 5, 4, 4);
		g2.setColor(Color.BLACK);
		g2.fill(eye);
		
		Line2D.Double mouth = new Line2D.Double(xCoord + 4, yCoord + 12, xCoord+8, yCoord + 12);
		g2.draw(mouth);
		
		Line2D.Double Gill1 = new Line2D.Double(xCoord+28, yCoord + 5, xCoord+28, yCoord+15);
		g2.draw(Gill1);
		
		Line2D.Double Gill2 = new Line2D.Double(xCoord+30, yCoord + 5, xCoord+30, yCoord+15);
		g2.draw(Gill2);
		
		Line2D.Double Gill3 = new Line2D.Double(xCoord+32, yCoord + 5, xCoord+32, yCoord+15);
		g2.draw(Gill3);
		
		Ellipse2D.Double Fin = new Ellipse2D.Double(xCoord+10, yCoord+12, 8, 15);
		g2.fill(Fin);
		
		g2.fillPolygon(new int[] {xCoord+40, xCoord+45, xCoord+45}, new int[] {yCoord+10, yCoord+0, yCoord+20}, 3);

	}
}
