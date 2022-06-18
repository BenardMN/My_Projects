import javax.swing.*;
import java.awt.*;
public class TextFieldTest{
    public static void main(String args[]) {
        // TODO code application logic here
        JFrame frame = new JFrame("Practice File");
        frame.setSize(800, 600);
        frame.setLocation(50, 50);  //x and y from upper-left corner
        frame.setLayout(new FlowLayout());
        
        JLabel first, last;
        first = new JLabel("Enter your first name");
        last = new JLabel("Enter your last name");
        
        JTextField firstTF, lastTF;
        firstTF = new JTextField(15);
        lastTF = new JTextField(15);
        
        JButton done;
        done = new JButton("Done");
        
        frame.add(first);
        frame.add(firstTF);
        frame.add(last);
        frame.add(lastTF);
        frame.add(done);
        frame.setVisible(true);
        
    }
}
