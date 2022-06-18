import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author benard
 */

public class Text extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, 
        RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        g2d.setRenderingHints(rh);
        Font font = new Font("URW Chancery L", Font.BOLD, 21);
        g2d.setFont(font);
        g2d.drawString("Reasons why I love you one,", 20, 30);
        g2d.drawString("you light up my day you are my sun.",20, 60);
        g2d.drawString("Reasons why I love you two,",20, 90);
        g2d.drawString("I cannot get enough of you",20, 120);
        g2d.drawString("Reasons why I love you three,", 20, 150);
        g2d.drawString("I know that you'll be true to me", 20, 180);
        g2d.drawString("Reason why I will stay with you,", 20, 210);
        g2d.drawString("I know you love me too.", 20, 240);
        g2d.drawString("Reasons why I love you four,", 20, 270);
        g2d.drawString("I know you love me too", 20, 300);
        g2d.drawString("As the june light turns to  moonlight I'll be on my way'", 20, 330);
        //g2d.drawString("That wear this world out to the ending doom.", 20, 360);
        //g2d.drawString("So, till the judgment that yourself arise,", 20, 390);
        //g2d.drawString("You live in this, and dwell in lovers' eyes.", 20, 420);
    }
    public static void main(String[] args) {
        Text text = new Text();
        JFrame frame = new JFrame("Some lyrics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(text);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

