import java.awt.Color;
import gpdraw.*;
public class Circle
{
    private double radius;
    private boolean fill;
    private Color color;
    // pre: 
    // post:
    
    public Circle(double radius, boolean fill,Color color)
    {
        this.radius=radius;
        this.fill=true;
        this.color = color;
    }

    public void draw(DrawingTool pen)

    {
        if(fill==true)
        {
            pen.setColor(this.color);
            pen.fillCircle(radius);
        }
        pen.setColor(this.color);
        pen.drawCircle(radius);
    }
    
    public int getPerimeter()
    {
        return (int)(this.radius*6.28);
    }
}