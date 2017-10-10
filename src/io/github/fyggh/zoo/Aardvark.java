/**
 * 
 */
package io.github.fyggh.zoo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JComponent;

/**
 * @author 200503041
 *
 */
public abstract class Aardvark {

	private int x;
	private int y;
	private int numPoints;
	
	private double[] xPoints = {5.0, 300, 30};
	private double[] yPoints = {3, 20, 300};
	
	/**
	 * 
	 */
	protected Aardvark() {
		super();
		numPoints = xPoints.length;
	}
	
	/**
	 * 
	 */
	protected Aardvark(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void paint(Graphics2D g2) { //how does he want this? how is this being called?
		// TODO draw aardvark
		
		Ellipse2D.Double where = new Ellipse2D.Double(1000, 1000, 10, 10);
		
		Path2D.Double aardvarkPath = new Path2D.Double(Path2D.WIND_NON_ZERO, this.numPoints);
		
		aardvarkPath.moveTo(xPoints[0], yPoints[0]);
		
		for (int i = 1; i < numPoints; i++) {
			
			aardvarkPath.quadTo(1000, 1000, xPoints[i], yPoints[i]);
			
		}
		
		aardvarkPath.closePath();
		
		
		
		g2.fill(aardvarkPath);
		g2.setPaint(Color.blue);
		g2.fill(where);
	}

	/**
		 * @author Fyggh
		 *
		 */
	public static class BodyPart {
		
		private Shape shape;
		private Paint fillPaint;
		private Paint strokePaint;
		private Stroke stroke;
		private float strokeWidth;
		private Integer layer;
		
		/**
		 * @param shape
		 * @param fillPaint
		 * @param strokePaint
		 * @param strokeWidth
		 * @param bodyPartMap TODO
		 */
		protected BodyPart(Shape shape, Paint fillPaint, Paint strokePaint, float strokeWidth, Integer layer, Map<Integer, BodyPart> bodyPartMap) {
			this(shape, fillPaint, strokePaint, new BasicStroke(strokeWidth), layer, bodyPartMap);
		}

		/**
		 * @param shape
		 * @param fillPaint
		 * @param strokePaint
		 * @param layer TODO
		 * @param bodyPartMap TODO
		 * @param strokeWidth
		 */
		protected BodyPart(Shape shape, Paint fillPaint, Paint strokePaint, Stroke stroke, Integer layer, Map<Integer, BodyPart> bodyPartMap) {
			super();
			this.shape = shape;
			this.fillPaint = fillPaint;
			this.strokePaint = strokePaint;
			this.stroke = stroke;
			this.layer = layer;
			
			bodyPartMap.put(layer, this);
		}
	
	}

	public static class Cartoon extends Aardvark {

		private int x, y;
		private int numPoints;
		
		private Map<Shape, Color> layer0 = new HashMap<>();
		private Map<Integer, Map<Shape, Color>> shapeMap = new TreeMap<>();
		
		private Object[][] layer0Array = { { new Line2D.Double(1, 34, 200, 21) }, { Color.BLACK } };
		
		private Rectangle2D tailBoundingBox = new Rectangle2D.Double(x + 5, y + 5, 50, 150);
		private Shape tailStroke = new Arc2D.Double(tailBoundingBox, 0, 100, Arc2D.OPEN);
		private Ellipse2D tail = new Ellipse2D.Double(x + 5, y + 5, 50, 150);
		
		private final static Color AARDVARK_YELLOW = new Color(255, 213, 29);
		private final static Color AARDVARK_BLUE = new Color(0, 93, 171);
		private final static int AARDVARK_STROKE_WIDTH = 6;
		
		
		/**
		 * 
		 */
		public Cartoon() {
			this(0,0);
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param x
		 * @param y
		 */
		public Cartoon(int x, int y) {
			
			this.x = x;
			this.y = y;
			this.y = Math.abs(y);
			
			//layer0.put(new Ellipse2D.Double(this.x, this.y, 50, 20), Color.BLUE);
			
			shapeMap.put(1, layer0);
			
		}
		
		public void paint(Graphics2D g2) {
			
			paintShape(g2, tail, Cartoon.AARDVARK_YELLOW, Cartoon.AARDVARK_STROKE_WIDTH, Cartoon.AARDVARK_BLUE);
			
			//array logic
			/*
			for (int i = 0; i < layer0Array[0].length; i++) {
				
				g2.setColor((Color) layer0Array[1][i]);
				g2.draw((Shape) layer0Array[0][i]);
				
			}
			*/
			
		}
		
		public void paintShape(Graphics2D g2, Shape shape, Paint fillPaint, Stroke stroke, Paint strokePaint) {
			
			Stroke origStroke = g2.getStroke();
			Paint origPaint = g2.getPaint();
			
			g2.setPaint(fillPaint);
			g2.fill(shape);
			
			g2.setStroke(stroke);
			g2.setPaint(strokePaint);
			g2.draw(shape);
			
			g2.setStroke(origStroke);
			g2.setPaint(origPaint);
			
		}
		
		public void paintShape(Graphics2D g2, Shape shape, Paint fillPaint, int strokeWidth, Paint strokePaint) {
			
			paintShape(g2, shape, fillPaint, new BasicStroke(strokeWidth), strokePaint);
			
		}
	}
	
	
}
