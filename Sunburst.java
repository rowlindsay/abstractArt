import java.awt.Color;
import gpdraw.*;
public class Sunburst
{
    public Sunburst()
    {
    }
    
    public void draw(boolean rainbow,DrawingTool pen)
    {
        Color drawColor = Color.red;
        for (int degree=0; degree<360; degree++) //Run until 360 degrees are covered
        {
            if(rainbow)
                drawColor = Art.setRainColor(degree,drawColor);
            pen.setColor(drawColor);
            pen.forward(250);
            pen.turn(180);
            pen.up();
            pen.forward(250);
            pen.turnRight(179);
            pen.down();         //Make a line then rotate to the next degree (counter clockwise)
        }
    }
}