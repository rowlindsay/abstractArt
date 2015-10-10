import java.awt.Color;
import gpdraw.*;
public class Tractal
{
    public Tractal()
    {
    }
    
    public void draw(int scale, Color drawColor,DrawingTool pen)
    {
        int lengthDiv = 1;
        int size = 300;
        for(int i = scale; i>0; i--)
        {
            double triLength = (double)size/lengthDiv;
            Triangle fractTri = new Triangle(triLength);
            fractTri.draw(pen,drawColor);
            pen.turnLeft(90);
            pen.forward(triLength/4);
            pen.turnLeft(90);
            lengthDiv *= 2;
        }
        pen.home();
    }
}