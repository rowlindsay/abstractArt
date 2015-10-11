import java.awt.Color;
import gpdraw.*;
public class Sunburst
{
    private boolean rainbow;
    private int radius;
    public Sunburst()
    {
        this.rainbow = false;
        this.radius = 250;
    }
    
    public Sunburst(int radius,boolean rainbow)
    {
        this.rainbow = rainbow;
        this.radius = radius;
    }
    
    public void draw(DrawingTool pen)
    {
        Color drawColor = Color.red;
        for (int degree=0; degree<360; degree++) //Run until 360 degrees are covered
        {
            if(this.rainbow)
                drawColor = Art.setRainColor(degree,drawColor);
            pen.setColor(drawColor);
            pen.forward(this.radius);
            pen.turn(180);
            pen.up();
            pen.forward(this.radius);
            pen.turnRight(179);
            pen.down();         //Make a line then rotate to the next degree (counter clockwise)
        }
    }
    
    public int getPerimeter()
    {
        return(250*360);
    }
}