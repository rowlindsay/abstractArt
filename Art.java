import java.awt.Color;
import gpdraw.*;
public class Art
{
    SketchPad pad = new SketchPad(1920,1080);
    DrawingTool pen = new DrawingTool(pad);
    public void makeArt()
    {
        Triral idk = new Triral();
        idk.draw(pen);
        //drawFractal(10,drawColor);
    }
    
    public void makeSunburst(boolean rainbow)
    {
        Color drawColor = Color.red;
        for (int degree=0; degree<360; degree++) //Run until 360 degrees are covered
        {
            if(rainbow)
                drawColor = setRainColor(degree,drawColor);
            pen.setColor(drawColor);
            pen.forward(250);
            pen.turn(180);
            pen.up();
            pen.forward(250);
            pen.turnRight(179);
            pen.down();         //Make a line then rotate to the next degree (counter clockwise)
        }
    }
    
    public void drawFractals()
    {
       
    }
    
   
    public Color userColor(String color)
    {
        if(color.equals("black"))
            return Color.black;
        else if(color.equals("blue"))
            return Color.blue;
        else if(color.equals("green"))
            return Color.green;
        else if(color.equals("cyan"))
            return Color.cyan;
        else if(color.equals("red"))
            return Color.red;
        else if(color.equals("magenta"))
            return Color.magenta;
        else if(color.equals("yellow"))
            return Color.yellow;
        else if(color.equals("white"))
            return Color.white;
        else if(color.equals("pink"))
            return Color.pink;
        else if(color.equals("orange"))
            return Color.orange;
        else
            return Color.black;
    }
    
    static Color setRainColor(int i,Color curCol)
    {
        int r = curCol.getRed();
        int g = curCol.getGreen();
        int b = curCol.getBlue();
        if(i<60)
        {
            g += (int)(165/60);
        }
        else if(i<120)
        {
            g += (int)(90/60);
        }
        else if(i<180)
        {
            r -= (int)(205/60);
            g -= (int)(50/60);
            b += (int)(50/60);
        }
        else if(i<240)
        {
           r -= (int)(50/60);
           g -= (int)(205/60);
           b += (int)(205/60);
        }
        else if(i<300)
        {
           r += (int)(160/60);
           g += (int)(32/60);
           b -= (int)(15/60);
        }
        Color newColor = new Color(r,g,b);
        return newColor;
    }
}