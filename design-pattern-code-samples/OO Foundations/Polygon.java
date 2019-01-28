import java.awt.*;

public class Polygon extends Point{
    private Point[] points;
    Polygon(Point[] points){
        super();
        this.points = points;
    }
    public void draw(Graphics g){
        int nPoints = this.points.length;
        int[] x_coords = new int[nPoints];
        int[] y_coords = new int[nPoints];
        for(int i = 0; i < nPoints; i++){
            x_coords[i] = this.points[i].getX1();
            y_coords[i] = this.points[i].getY1();
        }
        g.drawPolygon(x_coords, y_coords, nPoints);


    }
}