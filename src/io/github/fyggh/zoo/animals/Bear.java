package io.github.fyggh.zoo.animals;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Bear {
	int xCoord, yCoord, w, h;
	
	public Bear (int x, int y, int width, int height) {
		xCoord = x;
		yCoord = y;
		w = width;
		h = height;
	}
	public void draw(Graphics2D g2) {
		Rectangle bruh = new Rectangle(xCoord, yCoord, w, h);
		g2.draw(bruh);
		
		Rectangle head = new Rectangle(150, 40, 80, 70);
		g2.setColor(new Color(210,105,30));
		g2.fill(head);
		
		Rectangle snout = new Rectangle(165, 65, 50, 40);
		g2.setColor(new Color(139,69,19));
		g2.fill(snout);
		
		Rectangle nose = new Rectangle(182, 80, 15, 15);
		g2.setColor(new Color(000000));
		g2.fill(nose);
		
		Rectangle eye1 = new Rectangle(164, 60, 7, 7);
		g2.setColor(new Color(255,255,255));
		g2.fill(eye1);
		
		Rectangle eye2 = new Rectangle(209, 60, 7, 7);
		g2.setColor(new Color(255,255,255));
		g2.fill(eye2);
		
		Rectangle body = new Rectangle(115, 110, 150, 200);
		g2.setColor(new Color(210,105,30));
		g2.fill(body);
		
		Rectangle LArm = new Rectangle(90, 110, 25, 150);
		g2.setColor(new Color(139,69,19));
		g2.fill(LArm);
		
		Rectangle RArm = new Rectangle(265, 110, 25, 150);
		g2.setColor(new Color(139,69,19));
		g2.fill(RArm);
		
		Rectangle LLeg = new Rectangle(115, 310, 68, 120);
		g2.setColor(new Color(139,69,19));
		g2.fill(LLeg);
		
		Rectangle RLeg = new Rectangle(197, 310, 68, 120);
		g2.setColor(new Color(139,69,19));
		g2.fill(RLeg);
		
		Rectangle Belly = new Rectangle(135, 140, 110, 140);
		g2.setColor(new Color(139,69,19));
		g2.fill(Belly);
	}
}