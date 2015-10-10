import gpdraw.*;
import java.awt.Color;
public class Triangle
{
    private double length;
    private Color color;
    
    public Triangle(double length,Color color)
    {
        this.length = length;
        this.color = color;
    }
    
    public void draw(DrawingTool pen)
    {
        pen.setColor(this.color);
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