package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Monkeh {
	int xCoord, yCoord;

		public Monkeh(int x, int y) {
			xCoord = x; 
			yCoord = y;
		}
		public void draw(Graphics2D g2) {
			Ellipse2D.Double leftEar = new Ellipse2D.Double(130, 25, 60, 50);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(leftEar);
			
			Ellipse2D.Double innerLeftEar = new Ellipse2D.Double(145, 35, 40, 30);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(innerLeftEar);
			
			Ellipse2D.Double rightEar = new Ellipse2D.Double(230, 25, 60, 50);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(rightEar);
			
			Ellipse2D.Double innerRightEar = new Ellipse2D.Double(240, 35, 40, 30);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(innerRightEar);
			
			Ellipse2D.Double head = new Ellipse2D.Double(140, 30, 145, 135);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(head);
			
			Ellipse2D.Double head2 = new Ellipse2D.Double(125, 90, 190, 140);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(head2);
			
			Ellipse2D.Double innerHead1 = new Ellipse2D.Double(165, 50, 60, 60);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(innerHead1);
			
			Ellipse2D.Double innerHead2 = new Ellipse2D.Double(205, 50, 60, 60);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(innerHead2);
			
			Ellipse2D.Double innerHead3 = new Ellipse2D.Double(140, 100, 160, 110);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(innerHead3);
			
			Ellipse2D.Double body = new Ellipse2D.Double(160, 210, 120, 175);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(body);
			
			Ellipse2D.Double innerBody = new Ellipse2D.Double(180, 225, 80, 145);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(innerBody);
			
			Ellipse2D.Double rightEye = new Ellipse2D.Double(170, 60, 40, 40);
			g2.setColor(Color.WHITE);
			g2.fill(rightEye);
			
			Ellipse2D.Double leftEye = new Ellipse2D.Double(220, 60, 40, 40);
			g2.setColor(Color.WHITE);
			g2.fill(leftEye);
			
			Ellipse2D.Double innerLeftEye = new Ellipse2D.Double(180, 75, 25, 25);
			g2.setColor(Color.BLACK);
			g2.fill(innerLeftEye);
			
			Ellipse2D.Double innerRightEye = new Ellipse2D.Double(230, 75, 25, 25);
			g2.setColor(Color.BLACK);
			g2.fill(innerRightEye);
			
			Ellipse2D.Double nostril1 = new Ellipse2D.Double(200, 105, 15, 15);
			g2.setColor(Color.BLACK);
			g2.fill(nostril1);
			
			Ellipse2D.Double nostril2 = new Ellipse2D.Double(225, 105, 15, 15);
			g2.setColor(Color.BLACK);
			g2.fill(nostril2);
			
			Arc2D.Double Mouf = new Arc2D.Double(180, 110, 85, 85, 180, 180, Arc2D.CHORD);
			g2.setColor(Color.BLACK);
			g2.fill(Mouf);
			
			Arc2D.Double tongue = new Arc2D.Double(190, 130, 65, 65, 180, 180, Arc2D.CHORD);
			g2.setColor(new Color(255, 153, 153));
			g2.fill(tongue);
			
			Arc2D.Double leftArm = new Arc2D.Double(115, 225, 85, 130, 40, 210, Arc2D.CHORD);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(leftArm);
			
			Ellipse2D.Double leftHand = new Ellipse2D.Double(105, 305, 50, 50);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(leftHand);
			
			Arc2D.Double rightArm = new Arc2D.Double(235, 230, 85, 130, 300, 180, Arc2D.CHORD);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(rightArm);
			
			Ellipse2D.Double rightHand = new Ellipse2D.Double(280, 305, 50, 50);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(rightHand);
			
			Ellipse2D.Double leftLeg = new Ellipse2D.Double(165, 360, 40, 120);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(leftLeg);
			
			Ellipse2D.Double leftFoot = new Ellipse2D.Double(160, 435, 50, 50);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(leftFoot);
			
			Ellipse2D.Double rightLeg = new Ellipse2D.Double(225, 360, 40, 120);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(rightLeg);
			
			Ellipse2D.Double rightFoot = new Ellipse2D.Double(225, 435, 50, 50);
			g2.setColor(new Color(255, 179, 102));
			g2.fill(rightFoot);
	}

}
