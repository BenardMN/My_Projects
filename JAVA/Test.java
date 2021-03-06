import javax.swing.*;
import java.awt.*;
public class Test {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));
        
        JLabel firstL, secondL, genderL, ageL;
        firstL = new JLabel("First name: ", SwingConstants.RIGHT);
        secondL = new JLabel("Last Name: ", SwingConstants.RIGHT);
        genderL = new JLabel("Gender: ", SwingConstants.RIGHT);
        ageL = new JLabel("Age: ", SwingConstants.RIGHT);
        
        JTextField firstTF, secondTF, ageTF;
        firstTF = new JTextField(10);
        secondTF = new JTextField(10);
        ageTF = new JTextField(10);
        
        JButton okB, cancelB;
        okB = new JButton("OK");
        okB.setBackground(Color.RED);
        cancelB = new JButton("Cancel");
        cancelB.setBackground(Color.PINK);
        
        JComboBox jcombo = new JComboBox(new String[]{"Male", "Female" });
        
        frame.add(firstL);
        frame.add(firstTF);
        frame.add(secondL);
        frame.add(secondTF);
        frame.add(genderL);
        frame.add(jcombo);
        frame.add(ageL);
        frame.add(ageTF);
        frame.add(okB);
        frame.add(cancelB);
        
        frame.setVisible(true);
    }
}
