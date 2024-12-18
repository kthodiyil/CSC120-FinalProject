import java.awt.*;
import javax.swing.JFrame;

// This class contains the fairy gif. Remember to change the pathway as described in the cheatsheet in order to make the image appear correctly after downloading it.

public class DisplayFairy extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("/Users/kthodiyil/Downloads/magicalFairy.gif");
        g.drawImage(i,0,0,this);
    }


}
