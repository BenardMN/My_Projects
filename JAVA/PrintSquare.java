import java.util.Scanner;
public class PrintSquare{
    public static void main(String[] args){
        int square;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int Userinput = sc.nextInt();
        square = Userinput * Userinput;
        System.out.println("Square is: "+ square);
        sc.close();
    }
}