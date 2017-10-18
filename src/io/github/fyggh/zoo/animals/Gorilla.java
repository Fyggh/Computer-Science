package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Gorilla {
	int xCoord, yCoord, w, h;
	
	public Gorilla() {
		
	}
	
	public Gorilla(int x, int y) {
		xCoord = x;
		yCoord = y;
		
	}
	
	public void draw(Graphics2D g2) {
		
		Rectangle backdrop = new Rectangle(0, 0, 1000, 1000);
		g2.setColor(Color.white);
	

		Ellipse2D.Double body = new Ellipse2D.Double(xCoord+50, yCoord+75, 75, 125);
		g2.setColor(Color.black);
		
		g2.fill(body);	
		
		
		
		
		Ellipse2D.Double headTwo = new Ellipse2D.Double(xCoord+68, yCoord+15, 45, 70);
		g2.setColor(Color.black);
		g2.fill(headTwo);
		g2.draw(headTwo);
	
		
		
		
		
		
		
		
		Ellipse2D.Double head = new Ellipse2D.Double(xCoord+65, yCoord+35, 50, 80);
		g2.setColor(Color.black);
		g2.fill(head);
		g2.draw(head);
		
		Ellipse2D.Double lArm = new Ellipse2D.Double(xCoord+25, yCoord+85, 55, 25);
		g2.setColor(Color.black); 
		g2.fill(lArm);
		g2.draw(lArm);
		
		Ellipse2D.Double rArm = new Ellipse2D.Double(xCoord+95, yCoord+85, 55, 25);
		g2.setColor(Color.black);
		g2.fill(rArm);
		g2.draw(rArm);
		
		Ellipse2D.Double rforArm = new Ellipse2D.Double(xCoord+135, yCoord+95, 20, 40);
		g2.setColor(Color.black);
		g2.fill(rforArm);
		g2.draw(rforArm);
		
		Ellipse2D.Double lforArm = new Ellipse2D.Double(xCoord+25, yCoord+90, 20, 40);
		g2.fill(lforArm);
		
		Ellipse2D.Double rHam = new Ellipse2D.Double(xCoord+95, yCoord+175, 60, 30);
		g2.setColor(Color.black);
		g2.fill(rHam);
		g2.draw(rHam);
		
		Ellipse2D.Double lHam = new Ellipse2D.Double(xCoord+25, yCoord+175, 60, 30);
		g2.setColor(Color.black); 
		g2.fill(lHam);
		g2.draw(lHam);
		

		Ellipse2D.Double lCalf = new Ellipse2D.Double(xCoord+25, yCoord+185, 25, 55);
		g2.fill(lCalf);

		Ellipse2D.Double rCalf = new Ellipse2D.Double(xCoord+130, yCoord+185, 25, 55);
		g2.fill(rCalf);


		Ellipse2D.Double lFoot = new Ellipse2D.Double(xCoord+15, yCoord+225, 35, 15);
		g2.setColor(Color.black); 
		g2.fill(lFoot);
		g2.draw(lFoot);
	
		Ellipse2D.Double rFoot = new Ellipse2D.Double(xCoord+130, yCoord+225, 35, 15);
		g2.setColor(Color.black);
		g2.fill(rFoot);
		g2.draw(rFoot);
		

		Ellipse2D.Double bodyTwo = new Ellipse2D.Double(xCoord+60, yCoord+85, 55, 95);
		g2.setColor(Color.darkGray);
		
		g2.fill(bodyTwo);	
		
		Ellipse2D.Double rHamTwo = new Ellipse2D.Double(xCoord+105, yCoord+180, 40, 20);
		g2.setColor(Color.darkGray);
		g2.fill(rHamTwo);
		g2.draw(rHamTwo);
		
		Ellipse2D.Double lHamTwo = new Ellipse2D.Double(xCoord+35, yCoord+180, 40, 20);
		g2.setColor(Color.darkGray);
		g2.fill(lHamTwo);
		g2.draw(lHamTwo);
		

		Ellipse2D.Double rArmTwo = new Ellipse2D.Double(xCoord+115, yCoord+87, 25, 20);
		g2.setColor(Color.darkGray);
		g2.fill(rArmTwo);
		g2.draw(rArmTwo);
	

		Ellipse2D.Double lArmTwo = new Ellipse2D.Double(xCoord+35, yCoord+87, 25, 20);
		g2.setColor(Color.darkGray);
		g2.fill(lArmTwo);
		g2.draw(lArmTwo);
		
		Ellipse2D.Double lEye = new Ellipse2D.Double(xCoord+83, yCoord+59, 3, 3);
		g2.setColor(Color.white);
		g2.fill(lEye);
		g2.draw(lEye);
		

		Ellipse2D.Double rEye = new Ellipse2D.Double(xCoord+90, yCoord+59, 3, 3);
		g2.setColor(Color.white);
		g2.fill(rEye);
		g2.draw(rEye);
		
		
		Ellipse2D.Double mouth = new Ellipse2D.Double(xCoord+80, yCoord+70, 20, 10);
		g2.setColor(Color.pink);
		g2.fill(mouth);
		g2.draw(mouth);
		
		Ellipse2D.Double banna = new Ellipse2D.Double(xCoord+125, yCoord+125, 55, 35);
		g2.setColor(Color.yellow);
		g2.fill(banna);
		g2.draw(banna);
		
		Ellipse2D.Double lEyeTwo = new Ellipse2D.Double(xCoord+75, yCoord+45, 9, 9);
		g2.setColor(Color.white);
		g2.fill(lEyeTwo);
		g2.draw(lEyeTwo);
		
		Ellipse2D.Double rEyeTwo = new Ellipse2D.Double(xCoord+95, yCoord+45, 9, 9);
		g2.setColor(Color.white);
		g2.fill(rEyeTwo);
		g2.draw(rEyeTwo);
		

		Ellipse2D.Double bannaTwo = new Ellipse2D.Double(xCoord+125, yCoord+135, 50, 30);
		g2.setColor(new Color(239,239,239));
		g2.fill(bannaTwo);
		g2.draw(bannaTwo);
		
		Ellipse2D.Double lPupil = new Ellipse2D.Double(xCoord+75, yCoord+45, 5, 5);
		g2.setColor(Color.red);
		g2.fill(lPupil);
		g2.draw(lPupil);
		
		
		Ellipse2D.Double rPupil = new Ellipse2D.Double(xCoord+95, yCoord+45, 5, 5);
		g2.setColor(Color.red);
		g2.fill(rPupil);
		g2.draw(rPupil);
		
	
	}
	
}