import java.awt.*;
import javax.swing.JFrame;

public class DisplayImage extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("/Users/kthodiyil/Downloads/CandylandMap.png");
        g.drawImage(i,0,0,this);
    }

    // public static void main(String[] args) {
    //     DisplayImage img = new DisplayImage();
    //     JFrame f = new JFrame();
    //     f.add(img);
    //     f.setSize(1025, 750);
    //     f.setVisible(true);
    // }

}
