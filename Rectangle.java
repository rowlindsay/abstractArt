import java.awt.Color;
import gpdraw.*;
public class Rectangle
{
    private double length;
    private double width;
    private boolean fill;
    
    public Rectangle(double length,double width)
    {
        this.length = length;
        this.width = width;
        this.fill = false;
    }
    
    public Rectangle(double length,double width,boolean fill)
    {
        this.length = length;
        this.width = width;
        this.fill = true;
    }
    
    public void draw(DrawingTool pen, Color color)
    {
        if(fill==true)
        {
            pen.setColor(color);
            pen.fillRect(length, width);
        }
        else
        {
            pen.setColor(color);
            pen.forward(length);
            pen.turnRight(90);
            pen.forward(width);
            pen.turnRight(90);
            pen.forward(length);
            pen.turnRight(90);
            pen.forward(width);
            pen.turnRight(90);
        }
    }
    public double getPerimeter()
    {
        return length*2+(width*2);
    }
}