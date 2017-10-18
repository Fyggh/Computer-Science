package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Cow {
	int xCoord, yCoord;
	
	public Cow(int x, int y) {
		xCoord = x;
		yCoord = y;
		
	}
	
	public void draw(Graphics2D g2) {
		//HEAD/FACE
		Ellipse2D.Double chin = new Ellipse2D.Double(xCoord+5,yCoord+40, 70, 50);
		g2.setColor(Color.DARK_GRAY);
		g2.fill(chin);
		
		Rectangle body = new Rectangle(xCoord + 60,yCoord + 25,150,100);
		g2.setColor(new Color(139,69,19));
		g2.fill(body);
		
		Rectangle mouth = new Rectangle(xCoord + 5, yCoord +55, 45,25);
		g2.setColor(Color.black);
		g2.fill(mouth);
		
		//HEAD
		g2.drawPolygon(new int[] {xCoord+60,xCoord+5,xCoord+5,xCoord+60}, new int[] {yCoord +5,yCoord +15,yCoord +80,yCoord +80},4);
		g2.setColor(new Color(139,69,19));
		g2.fillPolygon(new int[] {xCoord+60,xCoord+5,xCoord+5,xCoord+60}, new int[] {yCoord +5,yCoord +15,yCoord +80,yCoord +80},4);
		
		//FACE SPOT
		Ellipse2D.Double Facespot1 = new Ellipse2D.Double(xCoord+30, yCoord+5, 30, 45);
		g2.setColor(Color.white);
		g2.fill(Facespot1);
		
		Ellipse2D.Double Facespot2 = new Ellipse2D.Double(xCoord+20, yCoord+9, 20, 25);
		g2.setColor(Color.white);
		g2.fill(Facespot2);
		
		//MOUTH/FACE
		g2.drawPolygon(new int[] {xCoord+50,xCoord+5,xCoord+5,xCoord+18,xCoord+18,xCoord+37,xCoord+37,xCoord+50,xCoord+50},
					new int [] {yCoord+55,yCoord+55,yCoord+80,yCoord+80,yCoord+70,yCoord+70,yCoord+80,yCoord+80,yCoord+55}, 9);
		g2.setColor(new Color(211,211,211));
		g2.fillPolygon(new int[] {xCoord+50,xCoord+5,xCoord+5,xCoord+18,xCoord+18,xCoord+37,xCoord+37,xCoord+50,xCoord+50},
					new int [] {yCoord+55,yCoord+55,yCoord+80,yCoord+80,yCoord+70,yCoord+70,yCoord+80,yCoord+80,yCoord+55}, 9);
		
		Rectangle blackholeinmouth = new Rectangle(xCoord+18,yCoord+70,19,10);
		g2.setColor(Color.black);
		g2.fill(blackholeinmouth);
		
		Rectangle tongue = new Rectangle (xCoord+24,yCoord+72,8,12);
		g2.setColor(Color.pink);
		g2.fill(tongue);
		
		Ellipse2D.Double Reye = new Ellipse2D.Double(xCoord+10, yCoord+30, 12, 9);
		g2.setColor(Color.white);
		g2.fill(Reye);
		
		Ellipse2D.Double Leye = new Ellipse2D.Double(xCoord+35, yCoord+30, 12, 9);
		g2.setColor(new Color(245,245,255));
		g2.fill(Leye);
		
		Ellipse2D.Double Lpupil = new Ellipse2D.Double(xCoord+12, yCoord+32, 8, 5);
		g2.setColor(Color.black);
		g2.fill(Lpupil);
		
		
		Ellipse2D.Double Rpupil = new Ellipse2D.Double(xCoord+37, yCoord+32, 8, 5);
		g2.setColor(Color.black);
		g2.fill(Rpupil);
		
		Ellipse2D.Double ear = new Ellipse2D.Double(xCoord+50, yCoord+30, 8, 15);
		g2.setColor(Color.black);
		g2.fill(ear);
		
		//LEGS
		Rectangle LFrontLeg = new Rectangle (xCoord+63,yCoord+125,25,75);
		g2.setColor(new Color(139,69,19));
		g2.fill(LFrontLeg);
		g2.setColor(Color.black);
		g2.draw(LFrontLeg);
		
		Rectangle RFrontLeg = new Rectangle (xCoord+90,yCoord+125,25,75);
		g2.setColor(Color.white);
		g2.fill(RFrontLeg);
		g2.setColor(Color.black);
		g2.draw(RFrontLeg);
		
		Rectangle RBackLeg = new Rectangle (xCoord+180,yCoord+125,25,75);
		g2.setColor(Color.white);
		g2.fill(RBackLeg);
		g2.setColor(Color.black);
		g2.draw(RBackLeg);
		
		Rectangle LBackLeg = new Rectangle (xCoord+150,yCoord+125,25,75);
		g2.setColor(Color.white);
		g2.fill(LBackLeg);
		g2.setColor(Color.black);
		g2.draw(LBackLeg);
		
		Ellipse2D.Double FLtoes = new Ellipse2D.Double(xCoord+63,yCoord+195,25,5);
		g2.setColor(Color.black);
		g2.fill(FLtoes);
		
		Ellipse2D.Double FRtoes = new Ellipse2D.Double(xCoord+90,yCoord+195,25,5);
		g2.setColor(Color.black);
		g2.fill(FRtoes);
		
		Ellipse2D.Double BRtoes = new Ellipse2D.Double(xCoord+180,yCoord+195,25,5);
		g2.setColor(Color.black);
		g2.fill(BRtoes);
		
		Ellipse2D.Double BLtoes = new Ellipse2D.Double(xCoord+150,yCoord+195,25,5);
		g2.setColor(Color.black);
		g2.fill(BLtoes);
		
		
		//FACE
		Ellipse2D.Double nose = new Ellipse2D.Double(xCoord+18, yCoord+41, 20, 15);
		g2.setColor(Color.black);
		g2.fill(nose);
		
		Ellipse2D.Double rnostril = new Ellipse2D.Double(xCoord+20, yCoord+45, 5,5);
		g2.setColor(Color.DARK_GRAY);
		g2.fill(rnostril);
		
		Ellipse2D.Double lnostril = new Ellipse2D.Double(xCoord+28, yCoord+45, 5,5);
		g2.setColor(Color.DARK_GRAY);
		g2.fill(lnostril);
		
		//TAIL
		g2.setColor(new Color(139,69,19));
		g2.fillArc(xCoord+210,yCoord+25,10,135,100,180);
		
		
		//STAIN 1
		Ellipse2D.Double spot1A = new Ellipse2D.Double(xCoord+75,yCoord+25,40,55);
		g2.setColor(Color.white);
		g2.fill(spot1A);
		
		Ellipse2D.Double spot1B = new Ellipse2D.Double(xCoord+70,yCoord+45,30,30);
		g2.setColor(Color.white);
		g2.fill(spot1B);
		
		Ellipse2D.Double spot1C = new Ellipse2D.Double(xCoord+80,yCoord+30,40,30);
		g2.setColor(Color.white);
		g2.fill(spot1C);
		
		//STAIN 2
		Ellipse2D.Double spot2A = new Ellipse2D.Double(xCoord+120,yCoord+60,60,45);
		g2.setColor(Color.white);
		g2.fill(spot2A);
		
		Ellipse2D.Double spot2B = new Ellipse2D.Double(xCoord+115,yCoord+70,50,30);
		g2.setColor(Color.white);
		g2.fill(spot2B);
		
		Ellipse2D.Double spot2C = new Ellipse2D.Double(xCoord+125,yCoord+65,65,50);
		g2.setColor(Color.white);
		g2.fill(spot2C);
		
		//LEG SPOTS
		Ellipse2D.Double Legspot1FL = new Ellipse2D.Double(xCoord+63, yCoord+125, 15, 45);
		g2.setColor(Color.white);
		g2.fill(Legspot1FL);
		
		Ellipse2D.Double Legspot2FL = new Ellipse2D.Double(xCoord+63, yCoord+140, 20, 25);
		g2.setColor(Color.white);
		g2.fill(Legspot2FL);
		
		Ellipse2D.Double Legspot1FR = new Ellipse2D.Double(xCoord+94, yCoord+145, 20, 13);
		g2.setColor(new Color(139,69,19));
		g2.fill(Legspot1FR);
		
		Ellipse2D.Double Legspot2FR = new Ellipse2D.Double(xCoord+96,yCoord+140,20,30);
		g2.setColor(new Color(139,69,19));
		g2.fill(Legspot2FR);
		
		Ellipse2D.Double Legspot1BL = new Ellipse2D.Double(xCoord+165, yCoord+140, 8, 45);
		g2.setColor(new Color(139,69,19));
		g2.fill(Legspot1BL);
		
		Ellipse2D.Double Legspot1BR = new Ellipse2D.Double(xCoord+185, yCoord+127, 20, 50);
		g2.setColor(new Color(139,69,19));
		g2.fill(Legspot1BR);
		
		Ellipse2D.Double Legspot2BR = new Ellipse2D.Double(xCoord+180, yCoord+125, 25, 25);
		g2.setColor(new Color(139,69,19));
		g2.fill(Legspot2BR);
		
	}

}