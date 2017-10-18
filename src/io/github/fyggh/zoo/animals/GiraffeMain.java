package io.github.fyggh.zoo.animals;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class GiraffeMain {

		int xCoord, yCoord, width, height ;

		public GiraffeMain (int x, int y, int w, int h){
				xCoord = x;
				yCoord = y;
				width = w;
				height= h;
			}
			
			public void draw(Graphics2D g2) {
			
				
			
			g2.setColor(new Color(255, 153, 51));
			
			Rectangle head = new Rectangle(xCoord+100, yCoord, width+55, height+50);
		g2.fill(head);
		
			Rectangle neck = new Rectangle(xCoord+110, yCoord+50, width+45, height+300);
		g2.fill(neck);
		
		Ellipse2D.Double nose = new Ellipse2D.Double(xCoord+62, yCoord+20, width+60,height+30 );
		g2.fill(nose);
		
		Rectangle body = new Rectangle(xCoord+110, yCoord+350, width+280, height+120);
		g2.fill(body);
		
		Rectangle leg1 = new Rectangle(xCoord+110,yCoord+470, width+30, height+210);
		g2.fill(leg1);
		
		Rectangle leg2 = new Rectangle(xCoord*37, yCoord*48, width+30, height+210);
		g2.fill(leg2);
		
		Ellipse2D.Double tail = new Ellipse2D.Double(xCoord*38, yCoord*44, width+140, height+15);
		g2.fill(tail);
		
		Ellipse2D.Double foot1 = new Ellipse2D.Double(xCoord*9, yCoord*68, width+60, height+22);
				g2.fill(foot1);
				
				Ellipse2D.Double foot2 = new Ellipse2D.Double(xCoord*34, yCoord*68, width+60, height+22);
				g2.fill(foot2);
	
				g2.setColor(new Color(0,0,0));
				Line2D.Double mouth = new Line2D.Double(80, 50,100, 45 );
		g2.draw(mouth);
				Ellipse2D.Double eye = new Ellipse2D.Double(xCoord+110 , yCoord+15, width+14, height+14);
					g2.fill(eye);
					Ellipse2D.Double insideEye = new Ellipse2D.Double(xCoord+110, yCoord+18, width+5, height+5);
					g2.setColor(Color.WHITE);
					g2.fill(insideEye);
		g2.setColor(new Color(160,82,45));
		
		Ellipse2D.Double spot1 = new Ellipse2D.Double(xCoord*13, yCoord*18, width+32, height+40);
		g2.fill(spot1);
		
		Ellipse2D.Double spot2 = new Ellipse2D.Double(xCoord*30, yCoord*40, width+60, height+60);
		g2.fill(spot2);
		
		Ellipse2D.Double spot3 = new Ellipse2D.Double(xCoord*16, yCoord*42, width+37, height+50);
		g2.fill(spot3);
		
		Ellipse2D.Double spot4 = new Ellipse2D.Double(xCoord*13, yCoord*36, width+40, height+45);
		g2.fill(spot4);
		
		Ellipse2D.Double spot5 = new Ellipse2D.Double(xCoord*25, yCoord*45, width+20, height+12);
		g2.fill(spot5);
		
		Ellipse2D.Double spot6 = new Ellipse2D.Double(xCoord*39, yCoord*58, width+6, height+8);
		g2.fill(spot6);
		
		Ellipse2D.Double spot7 = new Ellipse2D.Double(xCoord*38, yCoord*62, width+18, height+12);
		g2.fill(spot7);
		
		Ellipse2D.Double spot8 = new Ellipse2D.Double(xCoord*22, yCoord*40, width+38, height+30);
		g2.fill(spot8);
		
		Ellipse2D.Double spot9 = new Ellipse2D.Double(xCoord*27, yCoord*37, width+25, height+22);
		g2.fill(spot9);
		
		Ellipse2D.Double spot10 = new Ellipse2D.Double(xCoord*37.2, yCoord*50, width+26, height+35);
		g2.fill(spot10);
		
		Ellipse2D.Double spot11 = new Ellipse2D.Double(xCoord*36, yCoord*37, width+18, height+12);
		g2.fill(spot11);
		
		Ellipse2D.Double spot12 = new Ellipse2D.Double(xCoord*20, yCoord*38, width+6, height+8);
		g2.fill(spot12);
		
		
		Ellipse2D.Double spot14 = new Ellipse2D.Double(xCoord*15, yCoord*6, width+12, height+9);
		g2.fill(spot14);
		
		Ellipse2D.Double spot15 = new Ellipse2D.Double(xCoord*13, yCoord*50, width+4, height+13);
		g2.fill(spot15);
		
		Ellipse2D.Double spot16 = new Ellipse2D.Double(xCoord*13, yCoord*55, width+8, height+8);
		g2.fill(spot16);
		
		Ellipse2D.Double spot17 = new Ellipse2D.Double(xCoord*13.2, yCoord*62, width+14, height+11);
		g2.fill(spot17);
		
		Ellipse2D.Double spot18 = new Ellipse2D.Double(xCoord*15.5, yCoord*2, width+4, height+11);
		g2.fill(spot18);
		
		Ellipse2D.Double spot19 = new Ellipse2D.Double(xCoord*12.7, yCoord*29, width+12, height+20);
		g2.fill(spot19);
		
		Ellipse2D.Double spot20 = new Ellipse2D.Double(xCoord*13, yCoord*13, width+20, height+15);
		g2.fill(spot20);
		
		Ellipse2D.Double tailEnd = new Ellipse2D.Double(xCoord*51, yCoord*44, width+20, width+20);
		g2.fill(tailEnd);
}
}
