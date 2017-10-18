package io.github.fyggh.zoo.animals;
		import java.awt.Color;
		import java.awt.Graphics2D;
		import java.awt.geom.Arc2D;
		import java.awt.geom.Ellipse2D;
		
		public class Whale {
			int xCoord, yCoord, nCoord;
			
			public Whale (int x, int y) {
				xCoord = x;
				yCoord = y;
				nCoord = y;
				
			}

			public void draw(Graphics2D g2) {
				
			Ellipse2D.Double body = new Ellipse2D.Double(200, 300, 500, 180);
			g2.setColor(new Color(253, 255, 230) ) ;
			g2.fill(body);
			
			Ellipse2D.Double lbody = new Ellipse2D.Double(420, 330, 375, 120);
			g2.setColor(new Color(253, 255, 230));
			g2.fill(lbody);
			
			Ellipse2D.Double forehead = new Ellipse2D.Double(190, 290, 250, 150);
			g2.setColor(new Color(253, 255, 230));
			g2.fill(forehead);
			
			Ellipse2D.Double eye = new Ellipse2D.Double(300, 360, 10, 10);
			g2.setColor(Color.BLACK);
			g2.fill(eye);
			
			Ellipse2D.Double lump = new Ellipse2D.Double(310, 380, 80, 150) ;
			g2.setColor(new Color(253, 255, 230));
			g2.fill(lump);
			
			Ellipse2D.Double lump2 = new Ellipse2D.Double(400, 400, 75, 110);
			g2.setColor(new Color(253, 255, 230));
			g2.fill(lump2);
			
			Ellipse2D.Double fin = new Ellipse2D.Double(750, 375, 60, 115);
			g2.setColor(new Color(253, 255, 230));
			g2.fill(fin);
			
			Ellipse2D.Double fin2 = new Ellipse2D.Double(750, 270, 60, 115);
			g2.setColor(new Color(253, 255, 230));
			g2.fill(fin2);
			
			Arc2D.Double gil1 = new Arc2D.Double(320, 440, 50, 10, -10, 180, Arc2D.OPEN);
			g2.setColor(Color.GRAY);
			g2.draw(gil1);
			
			Arc2D.Double gil2 = new Arc2D.Double(325, 432, 45, 7, -10, 180, Arc2D.OPEN);
			g2.setColor(Color.GRAY);
			g2.draw(gil2);
			
			Arc2D.Double smile = new Arc2D.Double(208, 410, 55, 7, 190, 180, Arc2D.OPEN);
			g2.setColor(Color.GRAY);
			g2.draw(smile);
			
			
			
			
			
			
			}




	}
		

