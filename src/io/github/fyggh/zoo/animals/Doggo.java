package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D;


public class Doggo {
private static final Color BLACK = null;
int xCoord, yCoord, w, h;
	
	public Doggo(int x,int y,int width,int height) {
		xCoord = x;
		yCoord = y;
		w = width;
		h = height;
		
	}

	public <Triangle> void draw(Graphics2D g2) {
		g2.setColor (new Color (226, 162, 93));
		Rectangle house = new Rectangle ( 158, 125, 100, 120);
		g2.fill(house);
		
		g2.setColor (Color.BLACK);
		Rectangle house2 = new Rectangle ( 158, 125, 100, 120);
		g2.draw(house2);
		
		g2.setColor (new Color(142, 7, 7)) ;
		g2.fillPolygon(new int[] {125, 210, 300}, new int[] {140, 100, 140}, 3);
		
		g2.setColor (Color.BLACK) ;
		g2.drawPolygon(new int[] {125, 210, 300}, new int[] {140, 100, 140}, 3);
		
		g2.setColor ( new Color (226, 162, 93)) ;
		g2.fillPolygon(new int[] {155, 213, 280}, new int[] {140, 110, 140}, 3);
		
		g2.setColor(Color.BLACK);
		g2.fillArc(175, 170, 50, 150, 180, -180);
		
		Line2D.Double line8= new java.awt.geom.Line2D.Double (158, 155, 258, 155);
		g2.draw(line8);
		
		Line2D.Double line81= new java.awt.geom.Line2D.Double (158, 165, 258, 165);
		g2.draw(line81);
		
		Line2D.Double line82= new java.awt.geom.Line2D.Double (158, 175, 258, 175);
		g2.draw(line82);
		
		Line2D.Double line83= new java.awt.geom.Line2D.Double (158, 185, 258, 185);
		g2.draw(line83);
		
		Line2D.Double line833= new java.awt.geom.Line2D.Double (158, 195, 258, 195);
		g2.draw(line833);
		
		Line2D.Double line832= new java.awt.geom.Line2D.Double (158, 205, 258, 205);
		g2.draw(line832);
		
		Line2D.Double line831= new java.awt.geom.Line2D.Double (158, 215, 258, 215);
		g2.draw(line831);
		
		Line2D.Double line8311= new java.awt.geom.Line2D.Double (158, 225, 258, 225);
		g2.draw(line8311);

		Line2D.Double line8312= new java.awt.geom.Line2D.Double (158, 235, 258, 235);
		g2.draw(line8312);
		
		Line2D.Double line8313= new java.awt.geom.Line2D.Double (158, 245, 258, 245);
		g2.draw(line8313);
		
		g2.setColor(new Color (107, 52, 1));
		Ellipse2D.Double tail = new Double ( 160, 240, 60, 10);
		g2.fill(tail);
		
		g2.setColor (new Color (107, 52, 1)) ;
		Rectangle rightleg2 = new Rectangle ( 240, 210, 20, 40);
		g2.fill(rightleg2);
		
		g2.setColor(Color.BLACK) ;
		Rectangle Rightleg2 = new Rectangle ( 240, 210, 20, 40);
		g2.draw(Rightleg2);
		
		g2.setColor (new Color (145, 72, 2)) ;
		Rectangle Body = new Rectangle ( 200, 150, 50, 100);
		g2.fill(Body);
		
		g2.setColor(Color.BLACK) ;
		Rectangle Body2 = new Rectangle ( 200, 150, 50, 100);
		g2.draw(Body2);
		
		g2.setColor (new Color (145, 72, 2)) ;
		Rectangle Rightleg1 = new Rectangle ( 235, 230, 15, 20);
		g2.fill(Rightleg1);
		
		g2.setColor(Color.BLACK) ;
		Rectangle rightleg1 = new Rectangle ( 235, 230, 15, 20);
		g2.draw(rightleg1);
		
		g2.setColor (new Color (145, 72, 2)) ;
		Rectangle leftleg2 = new Rectangle ( 220, 230, 15, 20);
		g2.fill(leftleg2);
		
		g2.setColor(Color.BLACK) ;
		Rectangle leftleg1 = new Rectangle ( 220, 230, 15, 20);
		g2.draw(leftleg1);
		
		g2.setColor (new Color (145, 72, 2)) ;
		Rectangle Leftleg2 = new Rectangle ( 195, 210, 15, 40);
		g2.fill(Leftleg2);
		
		
		g2.setColor(Color.BLACK) ;
		Rectangle Leftleg1 = new Rectangle ( 195, 210, 15, 40);
		g2.draw(Leftleg1);
		
		g2.setColor (new Color (145, 72, 2)) ;
		g2.fillPolygon(new int[] {205, 190, 190}, new int[] {150, 150, 190}, 3);
		
		g2.setColor(Color.BLACK) ;
		g2.drawPolygon(new int[] {205, 190, 190}, new int[] {150, 150, 190}, 3);
		
		g2.setColor (new Color (107, 52, 1)) ;
		g2.fillPolygon(new int[] {250, 260, 260}, new int[] {150, 150, 190}, 3);
		
		g2.setColor(Color.BLACK) ;
		g2.drawPolygon(new int[] {250, 260, 260}, new int[] {150, 150, 190}, 3);
		
		g2.setColor(Color.PINK);
		g2.fillArc(224, 172, 20, 20, -360, -180);
		
		g2.setColor (new Color (145, 72, 2)) ;
		g2.fillArc(219, 170, 15, 15, 180, 180);
		
		g2.setColor(Color.BLACK);
		g2.drawArc(219, 170, 15, 15, 180, 180);
		
		g2.setColor(new Color (145, 72, 2)) ;
		g2.fillArc(234, 170, 15, 15, 180, 180);
		
		g2.setColor(Color.BLACK);
		g2.drawArc(234, 170, 15, 15, 180, 180);
		
		g2.setColor(Color.BLACK);
		Rectangle Nose = new Rectangle ( 225, 170, 20, 10);
		g2.fill(Nose);

		g2.setColor(Color.BLACK);
		Ellipse2D.Double Lefteye = new Double ( 210, 160, 5, 5);
		g2.fill(Lefteye);
	
		g2.setColor(Color.BLACK);
		Ellipse2D.Double Righteye = new Double ( 245, 160, 5, 5);
		g2.fill(Righteye);
		
		Line2D.Double line = new java.awt.geom.Line2D.Double (200, 250, 200, 245);
		g2.draw(line);
		
		Line2D.Double line2 = new java.awt.geom.Line2D.Double (206, 250, 206, 245);
		g2.draw(line2);
	
		Line2D.Double line3 = new java.awt.geom.Line2D.Double (226, 250, 226, 245);
		g2.draw(line3);
		
		Line2D.Double line4 = new java.awt.geom.Line2D.Double (231, 250, 231, 245);
		g2.draw(line4);
	
		Line2D.Double line5 = new java.awt.geom.Line2D.Double (243, 250, 243, 245);
		g2.draw(line5);
		
		Line2D.Double line6 = new java.awt.geom.Line2D.Double (248, 250, 248, 245);
		g2.draw(line6);
		
		Line2D.Double line7 = new java.awt.geom.Line2D.Double (158, 145, 258, 145);
		g2.draw(line7);
	}
	
	

	
		
	}
