//import java.awt.*;
import javax.swing.*;
public class MyClass{
    public static void main(String[] args){
        //JFrame frame = new JFrame("My Class");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 400);
        //frame.setLayout(new FlowLayout());

        String name = JOptionPane.showInputDialog(null, "What's your name?");
        int choice = JOptionPane.showConfirmDialog(null, "Do you like coding " + name);
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of course who doesn't!");
        }else{
            JOptionPane.showMessageDialog(null, "You better start...it's fun!");
        }
        //frame.setVisible(true);
    }
}