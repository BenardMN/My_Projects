import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Hello my name is "+ address.getHostName() +" and my IP address is "+ address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("I'm sorry. I don't know my name and address.");
        }
    }
}
