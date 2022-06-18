import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author benard
 */

public class AnImage extends JPanel{

    /**
     * 
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Image image = new ImageIcon("Images/codebg.jpeg").getImage();
        g2d.drawImage(image, 10, 10, null);
    }
    public static void main(String[] args) {
        AnImage image = new AnImage();
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(image);
        frame.setSize(380, 320);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
