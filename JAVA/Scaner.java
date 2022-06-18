/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Scaner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your current weight: ");
        float weight = sc.nextFloat();
        System.out.println("\n Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
        sc.close();
    }
}
