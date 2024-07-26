package labb6;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;



public class flag  extends Frame
{
	flag(){
		setSize(1000, 1000);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		
		super.paint(g);
		g.setColor(Color.RED);
		g.drawLine(100,  100,100,700 );
		g.drawLine(100,  100,390,300 );
		g.drawLine(390,  300,150,300 );
		g.drawLine(150, 300,450,600 );
		g.drawLine(450, 600,100,600 );
		
		
	}
	public static void main(String[] args)
	
	{
		new flag();
		
	}
	
}
