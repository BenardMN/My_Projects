/* Task: Program to print out names entered by user
 * Programmer: Bernard Muinde
 * Date: 7/11/2021 
 */
import java.io.*;
public class Greeting {
    public static void main(String args[]) throws IOException {
        String firstName, lastName;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your first name: ");
        firstName = stdin.readLine();
        System.out.print("Enter your last name: ");
        lastName = stdin.readLine();
        System.out.println("-------------------------");
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
