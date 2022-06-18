
import javax.swing.*;
//import javax.swing.JOptionPane;
import java.awt.*;
public class Flight{
        public static void main(String[] args) {
        JFrame frame = new JFrame("Flight Registration Form");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(400,600);
        
        JLabel fname = new JLabel("First Name: ", SwingConstants.CENTER);
        JLabel mname = new JLabel("Middle Name: ", SwingConstants.CENTER);
        JLabel lname = new JLabel("Last Name: ", SwingConstants.CENTER);
        JLabel genderL = new JLabel("Gender: ", SwingConstants.CENTER);
        JLabel phoneContact = new JLabel("Contact: ", SwingConstants.CENTER);
        JLabel email = new JLabel("Email: ", SwingConstants.CENTER);
        JLabel origin = new JLabel("Origin: ", SwingConstants.CENTER);
        JLabel destination = new JLabel("Destination: ", SwingConstants.CENTER);
        JLabel fromDate = new JLabel("From Date: ", SwingConstants.CENTER);
        JLabel toDate = new JLabel("To Date: ", SwingConstants.CENTER);
        JLabel purpose = new JLabel("Purpose: ", SwingConstants.CENTER);
        
        JTextField fnameTF = new JTextField(15);
        JTextField mnameTF = new JTextField(15);
        JTextField lnameTF = new JTextField(15);
        JTextField phoneTF = new JTextField(10);
        JTextField emailTF = new JTextField(40);
        JTextField originTF = new JTextField(20);
        JTextField destinationTF = new JTextField(20);
        JTextField fromDateTF = new JTextField(10);
        JTextField toDateTF = new JTextField(10);
        JTextField purposeTF = new JTextField(80);
        
        JButton NewButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton cancelButton = new JButton("Cancel");
        JComboBox gender= new JComboBox(new String[]{"Male", "Female" });
        
        JPanel center = new JPanel(new GridLayout(11,2));
        center.add(fname);
        center.add(fnameTF);
        center.add(mname);
        center.add(mnameTF);
        center.add(lname);
        center.add(lnameTF);
        center.add(genderL);
        center.add(gender);
        center.add(phoneContact);
        center.add(phoneTF);
        center.add(email);
        center.add(emailTF);
        center.add(origin);
        center.add(originTF);
        center.add(destination);
        center.add(destinationTF);
        center.add(fromDate);
        center.add(fromDateTF);
        center.add(toDate);
        center.add(toDateTF);
        center.add(purpose);
        center.add(purposeTF);
        
        JPanel south = new JPanel(new FlowLayout());
        south.add(NewButton);
        south.add(saveButton);
        south.add(updateButton);
        south.add(cancelButton);
        
        frame.add(center, BorderLayout.CENTER);
        frame.add(south, BorderLayout.SOUTH);
        frame.setVisible(true);   
    }
}

