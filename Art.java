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
    
    public void drawFractal(int scale, Color drawColor)
    {
        int lengthDiv = 1;
        int size = 300;
        for(int i = scale; i>0; i--)
        {
            double triLength = (double)size/lengthDiv;
            Triangle fractTri = new Triangle(triLength);
            fractTri.draw(pen,drawColor);
            pen.turnLeft(90);
            pen.forward(triLength/4);
            pen.turnLeft(90);
            lengthDiv *= 2;
        }
        pen.home();
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
}