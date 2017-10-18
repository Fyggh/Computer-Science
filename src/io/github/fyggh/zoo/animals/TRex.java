package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


public class TRex {
	int xCoord, yCoord;
		public TRex(int x, int y) {
		xCoord = x;
		yCoord = y;
}
	
	public void draw(Graphics2D g2) {
			g2.setColor(Color.GREEN);
			
			//legs
			Ellipse2D.Double topLeg = new Ellipse2D.Double(xCoord+300, yCoord+345, 50, 200);
			g2.fill(topLeg);
			Ellipse2D.Double secondLeg = new Ellipse2D.Double(xCoord+325, yCoord+500, 35, 130);
			g2.fill(secondLeg);
			Rectangle2D.Double rightFoot = new Rectangle2D.Double(xCoord+340, yCoord+610, 50, 20);
			g2.fill(rightFoot);
			Ellipse2D.Double leftLeg = new Ellipse2D.Double(xCoord+315, yCoord+500, 35, 130);
			g2.fill(leftLeg);
			Rectangle2D.Double leftFoot = new Rectangle2D.Double(xCoord+330, yCoord+610, 50, 20);
			g2.fill(leftFoot);
			
			//upperbody
			Ellipse2D.Double body = new Ellipse2D.Double(xCoord+200, yCoord+150, 200 , 400);
			g2.fill(body);
			Rectangle2D.Double neck = new Rectangle2D.Double(xCoord+275, yCoord+100, 50, 100);
			g2.fill(neck);
			Rectangle2D.Double head = new Rectangle2D.Double(xCoord+275, yCoord+50, 124, 75);
			g2.fill(head);
			
			//tail
			Ellipse2D.Double tail1 = new Ellipse2D.Double(xCoord+240, yCoord+505, 65, 45);
			g2.fill(tail1);
			Ellipse2D.Double tail2 = new Ellipse2D.Double(xCoord+200, yCoord+500, 75, 50);
			g2.fill(tail2);
			Ellipse2D.Double tail3 = new Ellipse2D.Double(xCoord+180, yCoord+475, 75, 46);
			g2.fill(tail3);
			Ellipse2D.Double tail4 = new Ellipse2D.Double(xCoord+180, yCoord+497, 75, 50);
			g2.fill(tail4);
			Ellipse2D.Double tail5 = new Ellipse2D.Double(xCoord+160, yCoord+497, 65, 47);
			g2.fill(tail5);
			Ellipse2D.Double tail6 = new Ellipse2D.Double(xCoord+166, yCoord+475, 70, 45);
			g2.fill(tail6);
			Ellipse2D.Double tail7 = new Ellipse2D.Double(xCoord+157, yCoord+475, 65, 40);
			g2.fill(tail7);
			Ellipse2D.Double tail8 = new Ellipse2D.Double(xCoord+150, yCoord+475, 60, 35);
			g2.fill(tail8);
			Ellipse2D.Double tail9 = new Ellipse2D.Double(xCoord+145, yCoord+500, 60, 40);
			g2.fill(tail9);
			Ellipse2D.Double tail10 = new Ellipse2D.Double(xCoord+140, yCoord+475, 60, 40);
			g2.fill(tail10);
			Ellipse2D.Double tail11 = new Ellipse2D.Double(xCoord+130, yCoord+475, 55, 35);
			g2.fill(tail11);
			Ellipse2D.Double tail12 = new Ellipse2D.Double(xCoord+125, yCoord+496, 60, 40);
			g2.fill(tail12);
			Ellipse2D.Double tail13 = new Ellipse2D.Double(xCoord+120, yCoord+475, 50, 30);
			g2.fill(tail13);
			Ellipse2D.Double tail14 = new Ellipse2D.Double(xCoord+115, yCoord+495, 60, 40);
			g2.fill(tail14);
			Ellipse2D.Double tail15 = new Ellipse2D.Double(xCoord+110, yCoord+475, 45, 25);
			g2.fill(tail15);
			Ellipse2D.Double tail16 = new Ellipse2D.Double(xCoord+105, yCoord+493, 60, 40);
			g2.fill(tail16);
			Ellipse2D.Double tail17 = new Ellipse2D.Double(xCoord+100, yCoord+475, 40, 20);
			g2.fill(tail17);
			Ellipse2D.Double tail18 = new Ellipse2D.Double(xCoord+95, yCoord+490, 60, 40);
			g2.fill(tail18);
			Ellipse2D.Double tail19 = new Ellipse2D.Double(xCoord+90, yCoord+475, 35, 15);
			g2.fill(tail19);
			Ellipse2D.Double tail20 = new Ellipse2D.Double(xCoord+85, yCoord+480, 70, 50);
			g2.fill(tail20);
			Ellipse2D.Double tail21 = new Ellipse2D.Double(xCoord+65, yCoord+480, 65, 45);
			g2.fill(tail21);
			Ellipse2D.Double endTail = new Ellipse2D.Double(xCoord+18, yCoord+477, 200, 50);
			g2.fill(endTail);
			
			//arm
			Rectangle2D.Double arm = new Rectangle2D.Double(xCoord+380, yCoord+230, 30, 10);
			g2.fill(arm);
			Rectangle2D.Double finger = new Rectangle2D.Double(xCoord+407, yCoord+240, 3, 6);
			g2.fill(finger);
			
			//nose
			g2.setColor(Color.BLACK);
			Ellipse2D.Double nose = new Ellipse2D.Double(xCoord+384, yCoord+60, 15, 10);
			g2.fill(nose);
			
			//eyes
			Ellipse2D.Double eyes = new Ellipse2D.Double(xCoord+320, yCoord+55, 30, 20);
			g2.draw(eyes);

			g2.setColor(Color.BLUE);
			Ellipse2D.Double pupil = new Ellipse2D.Double(xCoord+335, yCoord+57, 15, 15);
			g2.fill(pupil);
			
			//teeth
			g2.setColor (new Color (255,215,0));
			Rectangle2D.Double teeth = new Rectangle2D.Double(xCoord+337, yCoord+85, 62, 25);
			g2.fill(teeth);
			
			
			g2.setColor(Color.BLACK);
			Line2D.Double crevaceOfTeeth = new Line2D.Double(xCoord+345, yCoord+85, xCoord+345, yCoord+109);
			g2.draw(crevaceOfTeeth);
			Line2D.Double crevace2 = new Line2D.Double(xCoord+354, yCoord+85, xCoord+354, yCoord+109);
			g2.draw(crevace2);
			Line2D.Double crevace3 = new Line2D.Double(xCoord+363, yCoord+85, xCoord+363, yCoord+109);
			g2.draw(crevace3);
			Line2D.Double crevace4 = new Line2D.Double(xCoord+372, yCoord+85, xCoord+372, yCoord+109);
			g2.draw(crevace4);
			Line2D.Double crevace5 = new Line2D.Double(xCoord+381, yCoord+85, xCoord+381, yCoord+109);
			g2.draw(crevace5);
			Line2D.Double crevace6 = new Line2D.Double(xCoord+390, yCoord+85, xCoord+390, yCoord+109);
			g2.draw(crevace6);
			Line2D.Double crevace7 = new Line2D.Double(xCoord+398, yCoord+85, xCoord+398, yCoord+109);
			g2.draw(crevace7);
			Line2D.Double middleOfTeeth = new Line2D.Double(xCoord+337, yCoord+97, xCoord+398, yCoord+97);
			g2.draw(middleOfTeeth);

			
	}
}
