import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ChatClient {
    String serverAddress;
    Scanner in;
    PrintWriter out;
    JFrame frame = new JFrame("Chat Application");
    JTextField textField = new JTextField(50);
    JTextArea messageArea = new JTextArea(16, 50);

    public ChatClient(String serverAddress){
        this.serverAddress = serverAddress;

        textField.setEditable(false);
        messageArea.setEditable(false);
        frame.getContentPane().add(textField, BorderLayout.SOUTH);
        frame.getContentPane().add(new JScrollPane(messageArea), BorderLayout.CENTER);
        frame.pack();

        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                out.println(textField.getText());
                textField.setText("");
            }
        });
    }
    private String getName(){
        return JOptionPane.showInputDialog(frame, "Choose a User Name: ", JOptionPane.PLAIN_MESSAGE);
    }
    private void run() throws IOException{
        try{
            var socket = new Socket(serverAddress, 59001);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(), true);

            while(in.hasNextLine()){
                var line = in.nextLine();
                if(line.startsWith("SUBMITNAME")){
                    out.println(getName());
                }else if(line.startsWith("NAMEACCEPTED")){
                    this.frame.setTitle("Chat Application - " + line.substring(13));
                    textField.setEditable(true);
                }else if(line.startsWith("MESSAGE")){
                    messageArea.append(line.substring(8) + "\n");
                }
            }socket.close();
        }finally{
            frame.setVisible(true);
            frame.dispose();
        } 
    }
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Pass the server IP address as the sole command line argument");
            return;
        }
        var client = new ChatClient(args[0]);
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.frame.setVisible(true);
        try {
            client.run();
        } catch (IOException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}
