package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Snake {
	int xCoord, yCoord, w, h;
	
	public Snake(int x, int y, int width, int height) {
		xCoord = x;
		yCoord = y;
		w = 40;
		h = 20;
	}

	public void draw(Graphics2D g2) {
		Ellipse2D.Double snake = new Ellipse2D.Double(xCoord, yCoord, w, h);
		g2.draw(snake);
		g2.setColor(new Color(107,142,35));
		g2.fill(snake);
		Ellipse2D.Double tail2 = new Ellipse2D.Double(xCoord + 25, yCoord, w, h);
		g2.draw(tail2);
		g2.setColor(new Color(107,142,35));
		g2.fill(tail2);
		Ellipse2D.Double tail3 = new Ellipse2D.Double(xCoord + 50, yCoord, w, h);
		g2.draw(tail3);
		g2.setColor(new Color(107,142,35));
		g2.fill(tail3);
		Ellipse2D.Double tail4 = new Ellipse2D.Double(xCoord + 75, yCoord, w, h);
		g2.draw(tail4);
		g2.setColor(new Color(107,142,35));
		g2.fill(tail4);
		Ellipse2D.Double verticaltail = new Ellipse2D.Double(xCoord + 100, yCoord - 27, h, w);
		g2.draw(verticaltail);
		g2.setColor(new Color(107,142,35));
		g2.fill(verticaltail);
		Ellipse2D.Double head = new Ellipse2D.Double(xCoord + 104, yCoord - 30, w, h);
		g2.draw(head);
		g2.setColor(new Color(107,142,35));
		g2.fill(head);
		Ellipse2D.Double eye = new Ellipse2D.Double(xCoord + 128, yCoord - 26, 5, 5);
		g2.draw(eye);
		g2.setColor(new Color(220,20,60));
		g2.fill(eye);
		Ellipse2D.Double tongue = new Ellipse2D.Double(xCoord + 140, yCoord - 17, 10, 2);
		g2.draw(tongue);
		g2.setColor(new Color(220,20,60));
		g2.fill(tongue); 
		
	}
	
}
