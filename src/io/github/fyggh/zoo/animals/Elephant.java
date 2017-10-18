package io.github.fyggh.zoo.animals;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Elephant {
	int xCoord, yCoord;
	public Elephant(int x, int y) {
		xCoord = x;
		yCoord = y;
	}
	
	public void draw(Graphics2D g2) {
		//body
		g2.setColor(Color.GRAY);
		Rectangle body = new Rectangle(xCoord+145, yCoord+60, 400, 230);
		g2.draw(body);
		g2.fill(body);
		//butt
		Ellipse2D.Double butt = new Ellipse2D.Double(xCoord+420, yCoord+55, 200, 270);
		g2.draw(butt);
		g2.fill(butt);
		//belly
		Ellipse2D.Double belly = new Ellipse2D.Double(xCoord+145, yCoord+225, 400, 100);
		g2.draw(belly);
		g2.fill(belly);
		//legs
		Rectangle frontLeg = new Rectangle(xCoord+145, yCoord+200, 75, 250);
		g2.draw(frontLeg);
		g2.fill(frontLeg);
		Rectangle backLeg = new Rectangle(xCoord+455, yCoord+200, 75, 250);
		g2.draw(backLeg);
		g2.fill(backLeg);
		//head
		Ellipse2D.Double head = new Ellipse2D.Double(xCoord, yCoord+25, 165, 200);
		g2.draw(head);
		g2.fill(head);
		//trunk
		Rectangle trunk = new Rectangle(xCoord+10, yCoord+155, 50, 220);
		g2.draw(trunk);
		g2.fill(trunk);
		//ear
		Ellipse2D.Double ear = new Ellipse2D.Double(xCoord+105, yCoord, 200, 220);
		g2.setColor(Color.BLACK);
		g2.draw(ear);
		g2.setColor(Color.GRAY);
		g2.fill(ear);
		//tail
		Rectangle tail = new Rectangle(xCoord+620, yCoord+195, 10, 215);
		g2.draw(tail);
		g2.fill(tail);
		g2.setColor(Color.BLACK);
		Rectangle tailHair = new Rectangle(xCoord+620, yCoord+400, 10, 20);
		g2.draw(tailHair);
		g2.fill(tailHair);
		//tusk
		g2.setColor(Color.WHITE);
		Rectangle Tusk = new Rectangle(xCoord+30, yCoord+205, 20, 80);
		g2.draw(Tusk);
		g2.fill(Tusk);
		//eye
		g2.setColor(Color.BLACK);
		Ellipse2D.Double eye = new Ellipse2D.Double(xCoord+45, yCoord+125, 20, 10);
		g2.fill(eye);
		g2.draw(eye);
}
}
