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
        int size = 150;
        for(int i = scale; i>0; i--)
        {
            double triLength = (double)size/lengthDiv;
            pen.setColor(this.color);
            Triangle fractTri = new Triangle(triLength,color);
            fractTri.draw(pen);
            pen.turnLeft(90);
            pen.forward(triLength/4);
            pen.turnLeft(90);
            lengthDiv *= 2;
        }
    }
}