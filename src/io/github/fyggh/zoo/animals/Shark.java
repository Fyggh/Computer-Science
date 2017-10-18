package io.github.fyggh.zoo.animals;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;

public class Shark {
	int xCoord, yCoord, nCoord;
	
	public Shark (int x, int y) {
		xCoord = x;
		yCoord = y;
		nCoord = y;
		
	
}
	
	public void draw(Graphics2D g2){
		
	    int[] xcoords1 = {300, 490, 490};
	    int[] ycoords1 = {160, 70, 200};
	       Polygon fin = new Polygon(xcoords1, ycoords1, xcoords1.length);
		g2.setColor(Color.GRAY);
	    g2.fill(fin);
		
	    int[] xcoords = {605, 750, 710};
	    int[] ycoords = {235, 150, 230};
	       Polygon tail1 = new Polygon(xcoords, ycoords, xcoords.length);
		g2.setColor(Color.GRAY);
	    g2.fill(tail1);
	    
	    int[] xcoords3 = {605, 710, 750};
	    int[] ycoords3 = {235, 230, 325};
	       Polygon tail2 = new Polygon(xcoords3, ycoords3, xcoords3.length);
		g2.setColor(Color.GRAY);
	    g2.fill(tail2);
	    
	    Ellipse2D.Double body = new Ellipse2D.Double(150, 150, 500, 175);
	    g2.setColor(Color.GRAY);
	    g2.fill(body);
		
	    
	    Ellipse2D.Double  down = new Ellipse2D.Double(225, 255, 350, 70);
	    g2.setColor(Color.WHITE);
	    g2.fill(down);
		
	    
		Ellipse2D.Double eye = new Ellipse2D.Double(225, 200, 15, 15);
		g2.setColor(Color.BLACK);
		g2.fill(eye);
		
		Arc2D.Double gil1 = new Arc2D.Double(290, 185, 20, 50, 270, 200, Arc2D.OPEN);
		g2.setColor(Color.BLACK);
		g2.draw(gil1);
		
		Arc2D.Double gil2 = new Arc2D.Double(310, 182.5, 20, 50, 270, 200, Arc2D.OPEN);
		g2.setColor(Color.BLACK);
		g2.draw(gil2);
		
		Arc2D.Double gil3 = new Arc2D.Double(330, 180, 20, 50, 270, 200, Arc2D.OPEN);
		g2.setColor(Color.BLACK);
		g2.draw(gil3);
		
		int[] xcoords2 = {360, 490, 510};
	    int[] ycoords2 = {275, 275, 370};
	       Polygon arm = new Polygon(xcoords2, ycoords2, xcoords2.length);
		g2.setColor(Color.GRAY);
	    g2.fill(arm);
	   
	    

	}
}
