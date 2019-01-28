import java.awt.*;

public class Rectangle extends Point{
    private int width;
    private int height;
    Rectangle(int x1, int y1, int width, int height){
        super(x1,y1);
        this.width = width;
        this.height = height;
    }
    public void setWidth(int width){this.width = width;}
    public void setHeight(int height){this.height = height;}
    public int getWidth(){return this.width;}
    public int getHeight(){return this.height;}
    public void draw(Graphics g){
        g.drawRect(getX1(), getY1(), getWidth(), getHeight());
    }
}