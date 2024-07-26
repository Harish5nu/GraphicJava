package labb6;

import java.awt.Frame;
import java.awt.Graphics;

public class Twotriangle extends Frame{
  public Twotriangle() {
	// TODO Auto-generated constructor stub
	
	  setSize(500,500);
	  
	  setVisible(true);
  }

  public void paint (Graphics g)
  {
	//  System.out.println("hello");
	  super.paint(g);
 g.drawLine(300, 300, 500, 300);
 g.drawLine(500, 300, 398, 600);
 g.drawLine(300, 300, 398, 600);
 
 g.drawLine(398, 600, 500, 900);
 g.drawLine(398, 600, 300, 900);
g.drawLine(300, 900, 500, 900);
 
// g.drawLine(400, 500, 500, 660);
 //g.drawLine(500, 660, 300, 660);
 //g.drawLine(400, 500, 300, 660);
 
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Twotriangle();
	}

}

