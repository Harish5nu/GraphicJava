package labb6;

import java.awt.Frame;
import java.awt.Graphics;

import lab6.line3;

public class line3 extends Frame {
	line3() {
		setSize(1000, 1000);
		setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(10, 300, 100, 300);
		g.drawLine(10, 310, 100, 310);
		g.drawLine(10, 320, 100, 320);
		
		g.drawLine(350, 300, 440, 300);
		g.drawLine(350, 310, 440, 310);
		g.drawLine( 350, 320, 440,320);
		
		
		g.drawLine(700, 300, 790, 300);
		g.drawLine(700, 310, 790, 310);
		g.drawLine(700, 320, 790, 320);
		
		
		
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new line3();

	}

}
