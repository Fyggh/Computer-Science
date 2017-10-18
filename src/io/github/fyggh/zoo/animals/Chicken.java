package io.github.fyggh.zoo.animals;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Chicken {
	private int x;
	private int y;
	
	public Chicken(int xCoordinate, int yCoordinate) {
		x = xCoordinate;
		y = yCoordinate;
		
	}

	public void draw(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		Ellipse2D.Double martha = new Ellipse2D.Double(70,80,60,45);
		g2.draw(martha);
		Ellipse2D.Double martha2 = new Ellipse2D.Double(115,60,15,40);
		g2.draw(martha2);
		Ellipse2D.Double martha3 = new Ellipse2D.Double(122,55,20,15);
		g2.draw(martha3);
		Ellipse2D.Double martha4 = new Ellipse2D.Double(85,110,20,20);
		g2.draw(martha4);
		Ellipse2D.Double martha5 = new Ellipse2D.Double(100,110,20,20);
		g2.draw(martha5);
		Ellipse2D.Double martha6 = new Ellipse2D.Double(40,90,55,10);
		g2.draw(martha6);
		Ellipse2D.Double martha7 = new Ellipse2D.Double(50,80,35,10);
		g2.draw(martha7);
		Ellipse2D.Double martha8 = new Ellipse2D.Double(70,70,10,15);
		g2.draw(martha8);
		Ellipse2D.Double martha9 = new Ellipse2D.Double(80,60,10,30);
		g2.draw(martha9);
		Rectangle.Double martha10 = new Rectangle.Double(90,130,2,15);
		g2.draw(martha10);
		Rectangle.Double martha11 = new Rectangle.Double(105,130,2,15);
		g2.draw(martha11);
		Rectangle.Double martha12 = new Rectangle.Double(90,145,5,2);
		g2.draw(martha12);
		Rectangle.Double martha13 = new Rectangle.Double(105,145,5,2);
		g2.draw(martha13);
		Rectangle.Double martha14 = new Rectangle.Double(142,61,5,2);
		g2.draw(martha14);
		
		g2.setColor(new Color(204, 102, 0));
		g2.fill(martha);
		g2.fill(martha2);
		g2.fill(martha3);
		g2.fill(martha4);
		g2.fill(martha5);
		g2.fill(martha6);
		g2.fill(martha7);
		g2.fill(martha8);
		g2.fill(martha9);
		g2.setColor(Color.YELLOW);
		g2.fill(martha10);
		g2.fill(martha11);
		g2.fill(martha12);
		g2.fill(martha13);
	}
			
			
		}
		
	



