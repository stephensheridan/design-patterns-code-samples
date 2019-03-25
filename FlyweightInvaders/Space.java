import java.awt.*;
import javax.swing.*;

public class Space extends JApplet{
    private Invader theInvader;
    private Image offScreen;
    private Graphics2D buffer;
    private InvaderFactory invaderFactory;
    private final int NUM_INVADERS = 80;
    private final int HSPACE = 60;
    private final int VSPACE = 60;
    private final int START_X = 10;
    private final int START_Y = 10;
    private final int INVADER_WIDTH = 60;

    public void init(){
        invaderFactory = new InvaderFactory();
        theInvader = invaderFactory.getInvader();
    }

    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        offScreen = createImage(getSize().width, getSize().height);
        buffer = (Graphics2D)offScreen.getGraphics();
        buffer.clearRect(0, 0, getSize().width, getSize().height);

        int x_offset = 0;
        int y_offset = 0;
        for(int i = 0; i < NUM_INVADERS; i++){
            buffer.drawImage(theInvader.getImage(), START_X + x_offset, START_Y + y_offset, this);
            x_offset = x_offset + HSPACE;
            if (x_offset > (getSize().width - INVADER_WIDTH)){
                x_offset = 0;
                y_offset = y_offset + VSPACE;
            }
        }
        g.drawImage(offScreen,0,0,this);
    }
    public static void main(String[] args){
        Space game = new Space();
    }
}
