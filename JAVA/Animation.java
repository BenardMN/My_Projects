import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Animation extends JPanel implements ActionListener{
    private Point p1, p2;
    private int dx, dy;
    public Animation(){
        p1 = new Point(20, 40);
        p2 = new Point(60, 10);
        dx = 5;
        dy = 5;

        Timer time = new Timer(100, this);
        time.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(p1.x, p1.y, 70, 30);
        g.setColor(Color.BLUE);
        g.fillRect(p2.x, p2.y, 20, 80);
    }

    public void actionPerformed(ActionEvent e) {
        p1.x += dx;
        p2.y += dy;
        if(p2.y <= 0 || p1.x + 70 >= getWidth()){
            dx = -dx;
        }if(p2.y <= 0 || p2.y + 80 >= getHeight()){
            dy = -dy;
        }
        repaint();
    }
}