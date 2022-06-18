import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.security.PublicKey;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import org.w3c.dom.events.MouseEvent;
public static void main(String[] args) {

public class DrawingPanel extends MouseInputAdapter implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JLabel statusbar;
    private Graphics g;

    public DrawingPanel(int width, int height){
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        g = image.getGraphics();
        g.setColor(Color.BLACK);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(image));
        panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(width, height));
        panel.add(label);

        statusbar = new JLabel(" ");

        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);

        frame = new JFrame("Drawing Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(statusbar, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

        Timer timer = new Timer(250, this);
        timer.start();
    }

    public Graphics getGraphics(){
        return g;
    }

    public void setBackground(Color c){
        panel.setBackground(C);
    }

    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }

    public void actionPerformed(ActionEvent e){
        panel.repaint();
    }

    public void mouseMoved(MouseEvent e){
        statusbar.setText("(" + e.getX() + ", " + e.getY() + ")");
    }
}
