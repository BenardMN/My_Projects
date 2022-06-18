import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Flight_Registration implements ActionListener{
        JFrame frame = new JFrame("Flight Registration Form");
        
        private void size(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(400,600);}
        
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
        JComboBox gender;
        
        private void Registration(){
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
    Flight_Registration(){
        this.gender = new JComboBox(new String[] {"male", "female"});
        Registration();
        size();
        actionEvent();
    }
    private void actionEvent(){
        NewButton.addActionListener(this);
        saveButton.addActionListener(this);
        updateButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
        @Override
    public void actionPerformed(ActionEvent eft){
        if(eft.getSource() == saveButton){
            try{
                try (Connection con = DriverManager.getConnection("jdbc:mysql://;localhost 3306/`bernard`", "root", "")) {
                    String wre = "INSERT INTO flightregistration VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(wre);
                    pst.setString(1, fname.getText());
                    pst.setString(2, mname.getText());
                    pst.setString(3, lname.getText());
                    pst.setString(4, gender.getSelectedItem().toString());
                    pst.setInt(5, Integer.parseInt(phoneContact.getText()));
                    pst.setString(6, email.getText());
                    pst.setString(7, origin.getText());
                    pst.setString(8, destination.getText());
                    pst.setInt(9, Integer.parseInt(fromDate.getText()));
                    pst.setInt(10, Integer.parseInt(toDate.getText()));
                    pst.setInt(11, Integer.parseInt(toDate.getText()));
                    
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Regisration Successful!");
                }  
            }catch(HeadlessException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(eft.getSource() == NewButton || eft.getSource()== cancelButton){
            fnameTF.setText("");
            mnameTF.setText("");
            lnameTF.setText("");
            gender.setSelectedItem("male");
            phoneTF.setText("");
            emailTF.setText("");
            originTF.setText("");
            destinationTF.setText("");
            fromDateTF.setText("");
            toDateTF.setText("");
        }
    }
    public static void main(String[] args) {
    Flight_Registration f1 = new Flight_Registration();
    f1.size();
    f1.Registration();
    }
}

