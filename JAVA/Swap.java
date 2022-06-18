public class Swap {
    public int num1, num2, temp;
    public void getNumber(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println("Original values: num1 = " + num1 +" num2 = " + num2);
    }
    public void swapNumber(){
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = "+ num1 + " num2 = " + num2);
    }
    public static void main(String[] args) {
        Swap obj = new Swap();
        obj.getNumber(5, 9);
        obj.swapNumber();
    }
}
