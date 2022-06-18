import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CreditCardVerify implements ActionListener{
    public static void main(String args[]) {
        CreditCardVerify gui = new CreditCardVerify();
    }
    private final JFrame frame;
    private final JTextField numberField;
    private final JLabel validLabel;
    private final JButton verifyButton;
    
    public CreditCardVerify(){
        numberField = new JTextField(16);
        validLabel = new JLabel("NOT YET VERIFIED");
        verifyButton = new JButton("Verify CC Number");
        
        //event listener
        verifyButton.addActionListener(this);
        
        frame = new JFrame("Credit Card Number Verifier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 300));
        frame.setLayout(new FlowLayout());
        frame.add(numberField);
        frame.add(verifyButton);
        frame.add(validLabel);
        frame.setVisible(true);    
    }
    //returns whether the given string is a valid credit card number according to Luhn checksum algorithm
    public boolean isValidCC(String text){
        int sum = 0;
        for (int i = text.length() - 1; i >= 0; i--){
            int digit = Integer.parseInt(text.substring(i, i + 1));
            if (i % 2 == 0){  
                digit *= 2;
            }
            sum += (digit / 10) + (digit % 10);
        }
        return sum % 10 == 0 && text.startsWith("4");
    }
    //sst label to show whether CC number is valid
    @Override
    public void actionPerformed(ActionEvent event){
        String text = numberField.getText();
        if (isValidCC(text)){
            validLabel.setText("Valid CC number!");
        } else{
            validLabel.setText("Invalid CC number!");
        }
    }
}
