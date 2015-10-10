import java.awt.Color;
import gpdraw.*;
public class Tractal
{
    private int scale;
    private Color color;
    
    public Tractal(int scale,Color color)
    {
        this.scale = scale;
        this.color = color;
    }
    
    public void draw(DrawingTool pen)
    {
        int lengthDiv = 1;
        int size = 300;
        for(int i = scale; i>0; i--)
        {
            double triLength = (double)size/lengthDiv;
            Triangle fractTri = new Triangle(triLength,color);
            fractTri.draw(pen);
            pen.turnLeft(90);
            pen.forward(triLength/4);
            pen.turnLeft(90);
            lengthDiv *= 2;
        }
        pen.up();
        pen.home();
        pen.down();
    }
}