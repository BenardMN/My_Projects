import javax.swing.*;
public class HelloWord {
    public static void main(String args[]) {
        // Read the user's name graphically
        String name = JOptionPane.showInputDialog(null, "What is our name?");
        //ask the usr yes/no question
        int choice = JOptionPane.showConfirmDialog(null, "Do you have a girlfriend, " + name+ "?");
        //show different respons depending on answer
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of course! Who doesn't?");
        }else{
            JOptionPane.showMessageDialog(null, "You better go get one!");
        }
    }
}
