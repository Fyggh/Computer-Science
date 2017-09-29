/**
 * 
 */
package io.github.fyggh.flag;

import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * @author Fyggh
 *
 */
public class MouseDemo extends JPanel implements MouseListener {

	/**
	 * 
	 */
	public MouseDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param layout
	 */
	public MouseDemo(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
		addMouseListener(this);
	}

	/**
	 * @param isDoubleBuffered
	 */
	public MouseDemo(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param layout
	 * @param isDoubleBuffered
	 */
	public MouseDemo(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
