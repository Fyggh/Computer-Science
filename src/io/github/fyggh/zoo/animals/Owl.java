package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Owl {
	private int xCoord, yCoord;
		
	public Owl(int x, int y) {
		xCoord = x;
		yCoord = y;
		
	}

		
	
	public void draw(Graphics2D g2) {
		Color brown = new Color(114, 78, 16);
		Color orange = new Color(219, 148, 17);
		Color tan = new Color(178, 132, 48);
		
		g2.setPaint(tan);
		Rectangle2D.Double leftLeg = new Rectangle2D.Double(xCoord+15, yCoord+80, 5, 20);
		g2.fill(leftLeg);
		g2.setPaint(Color.black);
		g2.draw(leftLeg);
		
		g2.setPaint(tan);
		Rectangle2D.Double rightLeg = new Rectangle2D.Double(xCoord+33, yCoord+80, 5, 20);
		g2.fill(rightLeg);
		g2.setPaint(Color.BLACK);
		g2.draw(rightLeg);
		
		g2.setPaint(brown);
		Ellipse2D.Double body = new Ellipse2D.Double(xCoord+4, yCoord+37, 45, 55);
		g2.fill(body);
		g2.setPaint(Color.BLACK);
		g2.draw(body);
		
		Ellipse2D.Double head = new Ellipse2D.Double(xCoord, yCoord, 50, 50);
		g2.setPaint(brown);
		g2.fill(head);
		
		Ellipse2D.Double leftEye = new Ellipse2D.Double(xCoord+7, yCoord+10, 15, 17);
		g2.setPaint(orange);
		g2.draw(leftEye);
		g2.fill(leftEye);
		
		Ellipse2D.Double rightEye = new Ellipse2D.Double(xCoord+28, yCoord+10, 15, 17);
		g2.draw(rightEye);
		g2.fill(rightEye);
		
		g2.setPaint(Color.BLACK);
		Ellipse2D.Double leftPupil = new Ellipse2D.Double(xCoord+9, yCoord+11, 10, 13);
		g2.draw(leftPupil);
		g2.fill(leftPupil);
		
		Ellipse2D.Double RightPupil = new Ellipse2D.Double(xCoord+30, yCoord+11, 10, 13);
		g2.draw(RightPupil);
		g2.fill(RightPupil);
		
		g2.setPaint(Color.BLACK);
		int[] xpts = {xCoord+18,xCoord+31,xCoord+24};
		int[] ypts = {yCoord+30,yCoord+30,yCoord+45};
		Polygon beak = new Polygon(xpts, ypts, xpts.length);
		g2.fill(beak);
		
		
		g2.draw(head);
		g2.setPaint(brown);
		
		Ellipse2D.Double leftWing = new Ellipse2D.Double(xCoord, yCoord+44, 15, 40);
		g2.fill(leftWing);
		g2.setPaint(Color.BLACK);
		g2.draw(leftWing);
		
		g2.setPaint(brown);
		Ellipse2D.Double rightWing = new Ellipse2D.Double(xCoord+36, yCoord+44, 15, 40);
		g2.fill(rightWing);
		g2.setPaint(Color.BLACK);
		g2.draw(rightWing);
		
	}



	private Color Brighter(Color green) {
		// TODO Auto-generated method stub
		return null;
	}
}
