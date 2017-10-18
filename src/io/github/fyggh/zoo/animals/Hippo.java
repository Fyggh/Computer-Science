package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Hippo {
	int xCoord, yCoord;
	
	public Hippo(int x, int y) {
		xCoord = x;
		yCoord = y;
		
	}
	
	public Hippo() {

}
	
	public void draw(Graphics2D g2) {
		Ellipse2D.Double face = new Ellipse2D.Double(xCoord + 80, yCoord + 100, 150, 150);
		g2.draw(face);
		Ellipse2D.Double body = new Ellipse2D.Double(xCoord + 175, yCoord + 100, 350, 250);
		g2.draw(body);
		Ellipse2D.Double mouth = new Ellipse2D.Double(xCoord + 80, yCoord + 170, 100, 100);
		g2.draw(mouth);
		Ellipse2D.Double leftear = new Ellipse2D.Double(xCoord + 116, yCoord + 90, 10, 20);
		g2.draw(leftear);
		Ellipse2D.Double rightear = new Ellipse2D.Double(xCoord + 180, yCoord + 90, 10, 20);
		g2.draw(rightear);
		Ellipse2D.Double righteye = new Ellipse2D.Double(xCoord + 105, yCoord + 160, 17, 17);
		g2.draw(righteye);
		Ellipse2D.Double lefteye = new Ellipse2D.Double(xCoord + 150, yCoord + 162, 17, 17);
		g2.draw(lefteye);
		Ellipse2D.Double rightsparkle = new Ellipse2D.Double(xCoord + 113, yCoord + 162, 5, 5);
		g2.draw(rightsparkle);
		Ellipse2D.Double leftsparkle = new Ellipse2D.Double(xCoord + 158, yCoord + 164, 5, 5);
		g2.draw(leftsparkle);
		Ellipse2D.Double leftnostril = new Ellipse2D.Double(xCoord + 100, yCoord + 225, 7, 5);
		g2.draw(leftnostril);
		Ellipse2D.Double rightnostril = new Ellipse2D.Double(xCoord + 150, yCoord + 225, 7, 5);
		g2.draw(rightnostril);
		Ellipse2D.Double tail = new Ellipse2D.Double(xCoord + 510, yCoord + 200, 30, 10);
		g2.draw(tail);
		Ellipse2D.Double rightfrontfoot = new Ellipse2D.Double(xCoord + 175, yCoord + 380, 60, 30);
		g2.draw(rightfrontfoot);
		Ellipse2D.Double leftfrontfoot = new Ellipse2D.Double(xCoord + 230, yCoord + 390, 60, 30);
		g2.draw(leftfrontfoot);
		Ellipse2D.Double rightbackfoot = new Ellipse2D.Double(xCoord + 455, yCoord + 370, 60, 30);
		g2.draw(rightbackfoot);
		Ellipse2D.Double leftbackfoot = new Ellipse2D.Double(xCoord + 400, yCoord + 380, 60, 30);
		g2.draw(leftbackfoot);
		Rectangle2D.Double lefttooth = new Rectangle2D.Double(xCoord + 90, yCoord + 250, 10, 15);
		g2.draw(lefttooth);
		Rectangle2D.Double righttooth = new Rectangle2D.Double(xCoord + 152, yCoord + 250, 10, 15);
		g2.draw(righttooth);
		Rectangle2D.Double rightfrontleg = new Rectangle2D.Double(xCoord + 195, yCoord + 285, 40, 110);
		g2.draw(rightfrontleg);
		Rectangle2D.Double leftfrontleg = new Rectangle2D.Double(xCoord + 250, yCoord + 295, 40, 110);
		g2.draw(leftfrontleg);
		Rectangle2D.Double rightbackleg = new Rectangle2D.Double(xCoord + 475, yCoord + 270, 40, 110);
		g2.draw(rightbackleg);
		Rectangle2D.Double leftbackleg = new Rectangle2D.Double(xCoord + 420, yCoord + 280, 40, 110);
		g2.draw(leftbackleg);
		
		g2.setColor(new Color(105, 105, 105));
		g2.fill(face);
		g2.fill(body);
		g2.fill(mouth);
		g2.fill(leftear);
		g2.fill(rightear);
		g2.fill(tail);
		g2.fill(rightfrontleg);
		g2.fill(leftfrontleg);
		g2.fill(rightfrontfoot);
		g2.fill(leftfrontfoot);
		g2.fill(rightbackleg);
		g2.fill(leftbackleg);
		g2.fill(rightbackfoot);
		g2.fill(leftbackfoot);
		g2.setColor(new Color(0, 0, 0));
		g2.fill(righteye);
		g2.fill(lefteye);
		g2.fill(leftnostril);
		g2.fill(rightnostril);
		g2.setColor(new Color(250, 250, 250));
		g2.fill(rightsparkle);
		g2.fill(leftsparkle);
		g2.fill(lefttooth);
		g2.fill(righttooth);
		
		
	}
		
	}
