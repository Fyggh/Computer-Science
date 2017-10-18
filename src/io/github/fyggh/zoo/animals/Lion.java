package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

// Makes a Lion using Graphics 
public class Lion {
	int xPos, yPos;
	
	public Lion(){
		xPos = 250;    //adjust the x and y position 
		yPos = 150;
	}
	
	public Lion(int x, int y){
		xPos= x;      // set xPos and yPos to new variables
		yPos= y;
	}		
	
	public void draw(Graphics2D g2){
		
		//body of the lion
		g2.setColor(new Color(212,175,55));
		Rectangle body = new Rectangle(xPos, yPos, 360, 100);
		g2.fill(body);
		
		// draw the mane 
		g2.setColor(new Color(160,82,45));
		Ellipse2D.Double mane = new Ellipse2D.Double(xPos - 155, yPos - 125 , 250, 200);
		g2.fill(mane);
		
		Ellipse2D.Double tip = new Ellipse2D.Double(xPos + 377, yPos + 157 , 30, 15);
		g2.fill(tip);
		
		
		g2.setColor(new Color(212,175,55));
		Ellipse2D.Double head = new Ellipse2D.Double(xPos - 120 , yPos - 80 , 150, 100);
		g2.fill(head);
		
		Rectangle leg1 = new Rectangle(xPos, yPos + 100 , 20, 100);
		g2.fill(leg1);
		
		Rectangle leg2 = new Rectangle(xPos + 50, yPos + 100, 20, 100);
		g2.fill(leg2);
		
		Rectangle leg3 = new Rectangle(xPos + 290, yPos + 100, 20, 100);
		g2.fill(leg3);
		
		Rectangle leg4 = new Rectangle(xPos + 340, yPos + 100, 20, 100);
		g2.fill(leg4);
		
		Ellipse2D.Double paw1 = new Ellipse2D.Double(xPos - 10 , yPos + 198, 35, 20);
		g2.fill(paw1);
		
		Ellipse2D.Double paw2 = new Ellipse2D.Double(xPos + 40 , yPos + 198, 35, 20);
		g2.fill(paw2);
		
		Ellipse2D.Double paw3 = new Ellipse2D.Double(xPos + 280 , yPos + 198, 35, 20);
		g2.fill(paw3);
		
		Ellipse2D.Double paw4 = new Ellipse2D.Double(xPos + 330 , yPos + 198, 35, 20);
		g2.fill(paw4);
		
		Rectangle tail1 = new Rectangle(xPos + 360, yPos , 20, 15);
		g2.fill(tail1);
		
		Rectangle tail2 = new Rectangle(xPos + 380, yPos , 15, 160);
		g2.fill(tail2);
		
		Ellipse2D.Double ear1 = new Ellipse2D.Double(xPos - 90 , yPos - 90 , 30, 35);
		g2.fill(ear1);
		
		Ellipse2D.Double ear2 = new Ellipse2D.Double(xPos - 30 , yPos - 90 , 30, 35);
		g2.fill(ear2);
		
		
		g2.setColor(new Color(222,184,135));
		Ellipse2D.Double innerear1 = new Ellipse2D.Double(xPos - 83 , yPos - 85 , 10, 10);
		g2.fill(innerear1);
		
		Ellipse2D.Double innerear2 = new Ellipse2D.Double(xPos - 20, yPos - 85 , 10, 10);
		g2.fill(innerear2);
		
		g2.setColor(new Color(176,196,222));
		Ellipse2D.Double eye1 = new Ellipse2D.Double(xPos - 120 , yPos - 60 , 20, 15);
		g2.fill(eye1);
		
		Ellipse2D.Double eye2 = new Ellipse2D.Double(xPos - 70 , yPos - 60 , 20, 15);
		g2.fill(eye2);
			
		g2.setColor(new Color(160,82,45));
		g2.fillPolygon(new int [] {xPos - 100, xPos - 90, xPos - 80} , new int[] {yPos - 30,yPos - 15,yPos - 30}, 3);
		
		RoundRectangle2D.Double mouth = new RoundRectangle2D.Double(xPos - 102, yPos - 5, 30, 1, 50, 10);
		g2.draw(mouth);
		
		g2.setColor(new Color(222,184,135));
		Rectangle belly2 = new Rectangle(xPos + 70, yPos + 100, 220, 10);
		g2.fill(belly2);
		
		Rectangle belly1 = new Rectangle(xPos + 20, yPos + 100, 30, 10);
		g2.fill(belly1);
		
		Rectangle belly3 = new Rectangle(xPos + 310, yPos + 100, 30, 10);
		g2.fill(belly3);
		
	}
}



