import java.awt.*;
import javax.swing.JFrame;

public class DisplayMap extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("/Users/kthodiyil/Downloads/CandylandMap.jpg");
        //Image i = t.getImage("/Users/kthodiyil/Downloads/cat.gif");
        g.drawImage(i,0,0,this);
    }

    // public static void main(String[] args) {
    //     DisplayMap img = new DisplayMap();
    //     JFrame f = new JFrame();
    //     f.add(img);
    //     f.setSize(1024, 768);
    //     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the window on exit
    //     f.setVisible(true);
    // }

}
