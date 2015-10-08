import java.awt.Color;
import gpdraw.*;
public class Circle
{
    private double radius;
    private boolean fill;
    // pre: 
    // post:
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius, boolean fill)
    {
        this.radius=radius;
        this.fill=true;
    }
    public void draw(DrawingTool pen, Color color)
    {
        if(fill==true)
        {
            pen.setColor(color);
            pen.fillCircle(radius);
        }
        pen.setColor(color);
        pen.drawCircle(radius);
    }
}