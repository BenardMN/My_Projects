import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.Executors;
public class ChatServer {
    //all client names...we check duplicates on registration
    private static Set<String> names = new HashSet<>();
    //set of all print writers or clients, used for broadcasting
    private static Set<PrintWriter> writers = new HashSet<>();
    public static void main(String[] args) throws Exception {
        System.out.println("The chat server is running...");
        var pool = Executors.newFixedThreadPool(500);
        try(var listener = new ServerSocket(59001)){
            while(true){
                pool.execute(new Handler(listener.accept()));
            }
        }
    }
    //client handler task
    private static class Handler implements Runnable{
        private String name;
        private Socket socket;
        private Scanner in;
        private PrintWriter out;

        public Handler(Socket socket){
            this.socket = socket;
        }
        public void run(){
            try{
               in = new Scanner(socket.getInputStream());
               out = new PrintWriter(socket.getOutputStream(), true);
               //request fo a unique name
               while(true){
                   out.println("SUBMITNAME");
                   name = in.nextLine();
                   if(name == null){
                      return;
                    } 
                    synchronized (names){
                      if(!names.isEmpty() && !names.contains(name)){
                         names.add(name);
                         break;
                        }
                    }
                }
                out.println("NAMEACCEPTED " + name);
                for(PrintWriter writer : writers){
                 writer.println("MESSAGE " + name + " has joined");
                }
                writers.add(out);
                while(true){
                 String input = in.nextLine();
                 if(input.toLowerCase().startsWith("/quit")){
                     return;
                   }
                   for(PrintWriter writer : writers){
                      writer.println("MESSAGE" + name + ": " + input);
                   }
                }
            }catch(Exception e){
              System.out.println(e);
            }finally{
                 if(out != null){
                 writers.remove(out);
                }
                if(name != null){
                 System.out.println(name + " is leaving");
                 names.remove(name);
                 for(PrintWriter writer : writers){
                     writer.println("MESSAGE " + name + " has left");
                    }
                }
                try {
                 socket.close();
                } catch (Exception e) {
                  //handle exception
                }
            }
        } 
    }
}