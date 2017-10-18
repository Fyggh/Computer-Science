package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;

public class Pig {
	int xCoord,  yCoord, w, h;


	public Pig(int x, int y, int width, int height) {
		xCoord = x;
		yCoord = y;
		w = width;
		h = height;
		
}	
	public void draw(Graphics2D g2) {

		Rectangle base = new Rectangle(120,200,10,65);
		g2.draw(base);
		g2.setColor(new Color(255, 153, 190));
		g2.fill(base);
		
		Rectangle base2 = new Rectangle(200,200,10,65);
		g2.draw(base2);
		g2.setColor(new Color(255, 153, 190));
		g2.fill(base2);
		
		Rectangle leftfoot = new Rectangle(108,253,25,10);
		g2.draw(leftfoot);
		g2.setColor(new Color(0,0,0));
		g2.fill(leftfoot);
		
		Rectangle rightfoot = new Rectangle(185,253,25,10);
		g2.draw(rightfoot);
		g2.setColor(new Color(0,0,0));
		g2.fill(rightfoot);
		
		g2.setColor(new Color(247, 52, 34));
		g2.fillArc(105,68,135,300, 0, 180);
		
		
		
		Ellipse2D.Double lear = new Ellipse2D.Double(130, 2, 20, 50);
		g2.draw(lear);
		g2.setColor(new Color(255, 153, 190));
		g2.fill(lear);
		
		Ellipse2D.Double rear = new Ellipse2D.Double(170, 2, 20, 55);
		g2.draw(rear);
		g2.setColor(new Color(255, 153, 190));
		g2.fill(rear);
		
		Ellipse2D.Double main = new Ellipse2D.Double(95, 40, 125, 130);
		g2.draw(main);
		g2.setColor(new Color (255, 153, 190));
		g2.fill(main);
		
		Ellipse2D.Double head = new Ellipse2D.Double(70,30,135,80);
		g2.draw(head);
		g2.setColor(new Color(255, 153, 190));
		g2.fill(head); 
	
		Ellipse2D.Double lshade = new Ellipse2D.Double(120,40,20,20);
		g2.draw(lshade);
		g2.setColor(new Color(232, 118, 145));
		g2.fill(lshade); 

		Ellipse2D.Double rshade = new Ellipse2D.Double(155,40,20,20);
		g2.draw(rshade);
		g2.setColor(new Color(232, 118, 145));
		g2.fill(rshade); 
		
		Ellipse2D.Double lwhite = new Ellipse2D.Double(123,43,13,13);
		g2.draw(lwhite);
		g2.setColor(new Color(255, 255, 255));
		g2.fill(lwhite); 

		Ellipse2D.Double rwhite = new Ellipse2D.Double(158,43,13,13);
		g2.draw(rwhite);
		g2.setColor(new Color(255, 255, 255));
		g2.fill(rwhite); 

		Ellipse2D.Double rpupil = new Ellipse2D.Double(159,45,7,7);
		g2.draw(rpupil);
		g2.setColor(new Color(0, 0, 0));
		g2.fill(rpupil);
		
		Ellipse2D.Double lpupil = new Ellipse2D.Double(125,46,6,6);
		g2.draw(lpupil);
		g2.setColor(new Color(0,0,0));
		g2.fill(lpupil); 

		Ellipse2D.Double nose = new Ellipse2D.Double(80, 60, 5, 15);
		g2.draw(nose);
		g2.setColor(new Color(0,0,0));
		g2.fill(nose);
		
		Ellipse2D.Double nose2 = new Ellipse2D.Double(90, 60, 5, 15);
		g2.draw(nose2);
		g2.setColor(new Color(0,0,0));
		g2.fill(nose2);
		
		
		
		
		g2.setColor(new Color(0,0,0));
		g2.fillArc(115,80,52,52, 180, 180); 
		
		
		
	 }
	

}