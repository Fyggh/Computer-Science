package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Penguin {
	int xCoord;
	int yCoord;
	String name;

public Penguin(int x, int y, String penguinName) {
	
		xCoord = 0;
		yCoord = 0;
		name = penguinName;
}

public void draw(Graphics2D g2) {
	Ellipse2D.Double head = new Ellipse2D.Double(xCoord+125, yCoord+10, 125, 125);
	g2.setColor(Color.black);
	g2.fill(head);
	Ellipse2D.Double head2 = new Ellipse2D.Double(xCoord+140, yCoord+25, 100, 100);
	g2.setColor(Color.white);
	g2.fill(head2);
	Ellipse2D.Double body = new Ellipse2D.Double(xCoord+90, yCoord+135, 200, 250);
	g2.setColor(Color.black);
	g2.fill(body);
	Ellipse2D.Double arm = new Ellipse2D.Double(xCoord+20,  yCoord+225, 100,  20);
	g2.setColor(Color.black);
	g2.fill(arm);
	Ellipse2D.Double arm2 = new Ellipse2D.Double(xCoord+250,  yCoord+225, 100,  20);
	g2.setColor(Color.black);
	g2.fill(arm2);
	Ellipse2D.Double body2 = new Ellipse2D.Double(xCoord+120, yCoord+150,  140, 215);
	g2.setColor(Color.white);
	g2.fill(body2);
	Ellipse2D.Double leg = new Ellipse2D.Double(xCoord+130, yCoord+350,  40, 100);
	g2.setColor(Color.black);
	g2.fill(leg);
	Ellipse2D.Double leg2 = new Ellipse2D.Double(xCoord+210, yCoord+350,  40, 100);
	g2.setColor(Color.black);
	g2.fill(leg2);
	Ellipse2D.Double foot = new Ellipse2D.Double(xCoord+215, yCoord+415,  60, 40);
	g2.setColor(Color.black);
	g2.fill(foot);
	Ellipse2D.Double foot2 = new Ellipse2D.Double(xCoord+105, yCoord+415,  60, 40);
	g2.setColor(Color.black);
	g2.fill(foot2);
	Ellipse2D.Double eye = new Ellipse2D.Double(xCoord+160, yCoord+50,  20, 20);
	g2.setColor(Color.black);
	g2.fill(eye);
	Ellipse2D.Double eye2 = new Ellipse2D.Double(xCoord+200, yCoord+50,  20, 20);
	g2.setColor(Color.black);
	g2.fill(eye2);
	Ellipse2D.Double beak = new Ellipse2D.Double(xCoord+175, yCoord+90,  60, 10);
	g2.setColor(Color.yellow);
	g2.fill(beak);
	Ellipse2D.Double beak2 = new Ellipse2D.Double(xCoord+175, yCoord+95,  30, 10);
	g2.setColor(Color.orange);
	g2.fill(beak2);
	
	}

}
