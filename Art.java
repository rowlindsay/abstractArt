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
    
    public void testFractal(double size,double level)
    {
        Triangle tri1 = new Triangle(size,Color.black);
        tri1.draw(pen);
        double height = (Math.tan(Math.PI/3))*(size/4);
        pen.up();
        pen.forward(height);
        pen.turn(180);
        pen.down();
        for(int i = (int)level; i>=1; i--)
        {
            Color drawColor = setRainColor2(i);
            Triangle tri2 = new Triangle(size/2,drawColor);
            tri2.draw(pen);
            size /= 2;
            double moveHeight = (Math.tan(Math.PI/3))*(size/4);
            pen.up();
            pen.forward(moveHeight);
            pen.turnLeft(90);
            pen.forward(size/2);
            pen.turnRight(90);
            pen.down();
        }
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
    
    static Color setRainColor2(int i)
    {
        Color newColor = Color.black; 
        if(i==10||i==4)
            newColor = Color.red;
        else if(i==9||i==3)
            newColor = Color.orange;
        else if(i==8||i==2)
            newColor = Color.yellow;
        else if(i==7||i==2)
            newColor = Color.green;
        else if(i==6)
            newColor = Color.blue;
        else if(i==5)
            newColor = Color.magenta;
        return newColor;
    }
}