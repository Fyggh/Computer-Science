package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class Platypus {
	int xCoord, yCoord, w, h;

	public Platypus (int x, int y, int width, int height) {
		xCoord = x; 
		yCoord = y; 
		w = width; 
		h = height;
		
	}


	public void draw(Graphics2D g2) {
		g2.setColor(new Color (0,100,0));
		Rectangle platypus = new Rectangle(xCoord,yCoord,100,50);
		g2.draw(platypus);
		
		g2.setColor(Color.black);
		Rectangle flag2 = new Rectangle(xCoord+55,yCoord+50,5,20);
		g2.fill(flag2);
		
		Rectangle flag3 = new Rectangle(xCoord+75,yCoord+50,5,20);
		g2.fill(flag3); 
		
		Rectangle flag4 = new Rectangle(xCoord+105,yCoord+50,5,20);
		g2.fill(flag4);
				
		Rectangle flag5 = new Rectangle(xCoord+125,yCoord+50,5,20);
		g2.fill(flag5);
		
		Rectangle flag6 = new Rectangle(xCoord+60,yCoord+65,8,5);
		g2.fill(flag6); 
		
		Rectangle flag7 = new Rectangle(xCoord+80,yCoord+65,8,5);
		g2.fill(flag7);
	
		Rectangle flag8 = new Rectangle(xCoord+110,yCoord+65,8,5);
		g2.fill(flag8);
		
		Rectangle flag9 = new Rectangle(xCoord+130,yCoord+65,8,5);
		g2.fill(flag9);
		
		g2.setColor(new Color (0,100,0));
		Rectangle flag10 = new Rectangle(xCoord+140,yCoord+10,40,30);
		g2.fill(flag10); 
		
		g2.setColor(new Color (51,0,0));
		Rectangle flag11 = new Rectangle(xCoord+10,yCoord+35,30,10);
		g2.fill(flag11);
		
		Rectangle flag12 = new Rectangle(xCoord+150,yCoord+15,5,5);
		g2.fill(flag12);
		
		Rectangle flag13 = new Rectangle(xCoord+160,yCoord+15,5,5);
		g2.fill(flag13);
		
		Rectangle flag14 = new Rectangle(xCoord+150,yCoord+30,20,5);
		g2.fill(flag14);
		
		
	}
	

	}
		
	
		
	
	


				
				
		


