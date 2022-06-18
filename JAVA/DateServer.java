import java.io.*;
import java.net.*;
import java.util.Date;
public class DateServer {
    public static void main(String[] args) throws IOException{
       try(var listener = new ServerSocket(59090)){
           System.out.println("The date server is running....");
           while(true){
               try(var socket = listener.accept()){
                   var out = new PrintWriter(socket.getOutputStream(), true);
                   out.println(new Date().toString());
               }
           }
       } 
    }
}
