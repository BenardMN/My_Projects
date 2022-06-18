import java.awt.*;
import javax.swing.*;
public class JavaForm {
     public static void main(String args[]) {
     JFrame frame = new JFrame("Login Form");
     frame.setSize(800, 600);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(new GridLayout(5, 2));
     //Add components to the frame
     frame.add(new JLabel("First Name"));
     frame.add(new JTextField(10));
     frame.add(new JLabel("Last Name"));
     frame.add(new JTextField(10));
     frame.add(new JLabel("Gender"));
     frame.add(new JTextField(4));
     
     frame.setVisible(true);
    }
}
