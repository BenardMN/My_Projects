/* Task: Program to read letters entered, prints them in uppercase
 * 
 * Programmer: Bernard Muinde
*/
import java.io.*;
public class ListLetters {
    public static void main(String args[]) throws IOException{
        String str;
        BufferedReader stdr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line of string: ");
        str = stdr.readLine();
        str = str.toUpperCase();
        System.out.println(str.toUpperCase());
    }        
}

