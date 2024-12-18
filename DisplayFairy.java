import java.awt.*;
import javax.swing.JFrame;

public class DisplayFairy extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("/Users/kthodiyil/Downloads/magicalFairy.gif");
        g.drawImage(i,0,0,this);
    }

    public static void main(String[] args) {
        DisplayFairy img = new DisplayFairy();
        JFrame f = new JFrame();
        f.add(img);
        f.setSize(165, 211);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the window on exit
        f.setVisible(true);
    }

}
