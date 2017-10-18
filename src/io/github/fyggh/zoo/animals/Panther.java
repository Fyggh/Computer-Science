package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Panther {
	
	int xCoord;
	int yCoord;
	String name;
	
	
	
	public Panther(int x, int y, String pantherName){
		
		xCoord = x;
		yCoord = y;
		name = pantherName; 
	}

		public void draw(Graphics2D g2) {
			Ellipse2D.Double head = new Ellipse2D.Double(xCoord+10, yCoord+10, 40, 40);
			g2.setColor(Color.black);
			g2.fill(head);
			Ellipse2D.Double ear1 = new Ellipse2D.Double(xCoord+13, yCoord+8, 10, 10);
			g2.setColor(Color.black);
			g2.fill(ear1);
			Ellipse2D.Double ear2 = new Ellipse2D.Double(xCoord+40, yCoord+8, 10, 10);
			g2.setColor(Color.black);
			g2.fill(ear2);
			Ellipse2D.Double body = new Ellipse2D.Double(xCoord+20, yCoord+30, 200, 50);
			g2.setColor(Color.black);
			g2.fill(body);
			Ellipse2D.Double neck = new Ellipse2D.Double(xCoord+17, yCoord+35, 22, 22);
			g2.setColor(Color.black);
			g2.fill(neck); 
			Ellipse2D.Double leg1 = new Ellipse2D.Double(xCoord+45, yCoord+65, 18, 50);
			g2.setColor(Color.black);
			g2.fill(leg1); 
			Ellipse2D.Double leg2 = new Ellipse2D.Double(xCoord+85, yCoord+65, 18, 50);
			g2.setColor(Color.black);
			g2.fill(leg2); 
			Ellipse2D.Double leg3 = new Ellipse2D.Double(xCoord+125, yCoord+65, 18, 50);
			g2.setColor(Color.black);
			g2.fill(leg3); 
			Ellipse2D.Double leg4 = new Ellipse2D.Double(xCoord+165, yCoord+65, 18, 50);
			g2.setColor(Color.black);
			g2.fill(leg4); 
			Ellipse2D.Double foot1 = new Ellipse2D.Double(xCoord+42, yCoord+101, 20, 20);
			g2.setColor(Color.black);
			g2.fill(foot1);
			Ellipse2D.Double foot2 = new Ellipse2D.Double(xCoord+82, yCoord+101, 20, 20);
			g2.setColor(Color.black);
			g2.fill(foot2);
			Ellipse2D.Double foot3 = new Ellipse2D.Double(xCoord+122, yCoord+101, 20, 20);
			g2.setColor(Color.black);
			g2.fill(foot3);
			Ellipse2D.Double foot4 = new Ellipse2D.Double(xCoord+162, yCoord+101, 20, 20);
			g2.setColor(Color.black);
			g2.fill(foot4);
			Ellipse2D.Double tail = new Ellipse2D.Double(xCoord+200, yCoord+50, 80, 10);
			g2.setColor(Color.black);
			g2.fill(tail); 
			Ellipse2D.Double rightEye = new Ellipse2D.Double(xCoord+20, yCoord+15, 6, 6);
			g2.setColor(Color.white);
			g2.fill(rightEye); 
			Ellipse2D.Double leftEye = new Ellipse2D.Double(xCoord+33, yCoord+15, 6, 6);
			g2.setColor(Color.white);
			g2.fill(leftEye);
			Ellipse2D.Double mouth = new Ellipse2D.Double(xCoord+23, yCoord+28, 13, 7);
			g2.setColor(Color.white);
			g2.fill(mouth);
			Ellipse2D.Double tongue = new Ellipse2D.Double(xCoord+27, yCoord+30, 4, 7);
			g2.setColor(Color.red);
			g2.fill(tongue);
			
		
	}

}
