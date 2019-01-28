import java.awt.*;

public class Oval extends Rectangle{
    
    Oval(int x1, int y1, int width, int height){
        super(x1,y1, width, height);
    }
    public void draw(Graphics g){
        g.drawOval(getX1(), getY1(), getWidth(), getHeight());
    }
}