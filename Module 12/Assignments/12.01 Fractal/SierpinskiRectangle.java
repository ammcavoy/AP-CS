/**
 * This class draws a Sierpinski Triangle.
 * 
 * @version 01/24
 */
import java.applet.Applet;
import java.awt.*;

public class SierpinskiRectangle extends Applet
{
    public void drawSierpinskiTriangle(Graphics canvas)
    {
            //canvas.drawRect(x,y,width,height);
            canvas.drawRect(50,50,250,400);
            canvas.drawRect(50,50,150,400);
            canvas.setColor(Color.yellow);
            canvas.fillRect(50,50,50,100);
    }
    
    public void paint(Graphics g)
    {
        drawSierpinskiTriangle(g);
    }
}

