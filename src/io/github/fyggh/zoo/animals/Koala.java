package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Koala {
int x, y, w, h;

public Koala(int xCoord, int yCoord) {
	x = xCoord;
	y = yCoord; }

	


public void draw(Graphics2D g2){
	Ellipse2D.Double head = new Ellipse2D.Double(x + 35,y + 5,40,20);
	g2.setColor(Color.GRAY);
	g2.fill(head);
	Ellipse2D.Double leftEar = new Ellipse2D.Double(x + 30, y + 4, 12, 10);
	g2.setColor(Color.DARK_GRAY);
	g2.fill(leftEar);
	Ellipse2D.Double rightEar = new Ellipse2D.Double(x + 67, y + 4, 12, 10);
	g2.setColor(Color.DARK_GRAY);
	g2.fill(rightEar);
	Ellipse2D.Double leftEye = new Ellipse2D.Double(x + 45, y + 9, 7, 6);
	g2.setColor(Color.black);
	g2.fill(leftEye);
	Ellipse2D.Double rightEye = new Ellipse2D.Double(x + 57, y + 9, 7, 6);
	g2.setColor(Color.black);
	g2.fill(rightEye);
	Ellipse2D.Double nose = new Ellipse2D.Double(x + 50, y + 15, 9, 4);
	g2.setColor(Color.black);
	g2.fill(nose);
	Ellipse2D.Double body = new Ellipse2D.Double(x + 40, y + 20, 30, 40);
	g2.setColor(Color.GRAY);
	g2.fill(body);
	Ellipse2D.Double stomach = new Ellipse2D.Double(x + 45, y + 26, 20, 27);
	g2.setColor(Color.white);
	g2.fill(stomach);
	Ellipse2D.Double leftHand = new Ellipse2D.Double(x + 33, y + 27 , 12, 9);
	g2.setColor(Color.black);
	g2.fill(leftHand);
	Ellipse2D.Double rightHand = new Ellipse2D.Double(x + 65, y + 27 , 12, 9);
	g2.setColor(Color.black);
	g2.fill(rightHand);
	Ellipse2D.Double leftLeg = new Ellipse2D.Double(x + 40, y + 55 , 13, 7);
	g2.setColor(Color.black);
	g2.fill(leftLeg);
	Ellipse2D.Double rightLeg = new Ellipse2D.Double(x + 57, y + 55 , 13, 7);
	g2.setColor(Color.black);
	g2.fill(rightLeg);
	
}
}
