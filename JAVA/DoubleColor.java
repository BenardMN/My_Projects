import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class DoubleColor {
    public static void main(String[] args) {
        Runnable runner;
        runner = new Runnable(){
            @Override
            public void run(){
                JFrame frame = new JFrame("Double Colr Chooser");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JColorChooser left = new JColorChooser();
                left.setDragEnabled(true);
                frame.add(left, BorderLayout.WEST);

                JColorChooser right = new JColorChooser();
                right.setDragEnabled(true);
                frame.add(right, BorderLayout.EAST);

                frame.pack();
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
