package io.github.fyggh.zoo.animals;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Buffalo { 
 int xCoord, yCoord;

 public Buffalo(int x, int y) {
	xCoord= x;
 	yCoord= y;
 }
 

 public void draw(Graphics2D g2) {
	 //Body of the Buffalo
	 Rectangle body = new Rectangle(xCoord, yCoord, 270, 200);
	 Color lightBrown = new Color(114,76,0); // Color light brown
	 g2.setColor(lightBrown);
	 g2.draw(body);
	 g2.fill(body);
	 Ellipse2D.Double back = new Ellipse2D.Double(xCoord-100, yCoord, 200, 210);
	 g2.draw(back);
	 g2.fill(back);
	 Ellipse2D.Double frontal = new Ellipse2D.Double(xCoord+140, yCoord-3, 200, 210);
	 g2.draw(frontal);
	 g2.fill(frontal);
	 //Legs of the Buffalo
	 Ellipse2D.Double frontLeg1 = new Ellipse2D.Double(xCoord+210, yCoord+70, 70, 200);
	 g2.draw(frontLeg1);
	 g2.fill(frontLeg1);
	 Rectangle frontLeg3 = new Rectangle(xCoord+222, yCoord+210, 45, 110);
	 g2.draw(frontLeg3);
	 g2.fill(frontLeg3);
	 Ellipse2D.Double frontLeg2 = new Ellipse2D.Double(xCoord+155, yCoord+190, 50, 100);
	 g2.draw(frontLeg2);
	 g2.fill(frontLeg2);
	 Rectangle frontLeg4 = new Rectangle(xCoord+161, yCoord+200, 35, 110);
	 g2.draw(frontLeg4);
	 g2.fill(frontLeg4);
	 Ellipse2D.Double backLeg5 = new Ellipse2D.Double(xCoord-20, yCoord+70, 70, 200);
	 g2.draw(backLeg5);
	 g2.fill(backLeg5);
	 Rectangle backLeg1 = new Rectangle(xCoord-80, yCoord+140, 30, 200);
	 g2.draw(backLeg1);
	 g2.fill(backLeg1);
	 Ellipse2D.Double backLeg6 = new Ellipse2D.Double(xCoord-80, yCoord+70, 70, 200);
	 g2.draw(backLeg6);
	 g2.fill(backLeg6);
	 Rectangle backLeg2 = new Rectangle(xCoord-10, yCoord+210, 30, 100);
	 g2.draw(backLeg2);
	 g2.fill(backLeg2);
	 
	 //Head Area of the Buffalo
	 Ellipse2D.Double head = new Ellipse2D.Double(xCoord+280, yCoord+50, 110, 140);
	 Color darkBrown = new Color(85,57,0); // Color dark brown
	 g2.setColor(darkBrown);
	 g2.draw(head);
	 g2.fill(head);
	 Ellipse2D.Double chin = new Ellipse2D.Double(xCoord+350, yCoord +160, 25, 50);
	 g2.draw(chin);
	 g2.fill(chin);
	 Ellipse2D.Double nose = new Ellipse2D.Double(xCoord+340, yCoord +115, 55, 70);
	 g2.draw(nose);
	 g2.fill(nose);
	 Ellipse2D.Double aboveNose = new Ellipse2D.Double(xCoord+335, yCoord +59, 55, 65 );
	 g2.draw(aboveNose);
	 g2.fill(aboveNose);
	 Ellipse2D.Double horn1 = new Ellipse2D.Double(xCoord+290, yCoord+100, 40, 20);
	 g2.setColor(Color.WHITE);
	 g2.draw(horn1);
	 g2.fill(horn1);
	 Ellipse2D.Double horn2 = new Ellipse2D.Double(xCoord+287, yCoord+75, 15, 40);
	 g2.draw(horn2);
	 g2.fill(horn2);
	 Ellipse2D.Double eye = new Ellipse2D.Double(xCoord+330, yCoord+115, 25, 20);
	 g2.setColor(Color.DARK_GRAY);
	 g2.draw(eye);
	 g2.fill(eye);
	 Ellipse2D.Double eye2 = new Ellipse2D.Double(xCoord+339, yCoord+120, 10, 10);
	 g2.setColor(Color.WHITE);
	 g2.draw(eye2);
	 g2.fill(eye2);

 	}
}
