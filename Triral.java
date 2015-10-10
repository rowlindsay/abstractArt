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
            Triangle testTri= new Triangle(75,drawColor);
            testTri.draw(pen);
            pen.turnRight(1);
        }
    }
}
