import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class TreeArraySample {
    public static void main(String[] args) {
        Runnable runner = new Runnable(){
            public void run(){
                JFrame frame = new JFrame("JTree Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Vector<String> oneVector = new NamedVector<String>("One", args);
                Vector<String> twoVector = new NamedVector<String>("Two", new String[]{"Mercury", "Venus", "Mars"});
                Vector<Object> threeVector = new NamedVector<Object>("Three");
                threeVector.add(System.getProperties());
                threeVector.add(twoVector);
                Object rootNodes[] = {oneVector, twoVector, threeVector};
                Vector<Object> rootVector = new NamedVector<Object>("Root", rootNodes);
                JTree tree = new JTree(rootVector);
                JScrollPane scrollPane = new JScrollPane(tree);
                frame.add(scrollPane, BorderLayout.CENTER);
                frame.setSize(600, 400);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
