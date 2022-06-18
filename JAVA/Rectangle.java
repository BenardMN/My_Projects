import java.util.Scanner;
public class Rectangle {
    Scanner sc = new Scanner(System.in);
    int width, length, perimeter, area;

    public void Measurements(){
        System.out.println("Enter length: ");
        length = sc.nextInt();
        System.out.println("Enter breadth: ");
        width = sc.nextInt();
    }
    public int Perimeter(){
        perimeter = (length + width) *2;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }
    public int Area(){
        area = length * width;
        System.out.println("Area: " + area);
        return area;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.Measurements();
        rect.Perimeter();
        rect.Area();
    }
}
