import java.io.*;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Invader{
    private Image image;

    Invader(){
        try {
            image = ImageIO.read(new File("./images/invader.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Image getImage(){return image;}
}
