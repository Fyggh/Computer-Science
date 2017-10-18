package io.github.fyggh.zoo.animals;





	import java.awt.Color;
	import java.awt.Graphics2D;
import java.awt.Rectangle;
	import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
	import java.awt.geom.Line2D.Double;

	public class Parrot {
		int xCoord, yCoord, w, h;
		public Parrot(int x, int y, int width, int height) {
			xCoord = x;
			yCoord = y;
			w = width;
			h = height;
			
		}
		public void draw(Graphics2D g2) {
		g2.setColor(Color.RED);
		Ellipse2D.Double redBody = new Ellipse2D.Double (200, 100, 55, 100);
		g2.fill(redBody);
		g2.setColor(Color.YELLOW);
		Rectangle yellowBody = new Rectangle (200, 125, 55, 25);
		g2.fill(yellowBody);
		g2.setColor(Color.RED);
		Ellipse2D.Double redHead = new Ellipse2D.Double(190, 50, 60, 60);
		g2.fill(redHead);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double whiteFace = new Ellipse2D.Double(190, 65, 25, 40);
		g2.fill(whiteFace);
		g2.setColor(Color.BLACK);
		Ellipse2D.Double blackFace = new Ellipse2D.Double(189, 78, 20, 25);
		g2.fill(blackFace);
		g2.setColor(Color.BLACK);
		Ellipse2D.Double eye = new Ellipse2D.Double(200, 70, 5, 5);
		g2.fill(eye);
		g2.setColor(Color.blue);
		g2.fillPolygon(new int [] {200, 257, 230}, new int [] {150, 150, 225}, 3);
		g2.setColor(Color.white);
		g2.fillArc (188, 45, 20, 70, 180, 75);		
		g2.setColor(Color.red);
		g2.fillPolygon(new int [] {228, 240, 235}, new int [] {275, 275, 325}, 3);
		g2.setColor(Color.blue);
		g2.fillArc (200, 100, 55, 100, 180, 180);
		g2.setColor(Color.black);
		g2.drawArc (189, 43, 22, 72, 180, 75);
		
		
		
		
		}

		
		
	}

