import java.awt.Color;
import gpdraw.*;
public class Triral
{
    //Pre: none
    //Post: a triral is drawn
    public Triral()
    {
    }
    
    public void draw(DrawingTool pen)
    {
        int r = 255;
        int g = 0;
        int b = 0;
        for(int i=360;i>0;i--)
        { 
            Color drawColor = new Color(r,g,b);
            pen.turnRight(1);
            double randLength = (double)(Math.random()*360);
            Triangle testTri= new Triangle(randLength);
            testTri.draw(pen, drawColor);
            r--;
            g++;
            b++;
        }
    }
}
