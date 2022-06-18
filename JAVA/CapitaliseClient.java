import java.io.*;
import java.net.*;
import java.util.*;
public class CapitaliseClient {
    public static void main(String[] args) throws Exception{
        if(args.length != 1){
            System.out.println("Pass the sever IP as the sole command line argument");
            return;
        }
        try(var socket = new Socket(args[0], 59898)){
            System.out.println("Enter lines of text then Ctrl+D or Ctrl+C to quit");
            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
            while(scanner.hasNextLine()){
                out.println(scanner.nextLine());
                System.out.println(in.nextLine());
            }
            scanner.close();
        }
    }
}
