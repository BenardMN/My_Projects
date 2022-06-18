import java.util.Scanner;
public class student{
    Scanner sc = new Scanner(System.in);
    int mark1, mark2, mark3, mark4, mark5, mark6, avg;

    public void getMarks(){
        System.out.println("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.println("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.println("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
        System.out.println("Enter marks for Subject 4: ");
        mark4 = sc.nextInt();
        System.out.println("Enter marks for Subject 5: ");
        mark5 = sc.nextInt();
        System.out.println("Enter marks for Subject 6: ");
        mark6 = sc.nextInt();
    }
    public int AverageMark(){
        int avg;
        avg = (mark1 + mark2 + mark3 + mark4 + mark5 + mark6)/6;
        System.out.println("Average mark: " + avg);
        return avg;
    }
    public void FinalGrade(){
        if(avg > 70){
            System.out.println("Mean Grade: A");
        }else if(avg < 70){
            System.out.println("Mean Grade: B");
        }else if(avg < 60){
            System.out.println("Mean Grade: C");
        }else if(avg < 50){
            System.out.println("Mean Grade: D");
        }else if(avg < 40){
            System.out.println("Mean Grade: E");
        }
    }
    public static void main(String[] args) {
        student t = new student();
        t.getMarks();
        t.AverageMark();
        t.FinalGrade();
        t = null;
        System.gc();
    }
    public void finalize() {
        System.out.println("Garbage collected");
    }
}