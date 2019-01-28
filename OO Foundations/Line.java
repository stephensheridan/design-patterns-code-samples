import java.awt.*;

public class Line extends Point{
    private int x2; // X endpoint coord
    private int y2; // y endpoint coord

    Line(int x1, int y1, int x2, int y2){
        super(x1,y1); // Set the parent classes x1, y1
        this.x2 = x2; // Set this classes x2
        this.y2 = y2; // Set this classes y2
    }
    public void setX2(int x2){this.x2 = x2;}
    public void setY2(int y2){this.y2 = y2;}
    public int getX2(){return this.x2;}
    public int getY2(){return this.y2;}
    public void draw(Graphics g){
        g.drawLine(getX1(),getY1(),getX2(),getY2());
    }


}