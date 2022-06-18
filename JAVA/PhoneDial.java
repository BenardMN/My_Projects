import java.awt.*;
import javax.swing.*;
public class PhoneDial {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(250, 200));
        frame.setTitle("Telephone");
        
        frame.setLayout(new BorderLayout());
        
        //north panel
        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.add(new JTextField(10));
        frame.add(northPanel, BorderLayout.NORTH);
        
        //phone buttons
        JPanel centerPanel = new JPanel(new GridLayout(4, 3));
        for(int i = 1; i <= 9; i++){
            centerPanel.add(new JButton(" " + i));
        }
        centerPanel.add(new JButton("*"));
        centerPanel.add(new JButton("0"));
        centerPanel.add(new JButton("#"));
        frame.add(centerPanel, BorderLayout.CENTER);
        
        frame.setVisible(true);    
    }
}
