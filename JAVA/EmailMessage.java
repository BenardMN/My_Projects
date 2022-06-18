import java.awt.*;
import javax.swing.*;
public class EmailMessage {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Send Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 300));
        frame.setLayout(new BorderLayout());
        
        JPanel northWest = new JPanel(new GridLayout(3, 1));
        northWest.add(new JLabel("From: "));
        northWest.add(new JLabel("To: "));
        northWest.add(new JLabel("Subject:"));
        
        JPanel northCenter = new JPanel(new GridLayout(3, 1));
        northCenter.add(new JTextField(15));
        northCenter.add(new JTextField(15));
        northCenter.add(new JTextField(15));
        
        JPanel northEast = new JPanel(new GridLayout(3, 1));
        northEast.add(new JButton("Browse..."));
        northEast.add(new JButton("Browse..."));
        
        JPanel north = new JPanel(new FlowLayout());
        north.add(northWest, BorderLayout.WEST);
        north.add(northCenter, BorderLayout.CENTER);
        north.add(northEast, BorderLayout.EAST);
        
        JPanel south = new JPanel(new FlowLayout());
        south.add(new JButton("Send"));
        
        frame.add(north, BorderLayout.NORTH);
        frame.add(new JTextArea(), BorderLayout.CENTER);
        frame.add(south, BorderLayout.SOUTH);
        
        frame.setVisible(true);   
    }
}
