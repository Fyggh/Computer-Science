package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.color.*;

public class Peacock {
	int xCoord, yCoord, w, h; 
	
	public Peacock(int x, int y, int width, int height) {
		xCoord = x;
		yCoord = y;
		w = width;
		h = height;
	}
public void draw(Graphics2D g2) {
	Ellipse2D.Double feathers = new Ellipse2D.Double(120, 90, 150 ,150);
	g2.draw(feathers);
	g2.setColor(Color.green);
	g2.fill(feathers);
	
	Rectangle neck = new Rectangle(110, 125, 10,100);
	g2.setColor(Color.blue);
	g2.fill(neck);
	
	Ellipse2D.Double head = new Ellipse2D.Double(100, 120, 25 ,25);
	g2.draw(head);
	g2.setColor(Color.black);
	g2.fill(head);
	
	Rectangle leg = new Rectangle(50, 214, 100,7);
	g2.setColor(Color.gray);
	g2.fill(leg);
	
	Rectangle leg2 = new Rectangle(150, 214, 7,65);
	g2.setColor(Color.gray);
	g2.fill(leg2);
		
	Ellipse2D.Double body = new Ellipse2D.Double(100, 185, 120, 60);
	g2.draw(body);
	g2.setColor(Color.blue);
	g2.fill(body);
	
	g2.setColor(Color.gray);
	g2.drawPolygon(new int[] {100,65,85,65,100}, new int[] {143-15,145-15,147-15,149-15,149-15}, 5);
	g2.fillPolygon(new int[] {100,65,85,65,100}, new int[] {143-15,145-15,147-15,149-15,149-15}, 5);
	
	Ellipse2D.Double eye = new Ellipse2D.Double(105, 125, 10 ,10);
	g2.draw(eye);
	g2.setColor(Color.white);
	g2.fill(eye);
	
	Ellipse2D.Double pupil = new Ellipse2D.Double(107, 127, 5 ,5);
	g2.draw(pupil);
	g2.setColor(Color.black);
	g2.fill(pupil);
	
	Rectangle handle = new Rectangle(49, 205, 7,30);
	g2.setColor(Color.black);
	g2.fill(handle);
	
	Rectangle barrel = new Rectangle(25, 205, 30,15);
	g2.setColor(Color.black);
	g2.fill(barrel);
	
	Arc2D.Double trigger = new Arc2D.Double(42, 212, 15, 15, 135, 135, Arc2D.CHORD);
	g2.setColor(Color.BLACK);
	g2.fill(trigger);
	
	Rectangle talons = new Rectangle(140, 265, 25,7);
	g2.setColor(Color.gray);
	g2.fill(talons);
	
	Line2D.Double featherz = new Line2D.Double(125 ,200 , 187, 230);
	g2.setColor(Color.BLACK);
	g2.draw(featherz);
	
	
	
}
}
