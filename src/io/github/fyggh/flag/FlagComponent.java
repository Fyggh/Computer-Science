package io.github.fyggh.flag;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class FlagComponent extends JComponent {

	private static final int DEFAULT_X = 0;
	private static final int DEFAULT_Y = 0;
	
	private static final double DEFAULT_WIDTH = 500.0;
	private static final double DEFAULT_HEIGHT = 300.0;
	
	private static final double DEFAULT_THIRD_WIDTH = DEFAULT_WIDTH / 3;
	
	private static final double ASPECT_RATIO = 1.67;
	
	private Rectangle2D blueThird;
	private Rectangle2D whiteThird;
	private Rectangle2D redThird;
	
	private int x, y;
	private double height, width;
	private double thirdWidth;
	
	/**
	 * Default constructor that builds a component with top-left corner at the origin.
	 */
	public FlagComponent() {
		
		this(DEFAULT_X, DEFAULT_Y);
		
	}
	
	/**
	 * Build a French flag component with top-left corner at the specified coordinates.
	 * @param x
	 * @param y
	 */
	public FlagComponent(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		blueThird = new Rectangle2D.Double(this.x, this.y, DEFAULT_THIRD_WIDTH, DEFAULT_HEIGHT);
		whiteThird = new Rectangle2D.Double(this.x + DEFAULT_THIRD_WIDTH, this.y, DEFAULT_THIRD_WIDTH, DEFAULT_HEIGHT);
		redThird = new Rectangle2D.Double(this.x + 2 * DEFAULT_THIRD_WIDTH, this.y, DEFAULT_THIRD_WIDTH, DEFAULT_HEIGHT);
		
		
	}
	
	/**
	 * Don't use this constructor; it's not ready yet
	 * 
	 * @deprecated
	 * @param x
	 * @param y
	 * @param height
	 */
	public FlagComponent(int x, int y, double height) {
		
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = height * ASPECT_RATIO;
		
		this.thirdWidth = width / 3;
		
		blueThird = new Rectangle2D.Double(this.x, this.y, this.thirdWidth, this.height);
		whiteThird = new Rectangle2D.Double(this.x + this.thirdWidth, this.y, this.thirdWidth, this.height);
		redThird = new Rectangle2D.Double(this.x + 2 * this.thirdWidth, this.y, this.thirdWidth, this.height);
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(Color.BLUE);
		g2.fill(blueThird);
		
		g2.setColor(Color.WHITE);
		g2.fill(whiteThird);
		
		g2.setColor(Color.RED);
		g2.fill(redThird);
		
	}
	
	@Override
	public void mouseMoved() {
		
	}

}

// 300 tall by 500 wide