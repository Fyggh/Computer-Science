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
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
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
	
	public void draw(Graphics2D g2) { //how does he want this? how is this being called?
		// TODO draw aardvark
		
		Ellipse2D.Double where = new Ellipse2D.Double(1000, 1000, 10, 10);
		
		Path2D.Double aardvarkPath = new Path2D.Double(Path2D.WIND_NON_ZERO, this.numPoints);
		
		aardvarkPath.moveTo(xPoints[0], yPoints[0]);
		
		for (int i = 1; i < numPoints; i++) {
			
			aardvarkPath.quadTo(1000, 1000, xPoints[i], yPoints[i]);
			
		}
		
		aardvarkPath.closePath();
		aardvarkPath.transform(new AffineTransform(1.0, 0.0, 0.0, 1.0, x, y)); // translate the path shape
		
		
		
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

	public static class RealisticUCI extends Aardvark {
	
		/**
			 * @author Fyggh
			 *
			 */
		protected static class Instruction {
		
			private char instructionType;
			private double[] points;
			
			/**
			 * @param instructionType
			 * @param points
			 */
			protected Instruction(char instructionType, double[] points) {
				super();
				this.instructionType = instructionType;
				this.points = points;
			}
			
			protected Instruction(char instructionType, String points) {
				this(instructionType, extractPoints(points));
			}
			
		}

		private static final String YELLOW_FILL_SVG = "M19.92,85.68,17.28,97.92,4.56,76.8,0,53.28,1,31l7-21.12L18.24,1.2,31.2,0l7,5,6,12,3.6,16.32,4.56,13,3.84,2.88,4.56,1,4.32,1,17,29.76,11,25,.72,4.56,3.84,5.28L96.48,125l-2.64,5.76-1.2,4.08L98.16,137l2.64,3.84-1,4.56-3.12,3.36-7.68.48-1,7.2-1.44,3.6H83.28l-7-1.68-5.76-1.2H64.32l-6,.24-8.16,1.2-8.4.24-5.28-2.64.24-5.76,2.88-10.32,5.28-13.92,6.72-17.52-3.12-1.2-2.88-2.16-2.88-3.84-2.16-4.08-1-2.16-4.08,7L30,91.68,27.36,99.6ZM127.92,155l12,.72,14.16-1.2L168,156.24l6.24.72,2.16-2.88.48-6.48,6.72-2.4,3.84-3.12-.24-3.84-2.64-5.76-7-.72-5.52,1-3.36-1.2L169,121.2l.72-10.8,1.44-6.72,2.4-7.68,8.88,3.12H191l10.8.48L211.2,101l8.4,2.4,16.56,3.36,31,1,16.32.48,12.72,4.8,3.36-4.32-1.44-3.6-13-5-27.84-8.64-31.44-13-20.16-9.36-10.8-5L182.4,59s-4.8-2.5-6.72-5.28,1-1.68,1-1.68L180,49.44v-5l3.36-5.28s3-3.26,3.12-3.12,5.28,10.56,5.28,10.56l3.6,2.16,1.44-2.16-.24-12.72-2.88-12.48-4.08-5.52L185,15.6l-4.32,5.28-2.4,6.72-2.64-1.44-4.08-5L167,19.44,165.6,24,162,34.8l-2.16,10.8-5,1.68L134.4,97l-3.12,16.56L127.44,133l-.24,11.76ZM170.4,73.92l-3.12-4.8-1.2-4.32,1.2-2.4h3.6l5,2.16,3.6,2.64,4.56,2.88,2.88,1.2,2.64,1.44s-.81,4.67-.72,4.8A42.46,42.46,0,0,1,186,80.88l-3.12.48-4.8-1.68Z";
		
		private static final String BLUE_FILL_SVG = "M34.06,103.38a32.36,32.36,0,0,0,8.4,1.68,62.29,62.29,0,0,0,9.12,0,59,59,0,0,0,7.68-.48c2.3-.41,5.81-.74,7.92-1.2S75.1,101,75.1,101a226.52,226.52,0,0,1,7-23.28c1.29-3.41,5.19-13.66,6-15.6S94.33,49,95,47.46s.3-1.64.72-2.64a3.38,3.38,0,0,1,1.92-1.68c.26,0,.78-3.6.48-3.84s-14.4-15.36-14.4-15.36S73.35,13,70.54,10.74s-9.07-6.66-13.2-8.4S52,.29,48.94.18s-2-.46-5.28.24a20.6,20.6,0,0,0-7.2,3.36A126.32,126.32,0,0,0,24,15.54c-2.35,2.79-6.1,7.81-7,9.12s-5.22,6-6.48,8.16a50.88,50.88,0,0,1-6.48,7.44A11.7,11.7,0,0,1,.22,42.42c-1.16.35,2.64,6.24,2.64,6.24S14.61,66,15.58,67.62s6.52,11,7.2,12.72,7.28,13.45,8.4,17.76,1,4.8,1,4.8Z";
		
		private static final String STROKE_SVG = "M16.87,97.73S2,76.83.55,58.61C-.61,44-.2,22.29,4.39,15.17,9.26,7.63,14.11.76,24.55.05S39.43,6.29,39.43,6.29,45.63,18.36,46.15,25s3.8,19.71,6.48,22.32-.16,1.91,6,1.92S69,41.6,70.87,39.17,93.32,6.92,104.71,6.77s11.37,2,15.36,4.32,23.72,21.62,31.68,29.52c6.4,6.36,7,6.48,7,6.48M158,53.09l6.48-30.24s1.22-3.29,3.6-3.84,4.59,2.11,5.52,4.08,4.84,13.1,5.76,19,.4,7.14-1.2,9.12-3.13.84-4.08-.24-3.3-3.8-4.56-10.32c-2.48,1.42-3.09.46-3.36,12M177,29.33s4.29-12.86,7.68-14.16,6.05.73,6.48,1.92,6.08,11.25,5.76,20.64.28,9.25-1.44,11-6-5.12-7-7.68-1.29-6.46-1.44-6.24c-1.35.9-2.92,1.35-3.84,3.6M181.51,58.85A34.93,34.93,0,0,1,190.39,62c3.51,2,54.81,25,60,26.4s13.74,5.64,19.68,7.2,20.54,5.55,23.52,7,4.94,1.79,5.76,3.6-2.4,7.2-2.4,7.2c-8.39-3.65-13.37-6.72-21.36-5.52-8.39.27-35-.11-39.6-.72-4.57-1.15-24-6.09-29-7s-21-.07-25.68-1.2c-4-1-12.72-5.76-12.72-5.76M171.67,101.09s-5.64,20.93-2.4,31c5.75,2.06,6.15-2,13.2-.24s4.89,10.73,3.6,12S178,146.32,176,147.89M166.39,100.85c-1.59,2.74-11.91,29.87-10.32,35.52s13.12,7.32,15.12,8.16,5.18,2.61,5.52,5.52.3,5.54-2.16,7-7.3-1.79-9.36-1.68-15.28-1.93-25.44,0-11.76-.17-13.44-2.4,3.42-41.12,5.28-45.12,3.84-13.68,3.84-13.68M91.27,97c2,6.59,3.15,13,.48,20.4S74.6,129.8,72.07,132.53s-3,10.12-1,12,8.47-.92,12.48.48,4.41,2.89,4.8,4.56.08,7.75-1.44,9.84-7,.13-9.36-1-11.84-2.2-16.8-1.2-15.85,2.48-21.36,1.44-4-11.1-3.12-12.48,16.38-38.41,16.32-44.16M97.51,117.89c.15,3.26-5.52,16.8-5.52,16.8,4,.87,5.83,1.28,7.92,4.08s.51,7.66-.72,8.88-10.32,1.2-10.32,1.2M16.87,77.57s3.5,13.78,10.56,23.52M28.63,88.13c1,3.81,4.11,12.23,6.72,14.4M39.43,93.89a25.48,25.48,0,0,0,8.16,13.44M165.43,63.65c0,3.42,3.41,8.63,5.28,10.56a44.56,44.56,0,0,0,8.88,6.72c2.72,1.4,6.77.31,7.68-.72s2-6.08,1.44-7.68c-2.82-1.55-6.15-2.84-8.64-4.56s-5.41-4.66-8.16-5.28-2.84-1-4.56-.48S165.43,63.65,165.43,63.65ZM183.43,69.89s-1.42,4.45,2.88,10.8";
		
		private static final String YELLOW_FILL_SVG_ABSOLUTE = "M19.92,85.68L17.28,97.92L4.56,76.8L0,53.28L1,31L8,9.879999999999999L18.24,1.2L31.2,0L38.2,5L44.2,17L47.800000000000004,33.32L52.36000000000001,46.32L56.2,49.2L60.760000000000005,50.2L65.08000000000001,51.2L82.08000000000001,80.96000000000001L93.08000000000001,105.96000000000001L93.80000000000001,110.52000000000001L97.64000000000001,115.80000000000001L96.48,125L93.84,130.76L92.64,134.84L98.16,137L100.8,140.84L99.8,145.4L96.67999999999999,148.76000000000002L89,149.24L88,156.44L86.56,160.04H83.28L76.28,158.35999999999999L70.52,157.16H64.32L58.31999999999999,157.4L50.16,158.6L41.76,158.84L36.48,156.20000000000002L36.72,150.44000000000003L39.6,140.12000000000003L44.88,126.20000000000003L51.6,108.68000000000004L48.480000000000004,107.48000000000003L45.6,105.32000000000004L42.72,101.48000000000003L40.56,97.40000000000003L39.56,95.24000000000004L35.480000000000004,102.24000000000004L30,91.68L27.36,99.6ZM127.92,155L139.92000000000002,155.72L154.08,154.52L168,156.24L174.24,156.96L176.4,154.08L176.88,147.60000000000002L183.6,145.20000000000002L187.44,142.08L187.2,138.24L184.56,132.48000000000002L177.56,131.76000000000002L172.04,132.76000000000002L168.67999999999998,131.56000000000003L169,121.2L169.72,110.4L171.16,103.68L173.56,96L182.44,99.12H191L201.8,99.60000000000001L211.2,101L219.6,103.4L236.16,106.76L267.15999999999997,107.76L283.47999999999996,108.24000000000001L296.2,113.04L299.56,108.72L298.12,105.12L285.12,100.12L257.28000000000003,91.48L225.84000000000003,78.48L205.68000000000004,69.12L194.88000000000002,64.12L182.4,59S177.6,56.5,175.68,53.72S176.68,52.04,176.68,52.04L180,49.44V44.44L183.36,39.16S186.36,35.9,186.48000000000002,36.04S191.76000000000002,46.6,191.76000000000002,46.6L195.36,48.760000000000005L196.8,46.60000000000001L196.56,33.88000000000001L193.68,21.40000000000001L189.6,15.88000000000001L185,15.6L180.68,20.88L178.28,27.599999999999998L175.64000000000001,26.159999999999997L171.56,21.159999999999997L167,19.44L165.6,24L162,34.8L159.84,45.599999999999994L154.84,47.279999999999994L134.4,97L131.28,113.56L127.44,133L127.2,144.76ZM170.4,73.92L167.28,69.12L166.08,64.80000000000001L167.28,62.40000000000001H170.88L175.88,64.56000000000002L179.48,67.20000000000002L184.04,70.08000000000001L186.92,71.28000000000002L189.55999999999997,72.72000000000001S188.74999999999997,77.39000000000001,188.83999999999997,77.52000000000001A42.46,42.46,0,0,1,186,80.88L182.88,81.36L178.07999999999998,79.67999999999999Z";
		
		private static final String BLUE_FILL_SVG_ABSOLUTE = "M34.06,103.38A32.36,32.36,0,0,0,42.46,105.06A62.29,62.29,0,0,0,51.58,105.06A59,59,0,0,0,59.26,104.58C61.559999999999995,104.17,65.07,103.84,67.17999999999999,103.38S75.1,101,75.1,101A226.52,226.52,0,0,1,82.1,77.72C83.39,74.31,87.28999999999999,64.06,88.1,62.12S94.33,49,95,47.46S95.3,45.82,95.72,44.82A3.38,3.38,0,0,1,97.64,43.14C97.9,43.14,98.42,39.54,98.12,39.3S83.72,23.939999999999998,83.72,23.939999999999998S73.35,13,70.54,10.74S61.470000000000006,4.08,57.34,2.34S52,0.29,48.94,0.18S46.94,-0.28,43.66,0.42A20.6,20.6,0,0,0,36.459999999999994,3.78A126.32,126.32,0,0,0,24,15.54C21.65,18.33,17.9,23.349999999999998,17,24.659999999999997S11.780000000000001,30.659999999999997,10.52,32.81999999999999A50.88,50.88,0,0,1,4.039999999999999,40.25999999999999A11.7,11.7,0,0,1,0.22,42.42C-0.94,42.77,2.8600000000000003,48.660000000000004,2.8600000000000003,48.660000000000004S14.61,66,15.58,67.62S22.1,78.62,22.78,80.34S30.060000000000002,93.79,31.18,98.10000000000001S32.18,102.9,32.18,102.9Z";
		
		private static final String STROKE_SVG_ABSOLUTE = "M16.87,97.73S2,76.83,0.55,58.61C-0.61,44,-0.2,22.29,4.39,15.17C9.26,7.63,14.11,0.76,24.55,0.05S39.43,6.29,39.43,6.29S45.63,18.36,46.15,25S49.949999999999996,44.71,52.629999999999995,47.32S52.47,49.23,58.629999999999995,49.24S69,41.6,70.87,39.17S93.32,6.92,104.71,6.77S116.08,8.77,120.07,11.09S143.79,32.71,151.75,40.61C158.15,46.97,158.75,47.09,158.75,47.09M158,53.09L164.48,22.850000000000005S165.7,19.560000000000006,168.07999999999998,19.010000000000005S172.67,21.120000000000005,173.6,23.090000000000003S178.44,36.190000000000005,179.35999999999999,42.09S179.76,49.230000000000004,178.16,51.21S175.03,52.050000000000004,174.07999999999998,50.97S170.77999999999997,47.17,169.51999999999998,40.65C167.04,42.07,166.42999999999998,41.11,166.15999999999997,52.65M177,29.33S181.29,16.47,184.68,15.169999999999998S190.73000000000002,15.899999999999999,191.16,17.089999999999996S197.24,28.339999999999996,196.92,37.73S197.2,46.98,195.48,48.73S189.48,43.61,188.48,41.05S187.19,34.589999999999996,187.04,34.809999999999995C185.69,35.709999999999994,184.12,36.16,183.2,38.41M181.51,58.85A34.93,34.93,0,0,1,190.39,62C193.89999999999998,64,245.2,87,250.39,88.4S264.13,94.04,270.07,95.60000000000001S290.61,101.15,293.59,102.60000000000001S298.53,104.39000000000001,299.34999999999997,106.2S296.95,113.4,296.95,113.4C288.56,109.75,283.58,106.68,275.59,107.88000000000001C267.2,108.15,240.58999999999997,107.77000000000001,235.98999999999998,107.16000000000001C231.42,106.01,211.98999999999998,101.07000000000001,206.98999999999998,100.16000000000001S185.98999999999998,100.09000000000002,181.30999999999997,98.96000000000001C177.30999999999997,97.96000000000001,168.58999999999997,93.2,168.58999999999997,93.2M171.67,101.09S166.03,122.02000000000001,169.26999999999998,132.09C175.01999999999998,134.15,175.42,130.09,182.46999999999997,131.85S187.35999999999996,142.57999999999998,186.06999999999996,143.85S178,146.32,176,147.89M166.39,100.85C164.79999999999998,103.58999999999999,154.48,130.72,156.07,136.37S169.19,143.69,171.19,144.53S176.37,147.14000000000001,176.71,150.05S177.01000000000002,155.59,174.55,157.05S167.25,155.26000000000002,165.19,155.37S149.91,153.44,139.75,155.37S127.99,155.20000000000002,126.31,152.97S129.73,111.85,131.59,107.85S135.43,94.16999999999999,135.43,94.16999999999999M91.27,97C93.27,103.59,94.42,110,91.75,117.4S74.6,129.8,72.07,132.53S69.07,142.65,71.07,144.53S79.53999999999999,143.61,83.55,145.01S87.96,147.89999999999998,88.35,149.57S88.42999999999999,157.32,86.91,159.41S79.91,159.54,77.55,158.41S65.71,156.21,60.75,157.21S44.9,159.69,39.39,158.65S35.39,147.55,36.27,146.17000000000002S52.650000000000006,107.76000000000002,52.59,102.01000000000002M97.51,117.89C97.66000000000001,121.15,91.99000000000001,134.69,91.99000000000001,134.69C95.99000000000001,135.56,97.82000000000001,135.97,99.91000000000001,138.77S100.42000000000002,146.43,99.19000000000001,147.65S88.87,148.85,88.87,148.85M16.87,77.57S20.37,91.35,27.43,101.08999999999999M28.63,88.13C29.63,91.94,32.74,100.36,35.35,102.53M39.43,93.89A25.48,25.48,0,0,0,47.59,107.33M165.43,63.65C165.43,67.07,168.84,72.28,170.71,74.21A44.56,44.56,0,0,0,179.59,80.92999999999999C182.31,82.33,186.36,81.24,187.27,80.21S189.27,74.13,188.71,72.53C185.89000000000001,70.98,182.56,69.69,180.07,67.97S174.66,63.31,171.91,62.69S169.07,61.69,167.35,62.21S165.43,63.65,165.43,63.65ZM183.43,69.89S182.01000000000002,74.34,186.31,80.69";
		
		private ArrayList<Instruction> yellowFillInstructions = new ArrayList<>();
		private ArrayList<Instruction> blueFillInstructions = new ArrayList<>();
		private ArrayList<Instruction> strokeInstructions = new ArrayList<>();
		
		private Path2D.Double yellowFillPath;
		private Path2D.Double blueFillPath;
		private Path2D.Double strokePath;
		
		public RealisticUCI() {
			this(0,0);
		}
	
		public RealisticUCI(int x, int y) {
			//240 px long
			AffineTransform translation = new AffineTransform(0.8, 0.0, 0.0, 0.8, x, y);
			
			parseSVG(YELLOW_FILL_SVG_ABSOLUTE, yellowFillInstructions);
			parseSVG(BLUE_FILL_SVG_ABSOLUTE, blueFillInstructions);
			parseSVG(STROKE_SVG_ABSOLUTE, strokeInstructions);
			
			//System.out.println(strokeInstructions.toString());
			yellowFillPath = buildPathFromInstructions(yellowFillInstructions);
			blueFillPath = buildPathFromInstructions(blueFillInstructions);
			blueFillPath.transform(new AffineTransform(1.0, 0.0, 0.0, 1.0, 59.115, 6.234));
			strokePath = buildPathFromInstructions(strokeInstructions);
			
			//translate the aardvark to the specified coordinates
			yellowFillPath.transform(translation);
			blueFillPath.transform(translation);
			strokePath.transform(translation);
		}

		public static double[] extractPoints(String points) {
			
			// example point string: 82.567,0,86,42.212,86,86
			
			String[] pointsStringArray = points.replace(',', ' ').replaceAll("(?<!\\A)-", " -").split("\\s+"); //TODO add handling for negative exponents
			
			double[] pointsDoubleArray = new double[pointsStringArray.length];
			
			for (int i = 0; i < pointsStringArray.length; i++) {
				
				pointsDoubleArray[i] = Double.parseDouble(pointsStringArray[i]); //TODO add possibility of NumberFormatException
				
			}
			
			return pointsDoubleArray;
			
		}
		
		public static double[] extractFormattedPoints(String points) {
			
			if (points.isEmpty()) { return null; }
			
			String[] pointsStringArray = points.split(","); //TODO add handling for negative exponents
			
			double[] pointsDoubleArray = new double[pointsStringArray.length];
			
			for (int i = 0; i < pointsStringArray.length; i++) {
				
				pointsDoubleArray[i] = Double.parseDouble(pointsStringArray[i]); //TODO add possibility of NumberFormatException
				
			}
			
			return pointsDoubleArray;
			
		}
		
		
		public void parseSVG(String svg, ArrayList<Instruction> list) {
			
			char[] svgChars = svg.toCharArray();
			int index = 0;
			
			for (int i = 1; i < svgChars.length; i++) {
				
				if (Character.isLetter(svgChars[i])) {
					char instructionType = svg.charAt(index);
					String points = svg.substring(index + 1, i);
					
					try {
					list.add(new Instruction(instructionType, extractFormattedPoints(points)));
					} catch (NumberFormatException e) {
						System.out.println(index);
						e.printStackTrace();
					}
					index = i;
				}
				
			}
			
		}
		
		public Path2D.Double buildPathFromInstructions(ArrayList<Instruction> list) {
			
			Path2D.Double path = new Path2D.Double();
			Point2D prevControlPoint = new Point2D.Double();
			Point2D prevPoint = new Point2D.Double();
			
			for (ListIterator<Instruction> iter = list.listIterator(); iter.hasNext(); ) {
				Instruction instruction = iter.next();
				double[] points = instruction.points;
				
				switch (instruction.instructionType) {
					case 'M': 
						path.moveTo(points[0], points[1]);
						prevControlPoint.setLocation(points[0], points[1]);
						break;
					case 'C':
						path.curveTo(points[0], points[1], 
									 points[2], points[3],
									 points[4], points[5]);
						prevControlPoint.setLocation(points[2], points[3]);
						break;
					case 'S':
						double cx1 = prevControlPoint.getX() + (2 * (prevPoint.getX() - prevControlPoint.getX()));
						double cy1 = prevControlPoint.getY() + (2 * (prevPoint.getY() - prevControlPoint.getY()));
						path.curveTo(cx1, cy1, 
								 	 points[0], points[1],
								 	 points[2], points[3]);
						prevControlPoint.setLocation(points[0], points[1]);
						break;
					case 'A':
						path.lineTo(points[5], points[6]); //temporary solution
						System.out.println("Uh oh, A alert");
						break;
					case 'L':
						path.lineTo(points[0], points[1]);
						break;
					case 'H':
						path.lineTo(points[0], prevPoint.getY());
						prevControlPoint.setLocation(path.getCurrentPoint());
						break;
					case 'V':
						path.lineTo(prevPoint.getX(), points[0]);
						prevControlPoint.setLocation(path.getCurrentPoint());
					case 'Z':
						path.closePath();
						break;
					default:
						System.out.println("Error, unhandled inst: " + instruction.instructionType);
				
				}
			
			prevPoint = path.getCurrentPoint();
			}
			
			return path;
		}
		
		public void draw(Graphics2D g2) {
			
			g2.setPaint(Cartoon.AARDVARK_YELLOW);
			g2.fill(yellowFillPath);
			
			g2.setPaint(Cartoon.AARDVARK_BLUE);
			g2.fill(blueFillPath);
			
			g2.setStroke(new BasicStroke(4));
			g2.draw(strokePath);
			
			//g2.drawLine(240, 0, 240, 100);
			
		}
		
		
		//https://codepen.io/thednp/pen/EgVqLw
	
	}
	
	
}
