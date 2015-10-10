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
        Color drawColor = Color.red;
        for(int i=0;i<=360;i++)
        { 
            drawColor = Art.setRainColor(i,drawColor);
            pen.turnRight(1);
            double randLength = (double)(Math.random()*360);
            Triangle testTri= new Triangle(randLength,drawColor);
            testTri.draw(pen);
        }
    }
}
