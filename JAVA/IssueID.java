import java.util.Scanner;
public class IssueID {
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String Fname = sc.nextLine().toUpperCase();
        System.out.println("Enter your middle name:");
        String Sname = sc.nextLine().toUpperCase();
        System.out.println("Enter your nationality:");
        String nationality = sc.nextLine().toUpperCase();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        sc.close();
        System.out.println("NAME: " + Fname +" "+ Sname);
        System.out.println("AGE: " + age +" NATIONALITY: " + nationality);
        if(age<18){
            throw new ArithmeticException("Youre underage");}
            else
            System.out.println("Issue national id");
        }
    public static void main(String[] args) {
       IssueID done = new IssueID();
       done.display();
    }
}