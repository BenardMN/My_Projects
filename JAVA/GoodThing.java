import java.awt.*;
import javax.swing.*;
public class GoodThing {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Good Thing I Studied!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(385, 200);
        frame.setLayout(new BorderLayout());
        
        JPanel north = new JPanel(new FlowLayout());
        north.add(new JButton("Button1"));
        north.add(new JButton("Button2"));
        north.add(new JButton("Button3"));
        
        JPanel center = new JPanel(new GridLayout(2,2));
        center.add(new JButton("Button4"));
        center.add(new JButton("Button5"));
        center.add(new JButton("Button6"));
        center.add(new JButton("Button7"));
        
        JPanel south = new JPanel(new FlowLayout());
        south.add(new JLabel("Type Stuff:"));
        south.add(new JTextField(10));
        
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(south, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
