import java.awt.Color;
import gpdraw.*;
public class Art
{
    SketchPad pad = new SketchPad(1920,1080);
    DrawingTool pen = new DrawingTool(pad);
    public void makeArt()
    {
    }
    
    public void drawCircSwirl()
    {
        Color testColor = Color.red;
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
                Circle dot = new Circle(Math.random()*10,false,drawColor);
                dot.draw(pen);
                drawColor = setRainColor(i/6,drawColor);
            }
            x += 0.5;
        }
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