import java.awt.Color;
import gpdraw.*;
public class Art
{
    SketchPad pad = new SketchPad(1920,1080);
    DrawingTool pen = new DrawingTool(pad);
    public void makeArt()
    {
       drawTractLoop(180,10);
    }
    
    public void drawTractLoop(int radius,int tractalScale)
    {
        Color testColor = Color.red;
        for(int i=0;i<=360;i++)
        {
            pen.up();
            pen.forward(radius);
            pen.down();
            Tractal fun = new Tractal(tractalScale,testColor);
            fun.draw(pen);
            testColor = setRainColor(i,testColor);
            pen.home();
            pen.setDirection(90-i);
        }
    }
    
    public void drawCircSwirl(int xInit,int yInit)
    {
        double x = xInit;
        double y = yInit;
        int i2 = 0;
        pen.up();
        pen.move(x,y);
        pen.down();
        Color drawColor = Color.red;
        for(int i=0;i<=2000;i++)
        {
            pen.setColor(drawColor);
            y = yInit+(100*Math.sin(0.0628*x));
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