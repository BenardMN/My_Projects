import java.awt.*;
import javax.swing.*;
public class MyFlowLayout {
    public static void main(String args[]){
    JFrame frame = new JFrame("My Flow Layout");
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton  b4 = new JButton("4");
    JButton b5 = new JButton("");
    b5.setIcon(new ImageIcon("user-icon.jpg"));
        
    frame.add(b1);
    frame.add(b2);
    frame.add(b3);
    frame.add(b4);
    frame.add(b5);
        
    frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
    frame.setSize(300,300);
    frame.setVisible(true);
    }
}
 
