import java.awt.*;
import javax.swing.JFrame;

// This class contains the game map. Remember to change the pathway as described in the cheatsheet in order to make the image appear correctly after downloading it.

public class DisplayMap extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("/Users/kthodiyil/Downloads/CandylandMap.jpg");
        g.drawImage(i,0,0,this);
    }

}
