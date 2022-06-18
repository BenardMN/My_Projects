import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class TipOfDay extends JDialog {
    public TipOfDay(){
        setTitle("Tip of the Day");

        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);

        JPanel topPanel = new JPanel(new BorderLayout(0, 0));
        topPanel.setMaximumSize(new Dimension(450, 0));
        JPanel hint = new JPanel();
        hint.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        topPanel.add(hint);

        ImageIcon icon = new ImageIcon("codebg.jpeg");
        JLabel label = new JLabel(icon);
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.add(label, BorderLayout.EAST);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.gray);
        topPanel.add(separator, BorderLayout.SOUTH);

        basic.add(topPanel);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        JTextPane pane = new JTextPane();
        String text = "Closing windows using the mouse wheel" + 
        "Clicking with the mouse wheel  on an editor tab closes the window." +
        "This method works also with dockable windows or Log window tabs.";
        pane.setText(text);
        pane.setEditable(false);
        textPanel.add(pane);
        basic.add(textPanel);

        JPanel boxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 0));
        JCheckBox box = new JCheckBox("Show Tips at Startup");
        box.setMnemonic(KeyEvent.VK_S);
        boxPanel.add(box);
        basic.add(boxPanel);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton ntip = new JButton("Next Tip");
        ntip.setMnemonic(KeyEvent.VK_N);
        JButton close = new JButton("Close");
        close.setMnemonic(KeyEvent.VK_C);

        bottom.add(ntip);
        bottom.add(close);
        basic.add(bottom);

        bottom.setMaximumSize(new Dimension(450, 0));
        setSize(new Dimension(450, 350));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TipOfDay();
    }
}
