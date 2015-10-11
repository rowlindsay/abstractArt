import java.awt.Color;
import gpdraw.*;
public class Art
{
    SketchPad pad = new SketchPad(1920,1080);
    DrawingTool pen = new DrawingTool(pad);
    public void makeArt()
    {
        Color testColor = userColor("red");
        double x = -500;
        double y = 0;
        int i2 = 0;
        pen.up();
        pen.move(x,y);
        pen.down();
        Color drawColor = testColor;
        for(int i=0;i<=2000;i++)
        {
            pen.setColor(drawColor);
            y = 100*Math.sin(0.0628*x);
            pen.up();
            pen.move(x,y);
            pen.down();
            if(i%10==0)
            {
                Sunburst spot = new Sunburst(10,true);
                spot.draw(pen);
            }
            x += 0.5;
        }
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