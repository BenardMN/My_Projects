import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jdk.internal.platform.Container;

public class Bounce {
    public static void main(String[] args){
        JFrame frame = new BounceFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class Ball{
    public void move(Rectangle2D bounds){
        x += dx;
        y += dy;
        if(x < bounds.getMinX()){
            x = bounds.getMinX();
            dx = -dx;
        }
        if(x + XSIZE >= bounds.getMaxX()){
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }
        if(y < bounds.getMinY()){
            y = bounds.getMinY();
            dy = -dy;
        }
        if(y + YSIZE >= bounds.getMaxY()){
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }
    }
    public Shape getShape(){
        return (Shape) new Ellipse2D(x, y, XSIZE, YSIZE);
    }
    private static final int XSIZE = 15;
    private static final int YSIZE = 15;
    private double x = 0, y = 0, dx = 1, dy = 1;
}
class BallPanel extends JPanel{
    public void add(Ball b){
        balls.add(b);
    }
    public void paintComponent(Graphics2D g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Ball b : balls){
            g2.fill(b.getShape());
        }
    }
    private ArrayList<Ball> balls = new ArrayList<Ball>();
}
class BounceFrame extends JFrame{
    public BounceFrame(){
        setSize(600, 400);
        setTitle("Bounce Ball");

        panel = new BallPanel();
        add(panel, BorderLayout.CENTER);
        JPanel buttoPanel = new JPanel();
        addButton(buttoPanel, "Start",
        new ActionListener(){
            public void actionPerformed(ActionEvent event){
                addBall();
            }
        });
        addButton(buttoPanel, "Close",
        new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        add(buttoPanel, BorderLayout.SOUTH);
    }
    public <Container> void addButton(Container c, String title, ActionListener listener){
        JButton button = new JButton(title);
        ((Rectangle2D) c).add(button);
        button.addActionListener(listener);
    }
    public void addBall(){
        try {
            Ball ball = new Ball();
            panel.add(ball);

            for(int i = 1; i <= STEPS; i++){
                ball.move(panel.getBounds());
                panel.paint(panel.getGraphics());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
        }
    }
    private final BallPanel panel;
    public static final int STEPS = 1000;
    public static final int DELAY = 3;
}