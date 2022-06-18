import javax.swing.*;
public class RectangleOptionPane {
    public static void main(String[] args) {
        String lengthtext = JOptionPane.showInputDialog(null, "Enter the length: ");
        int length = Integer.parseInt(lengthtext);
        String widthtext = JOptionPane.showInputDialog(null, "Enter the width: ");
        int width = Integer.parseInt(widthtext);
        JOptionPane.showMessageDialog(null, "Length: " + length +
         "\nWidth: " + width + 
         "\nPerimeter: " + 2*(length + width) +
         "\nArea: " + length*width);
    }
}
