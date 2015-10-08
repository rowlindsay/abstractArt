import gpdraw.*;
import java.awt.Color;
public class Triangle
{
    private double length;
    
    public Triangle(double length)
    {
        this.length = length;
    }
    
    public void draw(DrawingTool pen, Color color)
    {
        pen.setColor(color);
        pen.turnLeft(90);
        pen.forward(length/2);
        pen.turnRight(120);
        pen.forward(length);
        pen.turnRight(120);
        pen.forward(length);
        pen.turnRight(120);
        pen.forward(length/2);
        pen.turnRight(90);
    }
    
    public double getPerimeter()
    {
        return (length*3);
    }
}