import java.awt.*;
import javax.swing.*;
public class TextArea {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Text Area");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 200));
        frame.setLayout(new FlowLayout());
       
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setFont(new Font("Serif", Font.BOLD, 14));
        frame.add(textArea);
        frame.add(new JScrollPane(textArea));
        
        frame.setVisible(true);  
    }
}
