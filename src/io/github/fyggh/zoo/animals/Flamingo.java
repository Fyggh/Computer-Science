package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Flamingo {
	int xCoord, yCoord;
	
	public Flamingo(){
		xCoord = 0;
		yCoord = 0;
	}
	public Flamingo( int x, int y){
		xCoord = x;
		yCoord = y;
	}
	public void draw(Graphics2D g2){
		g2.setColor(Color.pink);
		Rectangle neck = new Rectangle( xCoord + 50, yCoord + 30, 10, 90);
		g2.fill(neck);
		Rectangle head = new Rectangle( xCoord + 30, yCoord + 30, 25, 15);
		g2.fill(head);
		Ellipse2D.Double body = new Ellipse2D.Double(xCoord + 40, yCoord + 90, 90, 40);
		g2.fill(body);
		
		g2.setColor(new Color( 234, 159, 160));
		Ellipse2D.Double wings = new Ellipse2D.Double(xCoord + 55, yCoord + 90, 60, 30);
		g2.fill(wings);
		
		g2.setColor(Color.black);
		Ellipse2D.Double eye = new Ellipse2D.Double(xCoord + 49, yCoord + 33, 5, 5);
		g2.fill(eye);
		Line2D.Double leg1 = new Line2D.Double( xCoord + 70, yCoord + 128, xCoord + 50, yCoord + 180);
		g2.draw(leg1);
		Line2D.Double leg2 = new Line2D.Double( xCoord + 90, yCoord + 125, xCoord + 100, yCoord + 180);
		g2.draw(leg2);
		Line2D.Double foot1 = new Line2D.Double( xCoord + 40, yCoord + 180, xCoord + 55, yCoord + 180);
		g2.draw(foot1);
		Line2D.Double foot2 = new Line2D.Double( xCoord + 90, yCoord + 180, xCoord + 105, yCoord + 180);
		g2.draw(foot2);
		Line2D.Double beak = new Line2D.Double( xCoord + 46, yCoord + 30, xCoord + 46, yCoord + 44);
		g2.draw(beak);
		Line2D.Double lips = new Line2D.Double( xCoord + 46, yCoord + 35, xCoord + 30, yCoord + 43);
		g2.draw(lips);
	}
	
}
