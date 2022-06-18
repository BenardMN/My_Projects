import javax.swing.*;
public class UseOptionPane {
    public static void main(String args[]) {
        String ageText = JOptionPane.showInputDialog(null, "How old are you?");
        int age = Integer.parseInt(ageText);
        String moneyText = JOptionPane.showInputDialog(null, "How much money do you have?");
        double money = Double.parseDouble(moneyText);
        JOptionPane.showMessageDialog(null, """
                                            If you can double your money each year,
                                            You'll have""" + (money*32) + "shillings at age" + (age+5) + "!");    
    }
}
