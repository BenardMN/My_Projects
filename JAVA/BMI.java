//GUI to compute a person's body mass index
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BMI implements ActionListener{
    public static void main(String args[]) {
        BMI gui = new BMI();
    }
    private final JFrame frame;
    private final JTextField heightField;
    private final JTextField weightField;
    private final JLabel bmiLabel;
    private final JButton computeButton;
    
    public BMI(){
        heightField = new JTextField(5);
        weightField = new JTextField(5);
        bmiLabel = new JLabel("Type your height and weight");
        computeButton = new JButton("Compute");
        
        //atttach event listener to compute button
        computeButton.addActionListener(this);
        
        //layout
        JPanel north = new JPanel(new GridLayout(2, 3));
        north.add(new JLabel("Height: "));
        north.add(heightField);
        north.add(new JLabel("Weight: "));
        north.add(weightField);
        
        //overall frame
         frame = new JFrame("BMI");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new BorderLayout());
         frame.add(north, BorderLayout.NORTH);
         frame.add(bmiLabel, BorderLayout.CENTER);
         frame.add(computeButton, BorderLayout.SOUTH);
         frame.setSize(new Dimension(600, 400));
         frame.setVisible(true);
        }
    //handle clicks on compute button by computing the BMI
    @Override
    public void actionPerformed(ActionEvent event){
        //read height and weight
        String heightText = heightField.getText();
        double height = Double.parseDouble(heightText);
        String weightText = weightField.getText();
        double weight = Double.parseDouble(weightText);
        
        double bmi= weight/(height * height) * 703;
        bmiLabel.setText("BMI: " + bmi);
    }
}
