import javax.naming.Referenceable;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;

public class WindowMaker {
    
    public JFrame IWantWindow( String name) {
        JFrame frame = new JFrame();
        frame.setSize(150,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(name);
        frame.setVisible(true);

        ImageIcon logoicon = new ImageIcon("Icon.png");
        Image logo = logoicon.getImage();
        frame.setIconImage(logo);
        return frame;
    }
}
