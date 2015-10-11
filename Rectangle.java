import java.awt.Color;
import gpdraw.*;
public class Rectangle
{
    private double length;
    private double width;
    private boolean fill;
    private Color color;
    
    public Rectangle(double length,double width,boolean fill,Color color)
    {
        this.length = length;
        this.width = width;
        this.fill = true;
        this.color = color;
    }
    
    public void draw(DrawingTool pen)
    {
        pen.setColor(this.color);
        if(fill==true)
        {
            pen.fillRect(length, width);
        }
        else
        {
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
        return (length*2)+(width*2);
    }
}