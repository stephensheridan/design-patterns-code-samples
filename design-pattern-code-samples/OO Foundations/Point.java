import java.io.*;
import java.awt.*;

public class Point{
    private int x1;
    private int y1;
    private final int POINT_SIZE = 3;
    Point(){}
    Point(int x1, int y1){this.x1 = x1; this.y1 = y1;}

    public void setX(int x1){this.x1 = x1;}
    public void setY(int y1){this.y1 = y1;}
    public int getX1(){return this.x1;}
    public int getY1(){return this.y1;}
    public void draw(Graphics g){
        g.fillOval(getX1(), getY1(), POINT_SIZE, POINT_SIZE);
    }

    public static void main(String args[]) {

    }
}
