package io.github.fyggh.zoo.animals;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Rabbit {
    int xCoord, yCoord;
    double scale;
    public Rabbit(int x, int y, double s) {
        xCoord = x;
        yCoord = y;
        scale = s;
        
    }
    public Rabbit(int x, int y) {
    	xCoord = x;
    	yCoord = y;
    	scale = .5;
    }
    private int adx(int x){
    	return xCoord + (int)(x*scale);
    }
    private int scale(int orig) {
    	return (int)(orig * scale);
    }
	private int ady(int y){
		return yCoord + (int)(y*scale);
	}
    public void draw(Graphics2D g2){
       
    	Color outer = new Color(100,85,80);
    	Color inner = new Color(147,88,60);
    	
    	/*
    	 //background
    	Rectangle sky = new Rectangle(0, 0, scale(375), scale(220));
    	g2.setPaint(new Color(106,221,243));
    	g2.fill(sky);
    	Arc2D.Double hill = new Arc2D.Double(0, ady(120), scale(375), scale(200), 0, 180, Arc2D.CHORD);
        g2.setPaint(new Color(93,63,29));
        g2.fill(hill);
        Arc2D.Double sun = new Arc2D.Double(0,  0,  scale(40), scale(40), 0, 360, Arc2D.CHORD);
        g2.setPaint(Color.YELLOW);
        g2.fill(sun);
        g2.setStroke(new BasicStroke(scale(8)));
        Line2D.Double ray1 = new Line2D.Double(adx(5), ady(45), adx(5), ady(60));
        g2.draw(ray1);
        Line2D.Double ray2 = new Line2D.Double(adx(45), ady(5), adx(60), ady(5));
        g2.draw(ray2);
        Line2D.Double ray3 = new Line2D.Double(adx(35), ady(35), adx(45), ady(45));
        g2.draw(ray3);
        Line2D.Double ray4 = new Line2D.Double(adx(22), ady(45), adx(27), ady(57));
        g2.draw(ray4);
        Line2D.Double ray5 = new Line2D.Double(adx(45), ady(22), adx(57), ady(27));
        g2.draw(ray5);
        g2.setStroke(new BasicStroke(1));
       */
        
        
        
        
    	//outer ears
       Ellipse2D.Double leftEar = new Ellipse2D.Double(adx(65), ady(10), scale(20), scale(90));
       g2.setPaint(outer);
       g2.fill(leftEar);
       
       Ellipse2D.Double rightEar = new Ellipse2D.Double(adx(95), ady(10), scale(20), scale(90));
       g2.fill(rightEar);
       
       //inner ears
       Ellipse2D.Double innerLeft = new Ellipse2D.Double(adx(70),ady(40), scale(10), scale(60));
       g2.setPaint(inner);
       g2.fill(innerLeft);
       Ellipse2D.Double innerRight = new Ellipse2D.Double(adx(100),ady(40), scale(10), scale(60));
       g2.fill(innerRight);
       
       //head
       Ellipse2D.Double head = new Ellipse2D.Double(adx(65),ady(90), scale(50), scale(65));
       g2.setPaint(outer);
       g2.fill(head);
       
       
       //eyes
       Ellipse2D.Double leftEye = new Ellipse2D.Double(adx(75),ady(105), scale(10), scale(20));
       g2.setPaint(Color.BLACK);
       g2.fill(leftEye);
       Ellipse2D.Double rightEye = new Ellipse2D.Double(adx(95),ady(105), scale(10), scale(20));
       g2.setPaint(Color.BLACK);
       g2.fill(rightEye);
       
       //nose and mouth
       int[] xcoords = {adx(84), adx(90), adx(95)};						
       int[] ycoords = {ady(130), ady(140), ady(130)};
       Polygon nose = new Polygon(xcoords, ycoords, xcoords.length);
       g2.setPaint(Color.PINK);		
       g2.fill(nose);
       
       Line2D.Double nariz = new Line2D.Double(adx(90),ady(133),adx(90),ady(143));
       g2.setPaint(Color.BLACK);
       g2.draw(nariz);
       Line2D.Double mouth = new Line2D.Double(adx(87),ady(143),adx(93),ady(143));
       g2.setPaint(Color.BLACK);
       g2.draw(mouth);
      
       
       //tail
       
       Ellipse2D.Double tail = new Ellipse2D.Double(adx(180), ady(120), scale(25), scale(25));
       g2.setPaint(Color.WHITE);
       g2.fill(tail);
       
       
       //body
       
       Ellipse2D.Double body = new Ellipse2D.Double(adx(100), ady(120), scale(90), scale(50));
       g2.setPaint(outer);
       g2.fill(body);
       
       Ellipse2D.Double belly = new Ellipse2D.Double(adx(110), ady(149), scale(70), scale(20));
       g2.setPaint(inner);
       g2.fill(belly);
       
       //feet 
       
       Ellipse2D.Double foot = new Ellipse2D.Double(adx(150), ady(160), scale(40), scale(15));
       g2.setPaint(outer);
       g2.fill(foot);
       Ellipse2D.Double innerFoot = new Ellipse2D.Double(adx(160), ady(166), scale(24), scale(9));
       g2.setPaint(Color.WHITE);
       g2.fill(innerFoot);
       Ellipse2D.Double padOne = new Ellipse2D.Double(adx(155), ady(163), scale(5), scale(3));
       g2.setPaint(Color.BLACK);
       g2.fill(padOne);
       Ellipse2D.Double padTwo = new Ellipse2D.Double(adx(153), ady(168), scale(5), scale(3));
       g2.fill(padTwo);
    
       //carrot
       
       Ellipse2D.Double carrot = new Ellipse2D.Double(adx(115), ady(169), scale(60), scale (15));
       g2.setPaint(new Color(252,106,13));
       g2.fill(carrot);
       Rectangle2D.Double carrotTop = new Rectangle2D.Double(adx(115), ady(169), scale(30), scale(15));
       g2.fill(carrotTop);
       Arc2D.Double carrotGreen = new Arc2D.Double(adx(110), ady(169), scale(10), scale(15), 90, 180, Arc2D.CHORD);
       g2.setPaint(new Color(62,118,10));
       g2.fill(carrotGreen);
       Line2D.Double line1 = new Line2D.Double(adx(125), ady(184), adx(125), ady(175));
       g2.setPaint(Color.BLACK);
       g2.draw(line1);
       Line2D.Double line2 = new Line2D.Double(adx(135), ady(170), adx(135), ady(175));
       g2.draw(line2);
       Line2D.Double line3 = new Line2D.Double(adx(155), ady(184), adx(155), ady(175));
       g2.draw(line3);
       Arc2D.Double leaf1 = new Arc2D.Double(adx(75), ady(170), scale(40), scale(30), 30, 125, Arc2D.OPEN);
       g2.setPaint(new Color(62,118,10));
       g2.setStroke(new BasicStroke(5));
       g2.draw(leaf1);
       Arc2D.Double leaf2 = new Arc2D.Double(adx(80), ady(175), scale(40),scale(30), 60, 125, Arc2D.OPEN);
       g2.draw(leaf2);
       Arc2D.Double leaf3 = new Arc2D.Double(adx(78), ady(157), scale(40), scale(20), 310, -160, Arc2D.OPEN);
       g2.draw(leaf3); 
       Arc2D.Double leaf4 = new Arc2D.Double(adx(80), ady(150), scale(40), scale(30), 300, -140, Arc2D.OPEN);
       g2.draw(leaf4);
       Arc2D.Double leaf5 = new Arc2D.Double(adx(67), ady(175), scale(50), scale(20), 30, 180, Arc2D.OPEN);
       g2.draw(leaf5);
       Arc2D.Double leaf6 = new Arc2D.Double(adx(82), ady(175), scale(35), scale(20), 50, 200, Arc2D.OPEN);
       g2.draw(leaf6);
       g2.setStroke(new BasicStroke(1));
       
       
       
       //outlines
       
       g2.setPaint(Color.BLACK);
       g2.draw(head);
      
    }
}