package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

public class Octopus {
	int xCoord, yCoord;
	
	public Octopus() {
		xCoord = 0;
		yCoord = 0;
	}
	public Octopus(int x, int y) {
		xCoord = x;
		yCoord = y;
		
	}
	public void draw(Graphics2D g2) {

		//legs
		
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg1Outline = new Ellipse2D.Double(xCoord+280, yCoord+150, 28, 253);
				g2.fill(Leg1Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg1 = new Ellipse2D.Double(xCoord+280, yCoord+150, 25, 250);
				g2.fill(Leg1);
				
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg2Outline = new Ellipse2D.Double(xCoord+315, yCoord+120, 28, 253);
				g2.fill(Leg2Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg2 = new Ellipse2D.Double(xCoord+315, yCoord+120, 25, 250);
				g2.fill(Leg2);
				
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg3Outline = new Ellipse2D.Double(xCoord+350, yCoord+120, 28, 253);
				g2.fill(Leg3Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg3 = new Ellipse2D.Double(xCoord+350, yCoord+120, 25, 250);
				g2.fill(Leg3);
				
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg4Outline = new Ellipse2D.Double(xCoord+385, yCoord+120, 28, 253);
				g2.fill(Leg4Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg4 = new Ellipse2D.Double(xCoord+385, yCoord+120, 25, 250);
				g2.fill(Leg4);
			
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg5Outline = new Ellipse2D.Double(xCoord+420, yCoord+120, 28, 253);
				g2.fill(Leg5Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg5 = new Ellipse2D.Double(xCoord+420, yCoord+120, 25, 250);
				g2.fill(Leg5);
				
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg6Outline = new Ellipse2D.Double(xCoord+455, yCoord+120, 28, 253);
				g2.fill(Leg6Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg6 = new Ellipse2D.Double(xCoord+455, yCoord+120, 25, 250);
				g2.fill(Leg6);
				
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg7Outline = new Ellipse2D.Double(xCoord+490, yCoord+120, 28, 253);
				g2.fill(Leg7Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg7 = new Ellipse2D.Double(xCoord+490, yCoord+120, 25, 250);
				g2.fill(Leg7);
				
				g2.setColor(new Color(248, 253, 244));//white outline
				Ellipse2D.Double Leg8Outline = new Ellipse2D.Double(xCoord+525, yCoord+150, 28, 253);
				g2.fill(Leg8Outline);
				g2.setColor(new Color(183,56,5));
				Ellipse2D.Double Leg8 = new Ellipse2D.Double(xCoord+525, yCoord+150, 25, 250);
				g2.fill(Leg8);		
		
				
		//arc for heads
		g2.setColor(new Color(248, 253, 244));//white under head
		g2.fillArc(xCoord+268, yCoord+48, 304, 400, 0, 180);	
				
		g2.setColor(new Color(183,56,5));//red head
		g2.fillArc(xCoord+270, yCoord+50, 300, 400, 0, 180);
				
		//body
		g2.setColor(new Color(146, 56, 5));//purple body
		Rectangle Body = new Rectangle(xCoord+270, yCoord+200,300,100 );
		g2.fill(Body);
		
		//eyes
		g2.setColor(new Color(52, 15, 45));//left eye
		Ellipse2D.Double LeftEye = new Ellipse2D.Double(xCoord+300, yCoord+220, 50, 50);
		g2.fill(LeftEye);
		
		g2.setColor(new Color(52, 15, 45));//right eye
		Ellipse2D.Double RightEye = new Ellipse2D.Double(xCoord+490, yCoord+220, 50, 50);
		g2.fill(RightEye);
		
		//eyeballs
		g2.setColor(new Color(248, 253, 244));
		Ellipse2D.Double LeftEyeBall = new Ellipse2D.Double(xCoord+310, yCoord+ 222, 20, 20);
		g2.fill(LeftEyeBall);
		
		g2.setColor(new Color(248, 253, 244));
		Ellipse2D.Double RightEyeBall = new Ellipse2D.Double(xCoord+500, yCoord+ 222, 20, 20);
		g2.fill(RightEyeBall);
		
		//mouth
		g2.setColor(new Color(248, 253, 244));//outline of dimple
		RoundRectangle2D.Double OutlineMouth = new RoundRectangle2D.Double(xCoord+403, yCoord+250,31, 15,25, 30);
		g2.fill(OutlineMouth);
		
		g2.setColor(new Color(21, 16, 65));
		RoundRectangle2D.Double Mouth = new RoundRectangle2D.Double(xCoord+406, yCoord+250,25, 15,10, 25);
		g2.fill(Mouth);
		

			
				
		
	}
	

}
