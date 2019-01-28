import java.applet.*;
import java.awt.*;
import java.util.*;

public class MyCanvas extends Applet{

    private ArrayList<Point> picture = new ArrayList<Point>(10);

    public void init () {
        // Construct shapes
        Point p = new Point(10,10);
        Line l1 = new Line(20,20,40,40);
        Line l2 = new Line(40,20,20,40);
        Rectangle r1 = new Rectangle(200,50,100,40);
        Rectangle r2 = new Rectangle(40,50,20,20);
        Oval o1 = new Oval(100,120,40,40);
        Oval o2 = new Oval(200,120,45,30);

        Point[] polyPoints = {new Point(350,150), new Point(400,190), new Point(300,190)};
        Polygon p1 = new Polygon(polyPoints);
        // Add the shapes to the picture
        picture.add(p);
        picture.add(l1);
        picture.add(l2);
        picture.add(r1);
        picture.add(r2);
        picture.add(o1);
        picture.add(o2);
        picture.add(p1);
    }
    public void paint (Graphics g) {
        //Iterating ArrayList to paint the picture
        for(Point p:picture){
            // Polymorphism happening here
            // draw method will bind at runtime
            p.draw(g);    
        }
            
    }
}
