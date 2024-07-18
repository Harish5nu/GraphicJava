

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
public class PACMAN extends Frame
{
    PACMAN()
    {
        setSize(500,500);
        setVisible(true);

    }
    @Override
    public void paint(Graphics g)
    {

        g.drawString("PACMAN",10,50);
        super.paint(g);
        g.fillArc(150,100,100,100,20,325);
        g.setColor(Color.BLUE);
        g.fillArc(250,145,10,10,0,360);
        g.fillArc(260,145,10,10,0,360);
        g.fillArc(270,145,10,10,0,360);
        g.fillArc(280,145,10,10,0,360);
        g.fillArc(290,145,10,10,0,360);
        g.fillArc(300,145,10,10,0,360);



    }
    public static void main(String[] args) {
        new PACMAN();


    }

}